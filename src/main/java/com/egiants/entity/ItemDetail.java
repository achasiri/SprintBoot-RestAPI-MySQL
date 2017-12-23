package com.egiants.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_detail")
public class ItemDetail implements Serializable {

	@Id
	@Column(name = "item_id")
	private Long itemId;

	@Column(name = "item_description")
	private String itemDescription;

	@Column(name = "specification")
	private String specification;

	@Column(name = "availability")
	private String availability;
	
	
	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public String getSpecification() {
		return specification;
	}


	public void setSpecification(String specification) {
		this.specification = specification;
	}


	public String getAvailability() {
		return availability;
	}


	public void setAvailability(String availability) {
		this.availability = availability;
	}


	public ItemDetail(Long itemId, String itemDescription, String specification, String availability) {
		super();
		this.itemId = itemId;
		this.itemDescription = itemDescription;
		this.specification=specification;
		this.availability=availability;
	}


	
}