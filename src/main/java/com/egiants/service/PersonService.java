package com.egiants.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.egiants.model.Person;

@Service
public class PersonService {
	Hashtable<String, Person> persons= new Hashtable<String, Person>();
	public PersonService() {
		Person p1=new Person();
		p1.setId("1");
		p1.setAge(25);
		p1.setFirstName("siri");
		p1.setLastName("acha");
		persons.put("1", p1);
		
		Person p2=new Person();
		p2.setId("2");
		p2.setAge(24);
		p2.setFirstName("bultu");
		p2.setLastName("nt");
		persons.put("2", p2);	
	}

	public Person getPerson(String id) {
		if(persons.containsKey(id))
			return persons.get(id);
		else
			return null;
	}
	
	
	public Hashtable<String,Person> getAll(){
		return persons;
	}
}
