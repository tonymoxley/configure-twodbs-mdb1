package org.arkham.examples.configure.mdb1.repository;

import org.arkham.examples.configure.mdb1.model.Category;
import org.arkham.examples.configure.mdb1.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    /**
     *
     * @param category
     * @return
     */
    List<Product> findProductByCategory(Category category);

    /**
     *
     * @param name
     * @return
     */
    List<Product> findProductByName(String name);

}
