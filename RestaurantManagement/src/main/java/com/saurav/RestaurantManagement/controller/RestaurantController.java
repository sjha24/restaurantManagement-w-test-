package com.saurav.RestaurantManagement.controller;

import com.saurav.RestaurantManagement.model.Restaurant;
import com.saurav.RestaurantManagement.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @GetMapping(value = "all/restaurant")
    public List<Restaurant>getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }
    @GetMapping(value = "id")
    public Restaurant getRestaurantById(@PathVariable String id){
        return restaurantService.getRestaurantById(id);
    }
    @PostMapping(value = "/addNewRestaurant")
    public String addNewRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addNewRestaurant(restaurant);
    }
    @PutMapping(value = "/restaurantId/{restaurantId}")
    public String updateRestaurantById(@PathVariable String restaurantId, @RequestBody Restaurant restaurant){
        return restaurantService.updateRestaurantById(restaurantId,restaurant);
    }
    @DeleteMapping(value = "/restaurantId/{restaurantId}")
    public String deleteRestaurantById(@PathVariable String restaurantId){
        return restaurantService.deleteRestaurantById(restaurantId);
    }
}
