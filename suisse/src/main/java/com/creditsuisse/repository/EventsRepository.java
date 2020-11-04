package com.creditsuisse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.creditsuisse.entity.EventsDomain;

@Repository
public interface EventsRepository extends CrudRepository<EventsDomain, String>{
	
	
	
}
