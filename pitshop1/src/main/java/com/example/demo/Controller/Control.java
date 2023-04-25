package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Bikeaccessories;
import com.example.demo.Service.BikeService;

@RestController
@RequestMapping("/customer")
public class Control {
	@Autowired
	BikeService Service;
	
	@PostMapping("")
	public String create(@RequestBody Bikeaccessories customer)
	{
		return Service.addCustomer(customer);
	}
	@GetMapping("")
	public List<Bikeaccessories> read()
	{
		return Service.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional<Bikeaccessories>readById(@PathVariable int id)
	{
		return Service.getCustomerById(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody Bikeaccessories customer)
	{
		return Service.updateCustomer(customer);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("cid") int id)
	{
		Service.deleteByRequestParam(id);
		return "Deleted";
	}
}
