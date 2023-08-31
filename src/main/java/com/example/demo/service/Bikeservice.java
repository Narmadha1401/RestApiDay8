package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.Bikerepo;

@Service
public class Bikeservice {
	@Autowired Bikerepo br;
	public List<Bike> saveinfo(List<Bike> b)
	{
		return br.saveAll(b);
	}
	public List<Bike> getinfobyyear(int s)
	{
		return br.getbyyear(s);
	}
	public List<Bike> getbybike(int s,String b)
	{
		return br.getinfo(s, b);
	}

}
