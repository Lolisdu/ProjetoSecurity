package com.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.model.entities.Viagem;




@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long>{
	

}
