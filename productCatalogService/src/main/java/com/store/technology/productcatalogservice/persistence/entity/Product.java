package com.store.technology.productcatalogservice.persistence.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_product")
    private String idProduct;
    @Column(name = "name_product")
    private String nameProduct;
    private String description;
    private Double price;
    private Integer stock;
    private String idCategory;

}
