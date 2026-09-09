package com.codingshuttle.razorpay.merchant.service.impl;

import com.codingshuttle.razorpay.common.enums.MerchantStatus;
import com.codingshuttle.razorpay.common.enums.UserRole;
import com.codingshuttle.razorpay.merchant.dto.request.MerchnantSignupRequest;
import com.codingshuttle.razorpay.merchant.dto.response.MerchantResponse;
import com.codingshuttle.razorpay.merchant.entity.AppUser;
import com.codingshuttle.razorpay.merchant.entity.Merchant;
import com.codingshuttle.razorpay.merchant.repository.AppUserRepository;
import com.codingshuttle.razorpay.merchant.repository.MerchantRepository;
import com.codingshuttle.razorpay.merchant.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//Why are we doing it like this, this is loose coupling. But why are we doing this ?
//We are doing it this way because our auth can change in the near future we might change it,
//so that is why we take an Interface and try to make different implementations as we move forward.

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    private final AppUserRepository appUserRepository;
    private final MerchantRepository merchantRepository;

    @Override
    public MerchantResponse signup(MerchnantSignupRequest request) {
        if(merchantRepository.existsByEmail(request.email())) {
            throw new RuntimeException(("Merchant with email already exists."+request.email()));
        }
        Merchant merchant = Merchant.builder()
                .businessName(request.businessName())
                .businessType(request.businessType())
                .name(request.name())
                .email(request.email())
                .status(MerchantStatus.PENDING_KYC)
                .build();
        merchant = merchantRepository.save(merchant);

        AppUser appUser = AppUser.builder()
                .email(request.email())
                .merchant(merchant)
                .passwordHash(request.password()) //TODO: encrypt with Bcrypt
                .role(UserRole.OWNER)
                .build();
        appUserRepository.save(appUser);


        return new MerchantResponse(merchant.getId(), merchant.getName(),
                merchant.getEmail(), merchant.getBusinessName(),
                merchant.getBusinessType(), merchant.getStatus());
    }
}
