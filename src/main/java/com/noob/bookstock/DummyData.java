package com.noob.bookstock;

import com.noob.bookstock.document.Books;
import com.noob.bookstock.repository.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

//@Component
//public class DummyData implements CommandLineRunner {
//
//    private final BooksRepository booksRepository;
//
//    DummyData(BooksRepository booksRepository) {
//        this.booksRepository = booksRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        booksRepository.deleteAll()
//                .thenMany(
//                        Flux.just("Kubernetes Básico", "TDD com Java",
//                                "Código limpo", "Codificador limpo", "Java Efetivo", "Estrutura de dados com Java")
//                        .map(name -> new Books(UUID.randomUUID().toString(), name))
//                        .flatMap(booksRepository::save))
//                .subscribe(System.out::println);
//
//    }
//}
