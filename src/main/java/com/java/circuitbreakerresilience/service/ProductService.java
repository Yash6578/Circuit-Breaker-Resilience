package com.java.circuitbreakerresilience.service;

import com.java.circuitbreakerresilience.client.ProductPriceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    final ProductPriceClient productPriceClient;


    
}
