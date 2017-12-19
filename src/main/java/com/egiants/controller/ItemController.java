package com.egiants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egiants.model.Item;
import com.egiants.service.ItemService;


@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	ItemService is;
	
	@GetMapping(path="/all",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Item> getAll()
	{ 
		return is.getAll();
	}
	
	@GetMapping(path="{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Item getPerson(@PathVariable("id")	Long id) {
		return is.getItem(id);
	}
	
}
