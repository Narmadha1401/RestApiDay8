package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.Bikeservice;

@RestController
public class Bikecontroller {
	@Autowired
	Bikeservice bs;
	@PostMapping("addbike")
	public List<Bike> add(@RequestBody List<Bike> b)
	{
		return bs.saveinfo(b);
	}
	@GetMapping("getyear/{year}")
	public List<Bike> displaybycarname(@PathVariable int year){
		return bs.getinfobyyear(year);
	}
	
	@GetMapping("getbikename/{year}/{bikename}")
	public List<Bike> displayAll(@PathVariable int year,@PathVariable String bikename){
		return bs.getbybike(year, bikename);
	}
	

}
