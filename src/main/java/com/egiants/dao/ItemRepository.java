package com.egiants.dao;



import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egiants.entity.Item;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

	//public Iterable<Item> findAll(Predicate predicate);
	public Iterable<Item> findByitemNameInAndPriceIn(String name, BigDecimal prices);

}
