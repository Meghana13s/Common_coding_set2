package com.pratice;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class Immutable {

    private final String name;

    private final Date date;

    private final List<String> list;


    public Immutable(String name, Date date, List<String> list) {
        this.name = name;
        this.date = new Date(date.getTime());
        this.list = Collections.unmodifiableList(list);
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public List<String> getList() {
        return list;
    }
}
