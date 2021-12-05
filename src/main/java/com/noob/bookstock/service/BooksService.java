package com.noob.bookstock.service;

import com.noob.bookstock.document.Books;
import com.noob.bookstock.dto.BooksDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface BooksService {

    Flux<Books>findAll();
    Mono<Books>findById(String id);
    Mono<Books>save(Books books);
}
