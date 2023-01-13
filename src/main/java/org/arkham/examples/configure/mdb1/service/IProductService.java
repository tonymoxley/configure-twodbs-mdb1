package org.arkham.examples.configure.mdb1.service;

import org.arkham.examples.configure.mdb1.model.Category;
import org.arkham.examples.configure.mdb1.model.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
public interface IProductService {

    /**
     *
     * @param product
     * @return
     */
    Optional<Product> saveProduct(String username, Product product);

    /**
     *
     * @param category
     * @return
     */
    List<Product> getProductsByCategory(String username, Category category);

    /**
     *
     * @param name
     * @return
     */
    List<Product> getProductsByName(String username, String name);

}
