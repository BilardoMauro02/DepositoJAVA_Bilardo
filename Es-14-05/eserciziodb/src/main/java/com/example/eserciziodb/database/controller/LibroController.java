package com.example.eserciziodb.database.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eserciziodb.database.models.Libro;
import com.example.eserciziodb.database.repository.LibroRepository;

@RestController
@RequestMapping("/api/libri")
public class LibroController {
    

    private final LibroRepository libroRepository;

    public LibroController(LibroRepository libroRepository){
        this.libroRepository = libroRepository;
    }

    @GetMapping
    public List<Libro> findAll(){
        return libroRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> findById(@PathVariable Integer id){
        Optional<Libro> libro = libroRepository.findById(id);
        return libro.map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Libro> create(@RequestBody Libro libro){
        Libro aggiunto = libroRepository.save(libro);
        return ResponseEntity.status(201).body(aggiunto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> update(@PathVariable Integer id, @RequestBody Libro libroDetails){
        Optional<Libro> existing = libroRepository.findById(id);
        if (existing.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Libro libro = existing.get();
        libro.setAutore(libroDetails.getAutore());
        libro.setTitolo(libroDetails.getTitolo());
        libro.setGenere(libroDetails.getGenere());    
        libro.setPagine(libroDetails.getPagine());
        Libro aggiornato =  libroRepository.save(libro);
        return ResponseEntity.ok(aggiornato);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        if (!libroRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        libroRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
