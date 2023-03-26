package it.saracirone.fabula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.saracirone.fabula.entities.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
