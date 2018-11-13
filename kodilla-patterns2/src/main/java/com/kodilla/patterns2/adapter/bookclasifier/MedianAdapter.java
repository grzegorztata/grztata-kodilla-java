package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.Set;

// rozszerza klasę MedianAdaptee oraz implementuje interfejs Classifier
public class MedianAdapter extends MedianAdaptee implements Classifier {
    public int publicationYearMediana(Set<Book> bookSet) {

    }
}
