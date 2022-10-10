package com.java.circuitbreakerresilience.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

@FeignClient(name = "ProductPrice" , url = "localhost:8080/")
public interface ProductPriceClient {
    ResponseEntity<Integer> getPrice(String product);
}
