package com.noob.bookstock.repository;

import com.noob.bookstock.document.Books;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


public interface BooksRepository extends ReactiveMongoRepository<Books,String> {
}
