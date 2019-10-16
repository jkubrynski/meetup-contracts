package com.sample.cart;

import org.springframework.stereotype.Service;

@Service
class CartService {

	CartDetails getCart(String cartId) {
		return new CartDetails(cartId, cartId.startsWith("1") ? CartStatus.ACTIVE : CartStatus.CANCELED);
	}
}
