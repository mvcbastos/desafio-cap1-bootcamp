package com.devsuperior.desafioCap1Marcus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.desafioCap1Marcus.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
