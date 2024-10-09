package com.microdoc.bookservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import java.math.BigDecimal;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "ISBN", unique=true)
    @NaturalId
    private String isbn;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "CURRENCY")
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Column(name = "IS_VISIBLE")
    private boolean isVisible;

    @Column(name = "COVER_URL")
    private String coverUrl;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "AUTHOR")
    private String author;
}
