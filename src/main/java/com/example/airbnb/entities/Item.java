package com.example.airbnb.entities;

/**
 * Item
 */
public class Item {

	String guestNo;
    String roomNo;
    String bathroomNo;
    String bedNo;

 

	public Item(String guestNo, String roomNo, String bedNo, String bathroomNo) {
        this.guestNo = guestNo;
        this.roomNo = roomNo;
        this.bedNo = bedNo;
        this.bathroomNo = bathroomNo;
    }

    public String getGuestNo() {
        return this.guestNo;
    }

    public void setGuestNo(String guestNo) {
        this.guestNo = guestNo;
    }

    public String getRoomNo() {
        return this.roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getBathroomNo() {
        return this.bathroomNo;
    }

    public void setBathroomNo(String bathroomNo) {
        this.bathroomNo = bathroomNo;
    }

    public String getBedNo() {
        return this.bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }


	}

    

    