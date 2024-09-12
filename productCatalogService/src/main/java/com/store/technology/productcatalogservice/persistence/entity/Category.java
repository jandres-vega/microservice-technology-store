package com.store.technology.productcatalogservice.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_category")
    private String idCategory;
    @Column(name = "name_category")
    private String nameCategory;
    private String description;
}
