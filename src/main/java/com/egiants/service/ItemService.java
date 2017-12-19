package com.egiants.service;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egiants.dao.ItemRepository;
import com.egiants.model.Item;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	//Hashtable<String, Item> persons= new Hashtable<String, Item>();
	/*public ItemService() {
		Item p1=new Item();
		p1.setId("1");
		p1.setAge(25);
		p1.setFirstName("siri");
		p1.setLastName("acha");
		persons.put("1", p1);
		
		Item p2=new Item();
		p2.setId("2");
		p2.setAge(24);
		p2.setFirstName("bultu");
		p2.setLastName("nt");
		persons.put("2", p2);	
	}
*/
	public Item getItem(Long id) {
		/*if(persons.containsKey(id))
			return persons.get(id);
		else
			return null;*/
		if(itemRepository.findOne(id) != null)
			return itemRepository.findOne(id);
		else
			return null;
	}
	
	
	public Iterable<Item> getAll(){
		return itemRepository.findAll();
		//return persons;
	}
}
