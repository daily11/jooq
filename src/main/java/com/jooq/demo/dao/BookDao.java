package com.jooq.demo.dao;

import com.jooq.demo.generator.tables.pojos.Info;

import java.util.List;

public interface BookDao {

    List<Info> findBooks();

    Info findBook(Integer id);

    void updateBook(Info info);

    void deleteBook(Integer id);
}
