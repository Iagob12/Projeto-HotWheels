package com.api.hotwheels.repositories;

import com.api.hotwheels.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}