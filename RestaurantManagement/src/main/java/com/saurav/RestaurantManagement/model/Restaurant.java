package com.saurav.RestaurantManagement.model;

import lombok.Data;

@Data
public class Restaurant {
    private String restaurantId;
    private String name;
    private String address;
    private String number;
    private String speciality;
    private String totalStaff;
}
