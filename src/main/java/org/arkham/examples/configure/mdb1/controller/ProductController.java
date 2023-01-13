package org.arkham.examples.configure.mdb1.controller;

import lombok.extern.slf4j.Slf4j;
import org.arkham.examples.configure.mdb1.model.Product;
import org.arkham.examples.configure.mdb1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @@author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final IProductService service;

    @Autowired
    public ProductController(IProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(
            @RequestHeader("user-name") String username, @RequestBody Product product) {
        final Optional<Product> saveProduct = this.service.saveProduct(username, product);
        if (saveProduct.isPresent()) {
            log.info("saved product: {}", saveProduct.get());
            return new ResponseEntity<>(saveProduct.get(), HttpStatus.CREATED);
        } else {
            log.error("error when registering the product");
            return ResponseEntity.internalServerError().build();
        }
    }

}
