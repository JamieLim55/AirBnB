package com.example.airbnb.entities;

import java.util.ArrayList;

/**
 * AirBnBProperty
 */
public class AirBnBProperty {

	String title; 
	Item item;
	ArrayList<Image> image;
	ArrayList<Amenity> amenity;


	public AirBnBProperty(String title, Item item, ArrayList<Image> image, ArrayList<Amenity> amenity) {
		this.title = title;
		this.item = item;
		this.image = new ArrayList<Image>();
		this.amenity = new ArrayList<Amenity>();
	}



	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ArrayList<Image> getImage() {
		return this.image;
	}

	public void setImage(ArrayList<Image> image) {
		this.image = image;
	}

	public ArrayList<Amenity> getAmenity() {
		return this.amenity;
	}

	public void setAmenity(ArrayList<Amenity> amenity) {
		this.amenity = amenity;
	}
	
	
	public void addImage(Image image) {
		this.image.add(image);
	}

	public void addAmenity(Amenity amenity) {
		this.amenity.add(amenity);
	}


	
    
}