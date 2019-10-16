package com.sample.cart;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.mockito.Mockito;

public class AbstractContractTests {

	@Before
	public void setUp() {
		CartService cartServiceMock = Mockito.mock(CartService.class);

		Mockito.when(cartServiceMock.getCart("123")).thenReturn(new CartDetails("123", CartStatus.ACTIVE));

		RestAssuredMockMvc.standaloneSetup(new CartController(cartServiceMock));
	}
}
