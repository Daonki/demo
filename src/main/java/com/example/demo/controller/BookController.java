package com.example.demo.controller;

import com.example.demo.domain.Book;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
@CrossOrigin("*")
public class BookController {

    private final BookService bookService;

    @PostMapping("/register")
    public Book create(@RequestBody Book book) {
        book.setRegDate(LocalDate.now());
        book.setUpdateDate(LocalDate.now());
        return bookService.save(book);
    }

    @GetMapping("/list")
    public List<Book> list() {
        return bookService.findAll();
    }

    @GetMapping("/detail")
    public Book detail(@RequestParam Long id) {
        return bookService.detail(id);
    }

    @PutMapping("/update")
    public Book update(@RequestBody Book book) {
        book.setUpdateDate(LocalDate.now());
        return bookService.update(book.getId(), book);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        bookService.delete(id);
    }
}


