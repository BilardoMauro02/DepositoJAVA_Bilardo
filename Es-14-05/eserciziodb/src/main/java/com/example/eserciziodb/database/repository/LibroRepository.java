package com.example.eserciziodb.database.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eserciziodb.database.models.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{

    List<Libro> findAll();
    Optional<Libro> findById(Integer id); // già incluso, ma valido
    List<Libro> findByAutore(String autore);

}
