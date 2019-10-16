package com.sample.cart;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
class CartController {

	private final CartService cartService;

	CartController(CartService cartService) {
		this.cartService = cartService;
	}

	@GetMapping(value = "/{cartId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	CartDetails getCartDetails(@PathVariable String cartId) {
		return cartService.getCart(cartId);
	}
}
