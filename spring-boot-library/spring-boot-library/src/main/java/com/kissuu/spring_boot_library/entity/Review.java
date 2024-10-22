package com.kissuu.spring_boot_library.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import java.util.Date;

@Entity
@Table(name = "review")
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "date")
    @CreationTimestamp
    private Date date;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "book_id")
    private Integer bookId;
    @Column(name = "review_description")
    private String reviewDescription;
}
