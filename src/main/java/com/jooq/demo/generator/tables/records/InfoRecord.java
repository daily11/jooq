/*
 * This file is generated by jOOQ.
 */
package com.jooq.demo.generator.tables.records;


import com.jooq.demo.generator.tables.Info;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InfoRecord extends UpdatableRecordImpl<InfoRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1000795647;

    /**
     * Setter for <code>book.info.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>book.info.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>book.info.name</code>. 书名
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>book.info.name</code>. 书名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>book.info.price</code>. 价格
     */
    public void setPrice(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>book.info.price</code>. 价格
     */
    public Integer getPrice() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Info.INFO.ID;
    }

    @Override
    public Field<String> field2() {
        return Info.INFO.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Info.INFO.PRICE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getPrice();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getPrice();
    }

    @Override
    public InfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public InfoRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public InfoRecord value3(Integer value) {
        setPrice(value);
        return this;
    }

    @Override
    public InfoRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InfoRecord
     */
    public InfoRecord() {
        super(Info.INFO);
    }

    /**
     * Create a detached, initialised InfoRecord
     */
    public InfoRecord(Integer id, String name, Integer price) {
        super(Info.INFO);

        set(0, id);
        set(1, name);
        set(2, price);
    }
}
