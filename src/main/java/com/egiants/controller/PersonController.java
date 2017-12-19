package com.egiants.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egiants.model.Person;
import com.egiants.service.PersonService;


@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService ps;
	
	@RequestMapping(path="/all",produces=MediaType.APPLICATION_JSON_VALUE)
	//@RequestMapping(value="/all", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	//@ResponseBody
	public Hashtable<String,Person> getAll()
	{ 
		return ps.getAll();
	}
	
	@RequestMapping(path="{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	//@RequestMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	//@ResponseBody
	public Person getPerson(@PathVariable("id")	String id) {
		return ps.getPerson(id);
	}
	
}
