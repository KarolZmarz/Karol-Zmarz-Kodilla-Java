package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //Given
        Book book1 = new Book("Nawyki warte miliony", "Brian Tracy", LocalDate.of(1990,3,23));
        Book book2 = new Book("Bogaty albo biedny", "T.Harv Eker", LocalDate.of(1991,4,22));
        Book book3 = new Book("Myśl i bogać się", "Napoleon Hill", LocalDate.of(1992,5,21));
        Book book4 = new Book("Zarządzanie w CHAOSIE", "Ewa Błaszcyk" , LocalDate.of(2010,6,20));

        Library library = new Library("Library no. 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library no. 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library clonedDeepLibrary = null;
        try {
            clonedDeepLibrary = library.deepCopy();
            clonedDeepLibrary.setName("Library no. 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(clonedDeepLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, clonedDeepLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(clonedDeepLibrary.getBooks(), library.getBooks());
    }
}
