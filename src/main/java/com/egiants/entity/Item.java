package com.egiants.entity;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.egiants.groups.CreateOrUpdateValidation;
import com.egiants.groups.CreateValidation;
import com.egiants.groups.UpdateValidation;

@Entity
@Table(name = "item")
public class Item implements Serializable {

	@Id
	@Column(name = "item_id")
	private Long itemId;
	
	@Column(name = "item_name")
	private String itemName;

	@Column(name = "initial_price")
	private BigDecimal price;

	@Column(name = "brand_id")
	private Long brandId;
	
	
	@Column(name = "product_id")
	private Long productId;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Long itemId, String itemName, BigDecimal price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price=price;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
/*
//@XmlRootElement
public class Item {
	String id;
	String firstName;
	String lastName;
	int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
*/