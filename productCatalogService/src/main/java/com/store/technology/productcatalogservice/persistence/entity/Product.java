package com.store.technology.productcatalogservice.persistence.entity;
import com.store.technology.productcatalogservice.persistence.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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
    @Enumerated(EnumType.STRING)
    private ProductStatus status = ProductStatus.INCOMPLETE;
    private Integer stock;
    @Column(name = "id_category")
    private String idCategory;
    @ManyToOne
    @JoinColumn(name = "id_category", insertable = false, updatable = false)
    private Category category;
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private List<Image> images;

}
