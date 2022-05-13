package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library number 1");
                IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("" + n, "" + n,
                        LocalDate.of(1111, 11, 11))));

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {

            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("6","6", LocalDate.of(6,6,6)));
        int result1 = library.getBooks().size();
        int result2 = clonedLibrary.getBooks().size();
        int result3 = deepClonedLibrary.getBooks().size();
        //Then
        Assert.assertEquals(6,result1);
        Assert.assertEquals(6,result2);
        Assert.assertEquals(5, result3);
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}