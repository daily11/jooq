package com.jooq.demo.controller;

import com.jooq.demo.generator.tables.pojos.Info;
import com.jooq.demo.service.BookService;
import com.jooq.demo.util.CODE;
import com.jooq.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping(value = "/findBooks", method = RequestMethod.POST)
    public Result findBooks() {
        try {
            return new Result(CODE.SUCCESS, bookService.findBooks(), "success");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(CODE.ERROR, null, "error");
        }
    }

    @RequestMapping(value = "/findBook", method = RequestMethod.POST)
    public Result findBook(Integer bid) {
        try {
            return new Result(CODE.SUCCESS, bookService.findBook(bid), "success");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(CODE.ERROR, null, "error");
        }
    }

    @RequestMapping(value = "/updateBook", method = RequestMethod.POST)
    public Result updateBook(Info info) {
        try {
            bookService.updateBook(info);
            return new Result(CODE.SUCCESS, null, "success");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(CODE.ERROR, null, "error");
        }
    }

    @RequestMapping(value = "/deleteBook", method = RequestMethod.POST)
    public Result deleteBook(Integer bid) {
        try {
            bookService.deleteBook(bid);
            return new Result(CODE.SUCCESS, null, "success");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(CODE.ERROR, null, "error");
        }
    }
}
