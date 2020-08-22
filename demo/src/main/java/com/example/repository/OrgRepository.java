package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.OrgEntity;

@Repository
public interface OrgRepository extends JpaRepository<OrgEntity, Long>{

	@Query(value = "SELECT * FROM org where name = ?1",
			nativeQuery = true)
	public OrgEntity getByName(String name);
}

