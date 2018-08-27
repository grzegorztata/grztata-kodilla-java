package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("4-Books Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.now())));

        Library shallowCopy = null;
        try {
            shallowCopy = library.shallowCopy();
            shallowCopy.setName("New 4-Books Library (shallow)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopy = null;
        try {
            deepCopy = library.deepCopy();
            deepCopy.setName("3 Books Library (deep)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Title 4", "Author 4", LocalDate.now()));

        //Then
        System.out.println(library);
        System.out.println(shallowCopy);
        System.out.println(deepCopy);
        Assert.assertEquals(4, shallowCopy.getBooks().size());
        Assert.assertEquals(3, deepCopy.getBooks().size());
        Assert.assertEquals(shallowCopy.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepCopy.getBooks(), library.getBooks());
    }
}
