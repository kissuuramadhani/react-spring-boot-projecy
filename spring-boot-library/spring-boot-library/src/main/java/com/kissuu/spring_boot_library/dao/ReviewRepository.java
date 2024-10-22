package com.kissuu.spring_boot_library.dao;

import com.kissuu.spring_boot_library.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Page<Review> findByBookId(@RequestParam("book_id") Integer bookId, Pageable pageable);
}
