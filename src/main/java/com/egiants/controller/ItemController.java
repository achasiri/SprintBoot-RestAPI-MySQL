package com.egiants.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egiants.model.Item;
import com.egiants.service.ItemService;


@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	ItemService is;
	
	//create/update
	@RequestMapping(path="/post",consumes= MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.POST ) 
	public @ResponseBody  void addItem(@RequestBody Item item) {
		is.addItem(item);
		//return is.getItem(item.getItemId()); //display the post(create/update) item back to user
	}
	
	
	//read all
	@RequestMapping(path="/findAll",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public @ResponseBody Iterable<Item> getAll()
	{ 
		return is.getAllItems();
	}
	
	//read by id
	@RequestMapping(path="/find/{id}",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public @ResponseBody Item getItem(@PathVariable("id")	Long id) {
		return is.getItem(id);
	}
	
	@RequestMapping(path="/search/{name}/{price}",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public @ResponseBody Iterable<Item> search(@PathVariable("name")String name,@PathVariable("price")	BigDecimal price)
	{ 
		return is.search(name,price);
	}
	
	//delete item
	@RequestMapping(path="/delete/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void deleteItem(@PathVariable("id") Long id) {
		 is.deleteItem(id);
	}
	
	
	
	
	
	

}
