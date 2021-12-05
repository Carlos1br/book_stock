package com.noob.bookstock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

//@Configuration
public class BooksRouter {

//    @Bean
    public RouterFunction<ServerResponse> route(BooksHandler booksHandler) {
        return RouterFunctions
                .route(GET("/books").and(accept(MediaType.APPLICATION_JSON)), booksHandler::findAll)
                .andRoute(GET("/books/{id}").and(accept(MediaType.APPLICATION_JSON)),booksHandler::findById)
                .andRoute(POST("/books").and(accept(MediaType.APPLICATION_JSON)),booksHandler::saveBook);
    }
}
