package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.PageModel;
import com.example.demo.Repository.Repo;
@Service
public class Productsevice {

	@Autowired 
	Repo r;
	public String addProduct(PageModel d)
	{
		r.save(d);
		return "Data Added!";
	}
	public List<PageModel> getProducts()
	{
		return r.findAll();
	}
	//Sorting
	public List<PageModel> getSorted(String field)
	{
		return r.findAll(Sort.by(Sort.Direction.ASC, field));
	}
	public List<PageModel> getWithPagination(int offset, int pagesize)
	{
		Page<PageModel> pg = r.findAll(PageRequest.of(offset, pagesize));
		return pg.getContent();
	}
}