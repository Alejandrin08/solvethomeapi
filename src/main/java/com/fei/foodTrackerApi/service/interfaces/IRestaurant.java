package com.fei.foodTrackerApi.service.interfaces;

import com.fei.foodTrackerApi.dto.RestaurantDTO;

import java.util.List;
import java.util.Map;

public interface IRestaurant {

    Map<String, Object> createRestaurant(Integer id, RestaurantDTO restaurantDTO);
    List<RestaurantDTO> getAllRestaurants();
    RestaurantDTO updateRestaurant(Integer id, RestaurantDTO restaurantDTO);
    List<RestaurantDTO> getAllRestaurantsByCategory(String category);
}
