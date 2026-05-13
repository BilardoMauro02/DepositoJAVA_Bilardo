package com.example.controller.app.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.app.Model.RunRecord;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final List<RunRecord> runs = new ArrayList<>();

    public RunController() {
    }

    @GetMapping
    public ResponseEntity<List<RunRecord>> findAll() {
        return ResponseEntity.ok(runs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RunRecord> findById(@PathVariable Integer id) {
        if (id < 0 || id >= runs.size()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(runs.get(id));
    }

    @PostMapping
    public ResponseEntity<RunRecord> create(@RequestBody RunRecord newRun) {
        runs.add(newRun);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRun);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RunRecord> update(@PathVariable Integer id, @RequestBody RunRecord updatedRun) {
        for (int i = 0; i < runs.size(); i++) {
            if (runs.get(i).id().equals(id)) {
                runs.set(i, updatedRun);
                return ResponseEntity.ok(updatedRun);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        Optional<RunRecord> existing = runs.stream()
                .filter(r -> r.id().equals(id))
                .findFirst();

        if (existing.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        runs.remove(existing.get());
        return ResponseEntity.noContent().build();
    }

}
