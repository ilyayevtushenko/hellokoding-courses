package com.hellokoding.jpa.book;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer>{
    List<Book> findByLibraryId(Integer libraryId, Pageable pageable);
}
