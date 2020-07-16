package com.example.heroku.controller;

import com.example.heroku.model.Book;
import com.example.heroku.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping
public class heroku {
    @Autowired
    private IBookService bookService;

    @RequestMapping("/")
    public String welcome() {
        return "HelloQoeld";
    }

    @GetMapping("/get-books-by-id")
    public ResponseEntity<List<Book>> getBookById(@RequestParam(value = "ids") Long[] ids) {
        return new ResponseEntity<>(bookService.getBookById(ids), HttpStatus.OK);
    }
}
