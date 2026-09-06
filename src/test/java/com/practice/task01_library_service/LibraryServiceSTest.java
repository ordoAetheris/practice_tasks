package com.practice.task01_library_service;

import com.practice.task01_library_service.solution.LibraryServiceS;
import com.practice.task01_library_service.solution.data.Book;
import com.practice.task01_library_service.solution.data.BookLoan;
import com.practice.task01_library_service.solution.data.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceSTest {

    LibraryServiceS service;


    @BeforeEach
    public void setUp() {
        service = new LibraryServiceS();
    }

    @Test
    public void success_book_add() {
        Book book = new Book(
                1L,
                "test",
                "tester",
                "tests",
                10
        );

        service.addBook(book);
        List<Book> found = service.findBooksByAuthor("tester");

        assertEquals(1, found.size());
        assertEquals(book, found.getFirst());
    }

    @Test
    public void duplicate_book_add_shall_throw_IAE() {
        Book book = new Book(
                1L,
                "test",
                "tester",
                "tests",
                10
        );

        service.addBook(book);

        assertThrows(IllegalArgumentException.class, () -> service.addBook(book));
    }


    @Test
    public void success_user_add() {
        User user = new User(
                1L,
                "Tester"
        );

        Book book = new Book(
                1L,
                "Test",
                "Testov",
                "Testing",
                5
        );


        service.addUser(user);
        service.addBook(book);

        BookLoan loan = service.issueBook(book.id(), user.id(), LocalDate.now());

        assertNotNull(loan);
        assertEquals(loan.user(), user);

    }


    @Test
    public void duplicate_user_add_shall_throw_IAE() {
        User user = new User(
                1L,
                "Tester"
        );

        service.addUser(user);

        assertThrows(IllegalArgumentException.class, () -> service.addUser(user));
    }

    @Test
    public void find_user_by_author_strict_equals() {
        List<Book> list = List.of(new Book(
                    1L,
                    "testoda",
                    "Tester",
                    "Testing",
                    5
            ),
            new Book(
                    2L,
                    "testoda2",
                    "notTester",
                    "Testing",
                    5
            ),
            new Book(
                    3L,
                    "testoda3",
                    "Tester",
                    "Testosting",
                    5
            )
        );

        for (Book book : list) {
            service.addBook(book);
        }

        var found = service.findBooksByAuthor("Tester");
        assertEquals(2, found.size());
    }

}
