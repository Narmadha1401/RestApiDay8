package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bike;
@Repository
public interface Bikerepo extends JpaRepository<Bike, Integer>{
	@Query(value="select *from bike where year=:s",nativeQuery = true)
public List<Bike> getbyyear(@Param("s") int year);
	
	@Query(value="select * from bike where year=:s or bikename=:sn",nativeQuery = true)
	public List<Bike> getinfo(@Param("s") int year,@Param("sn") String bikename);

}
