package com.enes.ecommerce.service;

import com.enes.ecommerce.dto.PaymentInfo;
import com.enes.ecommerce.dto.Purchase;
import com.enes.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
