package com.egiants.model;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.egiants.groups.CreateOrUpdateValidation;
import com.egiants.groups.CreateValidation;
import com.egiants.groups.UpdateValidation;


public class ItemModel  {


	
	@NotNull (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class})
	//@Size (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class})
	private Long itemId;
	
	@NotNull (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class})
	@Size (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class},max=1000)
	private String itemName;

	@NotNull (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class})
	//@Size (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class},max=1000)
	private BigDecimal price;

	//@NotNull (groups= {CreateValidation.class,UpdateValidation.class})
	//@Size (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class},max=1000)
	private String description;
	
	@NotNull (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class})
	//@Size (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class})
	private Long brandId;
	
	@NotNull (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class})
	//@Size (groups= {CreateValidation.class,UpdateValidation.class,CreateOrUpdateValidation.class})
	private Long productId;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ItemModel() {
		// TODO Auto-generated constructor stub
	}

	public ItemModel(Long itemId, String itemName, BigDecimal price,Long brandId, long productId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price=price;
		this.brandId=brandId;
		this.productId=productId;
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