package it.saracirone.fabula.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import it.saracirone.fabula.entities.Admin;


@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "admin", path="admin")
public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
