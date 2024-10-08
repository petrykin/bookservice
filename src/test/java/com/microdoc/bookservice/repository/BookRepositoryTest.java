package com.microdoc.bookservice.repository;

import com.microdoc.bookservice.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

//@DataJpaTest
class BookRepositoryTest {

    //@Autowired
    private BookRepository bookRepository;

    //@Test
    void shouldSaveAndRetrieveBook() {
        Book book = new Book();
        book.setTitle("Test Book");
        book.setAuthor("Test Author");
        book.setIsbn("978-1234567890");
        book.setPublicationDate(LocalDate.now());

        Book savedBook = bookRepository.save(book);
        Book retrievedBook = bookRepository.findById(savedBook.getId()).orElse(null);

        assertThat(retrievedBook).isNotNull();
        assertThat(retrievedBook.getTitle()).isEqualTo("Test Book");
        assertThat(retrievedBook.getAuthor()).isEqualTo("Test Author");
        assertThat(retrievedBook.getIsbn()).isEqualTo("978-1234567890");
    }
}
