package com.hatanaka.ecommerce.checkout.resource.checkout;

import com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.hatanaka.ecommerce.checkout.service.CheckoutService;
import com.hatanaka.ecommerce.checkout.service.CheckoutServiceImpl;
import com.hatanaka.ecommerce.checkout.streaming.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {
    
    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest) {
        checkoutService.create(checkoutRequest);
        return ResponseEntity.ok().build();
    }
}
