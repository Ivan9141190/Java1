package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {
    public enum CompareResult {LESS, EQUAL, GREATER}

    CompareWeight.CompareResult LESS = CompareWeight.LESS;
    CompareWeight.CompareResult EQUAL = CompareWeight.EQUAL;
    CompareWeight.CompareResult GREATER = CompareWeight.GREATER;

    public CompareResult compareWeight(double smthHasWeigt);



    public static void main(String[] args) {
        System.out.println();
    }}



