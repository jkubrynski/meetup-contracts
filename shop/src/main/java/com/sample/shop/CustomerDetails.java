package com.sample.shop;

class CustomerDetails {

	private final String customerId;
	private final String cartStatus;

	CustomerDetails(String customerId, String cartStatus) {
		this.customerId = customerId;
		this.cartStatus = cartStatus;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCartStatus() {
		return cartStatus;
	}
}
