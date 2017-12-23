package com.egiants.coverter;

import com.egiants.entity.Item;
import com.egiants.model.ItemModel;

public class ItemConverter {
	public Item convertModelToEntity(ItemModel im) {
		Item item=new Item();
		if(im!=null) {
			if(im.getItemId()!=null)
				item.setItemId(im.getItemId());
			if(im.getItemName()!=null)
				item.setItemName(im.getItemName());
			if(im.getPrice()!=null)
				item.setPrice(im.getPrice());
		}
		return item;
		
	}
	public ItemModel convertEntityToModel(Item item) {
		ItemModel im=new ItemModel();
		if(item!=null) {
			if(item.getItemId()!=null)
				im.setItemId(im.getItemId());
			if(item.getItemName()!=null)
				im.setItemName(im.getItemName());
			if(item.getPrice()!=null)
				im.setPrice(im.getPrice());
		}
		return im;
		
	}
}
