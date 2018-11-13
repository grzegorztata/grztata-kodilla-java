package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// rozszerza klasę MedianAdaptee oraz implementuje interfejs Classifier
public class MedianAdapter extends MedianAdaptee implements Classifier {
    public int publicationYearMediana(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> theBook = new HashMap<>();
        for(Book book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book book1 = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());

            theBook.put(bookSignature, book1); //Map<BookSignature, Book>
        }
        return medianPublicationYear(theBook);
    }
}

//Wrong 2nd argument type put(librarya.Book) in Map cannot be applied
//to libraryb.Book
