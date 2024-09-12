package com.store.technology.productcatalogservice.persistence.entity;

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
}
