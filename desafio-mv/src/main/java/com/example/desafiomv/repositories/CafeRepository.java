package com.example.desafiomv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.desafiomv.entities.Cafe;

@Repository
public interface CafeRepository extends CrudRepository<Cafe,Long>{
	
	

}
