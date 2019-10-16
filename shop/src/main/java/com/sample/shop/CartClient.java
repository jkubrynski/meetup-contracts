package com.sample.shop;

import java.net.URI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
class CartClient {

	private final RestTemplate restTemplate;

	CartClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	CartDetails getCartDetails(String customerId) {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_UTF8_VALUE);
		RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET,
				URI.create("http://cart/carts/" + customerId));

		return restTemplate.exchange(requestEntity, CartDetails.class).getBody();
	}
}
