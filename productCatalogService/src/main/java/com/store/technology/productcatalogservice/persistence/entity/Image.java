package com.store.technology.productcatalogservice.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "images")
@Data
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_image")
    private String idImage;
    private String url;
    @Column(name = "id_product")
    private String idProduct;
    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    @JsonIgnore
    private Product product;
}
