package com.bhuwan.billing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/billing")
public class BillingController {

    @GetMapping
    public String billing() {
        return "Billing Service:::v1.0.0";
    }

}

