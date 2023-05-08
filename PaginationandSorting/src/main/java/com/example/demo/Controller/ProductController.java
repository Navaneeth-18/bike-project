package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.PageModel;
import com.example.demo.Service.Productsevice;
@RestController
@RequestMapping("/eshopping")

public class ProductController {

@Autowired
Productsevice s;
	
	@GetMapping(" ")
	public List<PageModel> read()
	{
		return s.getProducts();
	}
	
	@PostMapping(" ")
	public String create(@RequestBody PageModel d)
	{
		return s.addProduct(d);	
	}
	
	//Sorting
	@GetMapping("/{field}")
	public List<PageModel> getProductsSorted(@PathVariable String field)
	{
		return s.getSorted(field);
	}
	
	//Pagination
	@GetMapping("/{offset}/{pagesize}")
	public List<PageModel> getProductsPagination(@PathVariable int offset, @PathVariable int pagesize)
	{
		return s.getWithPagination(offset, pagesize);
		//offset --> No of pages
	}
}
