package it.saracirone.fabula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.saracirone.fabula.entities.Books;

public interface BooksRepo extends JpaRepository<Books, Integer>{

}


