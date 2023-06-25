package com.saurav.RestaurantManagement.repositery;

import com.saurav.RestaurantManagement.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class RestaurantRepo {

    HashMap<String,Restaurant>map = new HashMap<>();
    public List<Restaurant> getAllRestaurant() {
        List<Restaurant>RestaurantList = new ArrayList<>();
        for(String id : map.keySet()){
            RestaurantList.add(map.get(id));
        }
        return RestaurantList;
    }

    public Restaurant getRestaurantById(String id) {
        return map.getOrDefault(id,null);
    }

    public String addNewRestaurant(Restaurant restaurant) {
        if(map.containsKey(restaurant.getRestaurantId())){
            return "Restaurant with this "+restaurant.getRestaurantId()+"all ready present";
        }
        map.put(restaurant.getRestaurantId(),restaurant);
        return "Restaurant with this id "+restaurant.getRestaurantId()+" added successfully";
    }

    public String updateRestaurantById(String restaurantId, Restaurant restaurant) {
        if(map.containsKey(restaurantId)){
            Restaurant originalRestaurant = map.get(restaurantId);
            if(restaurant.getName() != null){
                originalRestaurant.setName(restaurant.getName());
            }
            if(restaurant.getAddress() != null){
                originalRestaurant.setAddress(restaurant.getAddress());
            }
            if(restaurant.getNumber() != null){
                originalRestaurant.setNumber(restaurant.getNumber());
            }
            if(restaurant.getTotalStaff()!= null){
                originalRestaurant.setTotalStaff(restaurant.getTotalStaff());
            }
            if(restaurant.getSpeciality()!= null){
                originalRestaurant.setSpeciality(restaurant.getSpeciality());
            }
           return "Restaurant with this Id "+ restaurantId + "update successfully";
        }
        return "Restaurant with this Id "+restaurantId+"not found";
    }

    public String deleteRestaurantById(String restaurantId) {
        if(map.containsKey(restaurantId)){
            map.remove(restaurantId);
            return "Restaurant with this Id "+restaurantId + " deleted successfully";
        }

        return "Restaurant with this Id "+restaurantId + " not found";
    }
}
