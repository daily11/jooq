package com.jooq.demo.dao.impl;

import com.jooq.demo.dao.BookDao;
import com.jooq.demo.generator.Tables;
import com.jooq.demo.generator.tables.pojos.Info;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    DSLContext dslContext;

    @Override
    public List<Info> findBooks() {
        com.jooq.demo.generator.tables.Info info = Tables.INFO.as("info");
        List<Info> infos = dslContext
                .select(info.ID, info.NAME, info.PRICE)
                .from(info)
                .fetchInto(Info.class);
        return infos;
    }

    @Override
    public Info findBook(Integer id) {
        com.jooq.demo.generator.tables.Info info = Tables.INFO.as("info");
        List<Info> infos = dslContext
                .select(info.ID, info.NAME, info.PRICE)
                .from(info)
                .where(info.ID.eq(id))
                .fetchInto(Info.class);
        return infos == null ? null : infos.get(0);
    }

    @Override
    public void updateBook(Info entity) {
        com.jooq.demo.generator.tables.Info info = Tables.INFO.as("info");
        dslContext
                .update(info)
                .set(info.NAME, entity.getName())
                .set(info.PRICE, entity.getPrice())
                .where(info.ID.eq(entity.getId()))
                .execute();
    }

    @Override
    public void deleteBook(Integer id) {
        com.jooq.demo.generator.tables.Info info = Tables.INFO.as("info");
        dslContext
                .delete(info)
                .where(info.ID.eq(id))
                .execute();
    }
}
