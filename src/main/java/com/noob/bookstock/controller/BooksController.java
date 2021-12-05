package com.noob.bookstock.controller;


import com.noob.bookstock.document.Books;
import com.noob.bookstock.dto.BooksDTO;
import com.noob.bookstock.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/books")
public class BooksController {

    @Autowired
    BooksService service;

    @GetMapping
    public Flux<Books>  getAllBooks() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Books> getBook(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Books> saveBook(@RequestBody Books books) {
        return service.save(books);
    }


    //path para testar eventos com requisições
    @GetMapping(value = "/events", produces = (MediaType.TEXT_EVENT_STREAM_VALUE))
    public Flux<Tuple2<Long, Books>> getBooksByWebflux() {
        System.out.println("------" + LocalDateTime.now());
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(5));
        Flux<Books> books = service.findAll();

        return Flux.zip(interval, books);
    }
}
