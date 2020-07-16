package com.example.heroku.service;

import com.example.heroku.dto.BookDto;
import com.example.heroku.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getBookById(Long[] id);

    List<Book> getBookBySortAndSearch(String filter, String sort);

    Book addBook(BookDto bookDto);
}