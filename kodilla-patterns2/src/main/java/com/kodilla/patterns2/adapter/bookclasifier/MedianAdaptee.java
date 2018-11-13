package com.kodilla.patterns2.adapter.bookclasifier;

//implementuje interfejs BookStatistics oraz używa obiektu klasy Statistics do wykonania obliczeń

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics { //averagePublicationYear i medianPublicationYear
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics satatistisc = new Statistics();
        return satatistisc.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
