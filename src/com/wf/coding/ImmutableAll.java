package com.wf.coding;

import java.util.*;

public final class ImmutableAll {
    private final String name;
    private final Date joinDate;
    private final List<Integer> list;
    private final int[] arr;

    public String getName() {
        return name;
    }

    public Date getJoinDate() {
        return new Date(joinDate.getTime());
    }

    public List<Integer> getList() {
        return Collections.unmodifiableList(new ArrayList<>(list));
    }

    public int[] getArr() {
        return Arrays.copyOf(arr,arr.length);
    }

    public ImmutableAll(String name, Date joinDate, List<Integer> list, int[] arr) {
        this.name = name;
        this.joinDate = new Date(joinDate.getTime());
        this.list = new ArrayList<>(list);
        this.arr = Arrays.copyOf(arr,arr.length);
    }

    @Override
    public String toString() {
        return "ImmutableAll{" +
                "name='" + name + '\'' +
                ", joinDate=" + joinDate +
                ", list=" + list +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {

    }
}
