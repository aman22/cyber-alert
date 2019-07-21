package com.cyberalert.repo;

import com.cyberalert.model.Alert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AlertRepository extends CrudRepository<Alert, Long>{

    List<Alert> findAll();

}
