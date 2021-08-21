package com.noob.bookstock.service;

import com.noob.bookstock.document.Books;
import com.noob.bookstock.dto.BooksDTO;
import com.noob.bookstock.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    BooksRepository repository;

    @Override
    public Flux<Books> findAll() {


        return repository.findAll();
    }

    @Override
    public Mono<Books> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Books> save(Books books) {
        return repository.save(books);
    }
}
