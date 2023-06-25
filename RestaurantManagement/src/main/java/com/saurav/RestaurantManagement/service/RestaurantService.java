package com.saurav.RestaurantManagement.service;

import com.saurav.RestaurantManagement.model.Restaurant;
import com.saurav.RestaurantManagement.repositery.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;
    public List<Restaurant> getAllRestaurant() {
        return restaurantRepo.getAllRestaurant();
    }

    public Restaurant getRestaurantById(String id) {
        return restaurantRepo.getRestaurantById(id);
    }

    public String addNewRestaurant(Restaurant restaurant) {
        return restaurantRepo.addNewRestaurant(restaurant);
    }

    public String updateRestaurantById(String restaurantId, Restaurant restaurant) {
        return restaurantRepo.updateRestaurantById(restaurantId,restaurant);
    }

    public String deleteRestaurantById(String restaurantId) {
        return restaurantRepo.deleteRestaurantById(restaurantId);
    }
}
