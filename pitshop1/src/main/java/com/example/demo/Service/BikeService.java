package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Bikeaccessories;
import com.example.demo.Repository.Datastoring;

@Service
public class BikeService {

	@Autowired
	Datastoring repository;
	
	public String addCustomer(Bikeaccessories customer)
	{
		repository.save(customer);
		return "Added";
	}
	public List<Bikeaccessories> getCustomer()
	{
		return repository.findAll();
	}
	public Optional<Bikeaccessories> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(Bikeaccessories customer)
	{
		repository.save(customer);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}
}
