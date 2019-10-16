package com.sample.shop;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
class CustomerController {

	private final CartClient cartClient;

	CustomerController(CartClient cartClient) {
		this.cartClient = cartClient;
	}

	@GetMapping(value = "/{customerId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	CustomerDetails getCustomerDetails(@PathVariable String customerId) {
		CartDetails cartDetails = cartClient.getCartDetails(customerId);
		return new CustomerDetails(customerId, cartDetails.getStatus());
	}
}
