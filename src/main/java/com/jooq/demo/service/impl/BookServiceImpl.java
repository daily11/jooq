package com.jooq.demo.service.impl;

import com.jooq.demo.dao.BookDao;
import com.jooq.demo.generator.tables.pojos.Info;
import com.jooq.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public List<Info> findBooks() {
        List<Info> infos = bookDao.findBooks();
        return infos;
    }

    @Override
    public Info findBook(Integer id) {
        Info info = bookDao.findBook(id);
        return info;
    }

    @Override
    public void updateBook(Info info) {
        bookDao.updateBook(info);
    }

    @Override
    public void deleteBook(Integer id) {
        bookDao.deleteBook(id);
    }
}
