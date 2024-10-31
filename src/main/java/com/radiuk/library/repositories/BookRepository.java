package com.radiuk.library.repositories;

import com.radiuk.library.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findAllByOrderByYearAsc();

    List<Book> findByTitleStartingWith(String title);

}