package com.example.airbnb.controllers;

import com.example.airbnb.entities.AirBnBProperty;
import com.example.airbnb.entities.Amenity;
import com.example.airbnb.entities.Image;
import com.example.airbnb.entities.Item;
import com.example.airbnb.entities.Title;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController{

     @GetMapping(value="/",  produces="application/json")
     public AirBnBProperty getMethodName(@RequestParam String param){
        AirBnBProperty property =new AirBnBProperty(param, null, null, null);
        property.setTitle("Chic Room with Bath and Kitchenette Living Area");
        property.setItem(new Item("3 guests", "1 private bedroom", "1 bed", "1 private bath"));
        property.addImage(new Image("Private living room","https://a0.muscache.com/im/pictures/5b672d57-4564-4690-9600-0ac9b40c562e.jpg?aki_policy=x_medium"));
        property.addImage(new Image("Private bedroom","https://a0.muscache.com/im/pictures/46bc761d-ab43-426f-b289-f0916215e466.jpg?aki_policy=x_medium"));
        property.addImage(new Image("Private kitchenette","https://a0.muscache.com/im/pictures/8eff0f5c-8c25-4658-8f95-e437df0f59b3.jpg?aki_policy=x_medium"));
        property.addImage(new Image("Private full bathroom","https://a0.muscache.com/im/pictures/9a7751c9-8dd2-4882-b9fc-130082a0f468.jpg?aki_policy=x_medium"));
        property.addAmenity(new Amenity("Self Check_in"));
        property.addAmenity(new Amenity("Kitchenette"));
        property.addAmenity(new Amenity("Wifi"));
        property.addAmenity(new Amenity("TV"));
        property.addAmenity(new Amenity("Bathroom essentials"));
        property.addAmenity(new Amenity("Bedroom comforts"));

        return property;
     }

}