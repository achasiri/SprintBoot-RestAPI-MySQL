package com.egiants.controller;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egiants.coverter.ItemConverter;
import com.egiants.entity.Item;
import com.egiants.groups.CreateOrUpdateValidation;
import com.egiants.model.ItemModel;
import com.egiants.service.ItemService;
import com.egiants.validators.ItemValidator;

@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	ItemService is;
	
	
	ItemConverter converter=new ItemConverter() ;

	// create/update
	@RequestMapping(path = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public @ResponseBody ItemModel addItem(@Validated({ CreateOrUpdateValidation.class }) @RequestBody ItemModel itemIn,
			BindingResult bindingResult) {
		Item itemEntity=converter.convertModelToEntity(itemIn);
		ItemValidator itemValidator = new ItemValidator();
		itemValidator.validate(itemIn, bindingResult);
		if (bindingResult.hasErrors()) {
			throw new RuntimeException("Item has one or more fields missing/incorrect ");
		} else {
			if (itemEntity != null) {
				is.addItem(itemEntity);
			}
		}
		return itemIn;
	}

	// read all
	@RequestMapping(path = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody Iterable<Item> getAll() {
		Iterable<Item> items = is.getAllItems();
		if(items==null) {
			throw new RuntimeException("No items are found");
		}
		else {
			return is.getAllItems();
		}
		
	}

	// read by id
	@RequestMapping(path = "/find/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody ItemModel getItem( @PathVariable("id") Long id) {
		ItemModel itemModel=new ItemModel();
		Item item=is.getItem(id);
		if(item==null)
		{
			throw new RuntimeException("Item not found");
		}
		else {
			itemModel=converter.convertEntityToModel(item);
		}
		return itemModel;
		
	}

	//todo-mohan
	@RequestMapping(path = "/search/{name}/{price}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody Iterable<Item> search(@PathVariable("name") String name,
			@PathVariable("price") BigDecimal price) {
		return is.search(name, price);
	}

	// delete item
	@RequestMapping(path = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.DELETE)
	public @ResponseBody void deleteItem(@Valid @PathVariable("id") Long id,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new RuntimeException("Item id is invalid ");
		} else {
			if (is.getItem(id)==null) {
				throw new RuntimeException("Item  is not present ");
			}
			else {
				is.deleteItem(id);
			}
			}
	}

}
