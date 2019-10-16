package com.sample.shop;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureStubRunner(ids = "com.sample:cart:+:stubs")
public class CartClientTest {

	@Autowired
	CartClient cartClient;

	@Test
	public void shouldRetrievePaymentStatus() {
		// when
		CartDetails cartDetails = cartClient.getCartDetails("123");
		// then
		assertThat(cartDetails).isNotNull();
		assertThat(cartDetails.getCartId()).isEqualTo("123");
		assertThat(cartDetails.getStatus()).isEqualTo("ACTIVE");
	}
}