package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("First Author", "First Title", 1992, "111");
        Book book2 = new Book("Second Author", "Second Title", 1993, "111");
        Book book3 = new Book("Third Author", "Third Title", 1999, "111");
        Book book4 = new Book("Fourth Author", "Fourth Title", 1990, "111");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        //When
        int calculate = medianAdapter.publicationYearMediana(books);
        //Then
        assertEquals(1990, calculate);
    }
    @Test
    public void publicationYearMedianTest1() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("First Author", "First Title", 1991, "111");
        Book book2 = new Book("Second Author", "Second Title", 1993, "111");
        Book book3 = new Book("Third Author", "Third Title", 1999, "111");
        Book book4 = new Book("Fourth Author", "Fourth Title", 1990, "111");
        Book book5 = new Book("Fifth Author", "Fifth Title", 1990, "111");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        //When
        int calculate = medianAdapter.publicationYearMediana(books);
        //Then
        assertEquals(1991, calculate);
    }
    @Test
    public void publicationYearWithoutBooks() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        //When
        int calculate = medianAdapter.publicationYearMediana(books);
        //Then
        assertEquals(0, calculate);
    }
}
