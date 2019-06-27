package com.example.airbnb.entities;

/**
 * Title
 */
public class Title {

    String propertyDesc; 
	public Title(String propertyDesc) {
        this.propertyDesc=propertyDesc;
	}

    public String getPropertyDesc() {
        return this.propertyDesc;
    }

    public void setPropertyDesc(String propertyDesc) {
        this.propertyDesc = propertyDesc;
    }

    
}