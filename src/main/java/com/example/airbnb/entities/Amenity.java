package com.example.airbnb.entities;

/**
 * Amenity
 */
public class Amenity {

    String types;
	public Amenity(String types) {
        this.types = types;
	}


	public String getTypes() {
        return this.types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    
}