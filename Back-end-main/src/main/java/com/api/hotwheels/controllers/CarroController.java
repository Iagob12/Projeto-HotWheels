package com.api.hotwheels.controllers;

import com.api.hotwheels.entities.Carro;
import com.api.hotwheels.repositories.CarroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/hotwheels")
public class CarroController {

    private final CarroRepository carroRepository;

    public CarroController(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    @GetMapping
    public ResponseEntity<List<Carro>> getAllCarros() {
        List<Carro> carros = carroRepository.findAll();
        return ResponseEntity.ok(carros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> getCarroById(@PathVariable Long id) {
        return carroRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<Carro> createCarro(@RequestBody Carro carro) {
        Carro savedCarro = carroRepository.save(carro);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCarro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carro> updateCarro(@PathVariable Long id, @RequestBody Carro carro) {
        return carroRepository.findById(id)
                .map(existingCarro -> {
                    existingCarro.setNome(carro.getNome());
                    existingCarro.setAnoFabricacao(carro.getAnoFabricacao());
                    existingCarro.setSerie(carro.getSerie());
                    existingCarro.setNumeroColecao(carro.getNumeroColecao());
                    existingCarro.setStatus(carro.getStatus());
                    existingCarro.setFavorito(carro.isFavorito());
                    existingCarro.setImagem(carro.getImagem());
                    Carro updatedCarro = carroRepository.save(existingCarro);
                    return ResponseEntity.ok(updatedCarro);
                })
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PatchMapping("/{id}/favorito")
    public ResponseEntity<Carro> toggleFavorito(@PathVariable Long id) {
        return carroRepository.findById(id)
                .map(carro -> {
                    carro.setFavorito(!carro.isFavorito());
                    Carro updatedCarro = carroRepository.save(carro);
                    return ResponseEntity.ok(updatedCarro);
                })
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCarro(@PathVariable Long id) {
        if (carroRepository.existsById(id)) {
            carroRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}