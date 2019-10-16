package com.sample.cart;

class CartDetails {

	private final String cartId;
	private final CartStatus status;

	CartDetails(String cartId, CartStatus status) {
		this.cartId = cartId;
		this.status = status;
	}

	public String getCartId() {
		return cartId;
	}

	public CartStatus getStatus() {
		return status;
	}
}

enum CartStatus {
	ACTIVE, CANCELED
}
