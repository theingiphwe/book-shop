package com.example.bookshop.dto;

import java.time.LocalDate;

public record BookDto(
        int id,
        String title,
        double price,
        String author,
        String imageUrl,
        LocalDate publishedDate,
        String category

) {
}
