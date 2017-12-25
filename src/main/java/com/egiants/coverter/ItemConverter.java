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
			if(im.getBrandId()!=null)
				item.setBrandId(im.getBrandId());
			if(im.getProductId()!=null)
				item.setProductId(im.getProductId());
		}
		return item;
		
	}
	public ItemModel convertEntityToModel(Item item) {
		ItemModel im=new ItemModel();
		if(item!=null) {
			if(item.getItemId()!=null)
				im.setItemId(item.getItemId());
			if(item.getItemName()!=null)
				im.setItemName(item.getItemName());
			if(item.getPrice()!=null)
				im.setPrice(item.getPrice());
			if(item.getBrandId()!=null)
				im.setBrandId(item.getBrandId());
			if(item.getProductId()!=null)
				im.setProductId(item.getProductId());
		}
		return im;
		
	}
}
