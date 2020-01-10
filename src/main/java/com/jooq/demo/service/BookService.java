package com.jooq.demo.service;

import com.jooq.demo.generator.tables.pojos.Info;

import java.util.List;

public interface BookService {
    List<Info> findBooks();

    Info findBook(Integer id);

    void updateBook(Info info);

    void deleteBook(Integer id);
}
