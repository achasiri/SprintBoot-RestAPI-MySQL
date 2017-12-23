package com.egiants.controller;

import java.math.BigDecimal;

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
	
	ItemConverter converter;

	// create/update
	@RequestMapping(path = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public @ResponseBody void addItem(@Validated({ CreateOrUpdateValidation.class }) @RequestBody ItemModel item,
			BindingResult bindingResult) {
		ItemValidator itemValidator = new ItemValidator();
		itemValidator.validate(item, bindingResult);
		if (bindingResult.hasErrors()) {
			return;
		} else {
			if (converter.convertModelToEntity(item) != null) {
				is.addItem(converter.convertModelToEntity(item));
			}
		}
	}

	// read all
	@RequestMapping(path = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody Iterable<Item> getAll() {
		return is.getAllItems();
	}

	// read by id
	@RequestMapping(path = "/find/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody Item getItem(@PathVariable("id") Long id) {
		return is.getItem(id);
	}

	@RequestMapping(path = "/search/{name}/{price}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody Iterable<Item> search(@PathVariable("name") String name,
			@PathVariable("price") BigDecimal price) {
		return is.search(name, price);
	}

	// delete item
	@RequestMapping(path = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void deleteItem(@PathVariable("id") Long id) {
		is.deleteItem(id);
	}

}
