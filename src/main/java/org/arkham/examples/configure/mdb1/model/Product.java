package org.arkham.examples.configure.mdb1.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
@Data
@Document(collection = "tbc_products")
public class Product {

    @Id
    @ToString.Exclude
    private String id;

    private String name;

    private BigDecimal price;

    private Integer stock;

    private String description;

    private String category;

}
