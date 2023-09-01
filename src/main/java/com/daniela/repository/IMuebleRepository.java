package com.daniela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniela.model.Mueble;

public interface IMuebleRepository extends JpaRepository<Mueble, Integer>{

}
