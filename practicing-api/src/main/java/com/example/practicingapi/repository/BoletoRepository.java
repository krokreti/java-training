package com.example.practicingapi.repository;

import com.example.practicingapi.models.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoletoRepository extends JpaRepository<Boleto, Long> {
    
}
