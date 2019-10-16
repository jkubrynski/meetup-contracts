package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method('GET')
		url('/carts/123')
		headers {
			header('Accept', 'application/json;charset=UTF-8')
		}
	}

	response {
		status(200)
		headers {
			header('Content-Type', 'application/json;charset=UTF-8')
		}
		body([
			'cartId': '123',
			'status': 'ACTIVE'
		])
	}
}
