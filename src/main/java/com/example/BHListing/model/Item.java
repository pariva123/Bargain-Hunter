package com.example.BHListing.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Items")
public class Item {
	
	@Id
	private String itemId;
	
	private String itemTitle;
	private String itemDescription;
	private int itemPrice;
	private String itemCurrency;
	private String itemImageURL;
	
	public Item(String itemId, String itemTitle, String itemDescription, int itemPrice, String itemCurrency,
			String itemImageURL) {
		super();
		this.itemId = itemId;
		this.itemTitle = itemTitle;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.itemCurrency = itemCurrency;
		this.itemImageURL = itemImageURL;
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemCurrency() {
		return itemCurrency;
	}
	public void setItemCurrency(String itemCurrency) {
		this.itemCurrency = itemCurrency;
	}
	public String getItemImageURL() {
		return itemImageURL;
	}
	public void setItemImageURL(String itemImageURL) {
		this.itemImageURL = itemImageURL;
	}
	
	
}
