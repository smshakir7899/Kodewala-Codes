package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.HotelRequest;
import com.hotel.request.response.HotelResponse;
import com.hotel.service.HotelService;

@RestController
@RequestMapping("hotel")
public class HotelController
{

	@Autowired
	HotelService hotelService;

	@PostMapping("/create")
	public HotelResponse createHotel(@RequestBody HotelRequest hotelRequest)
	{

		return hotelService.createHotel(hotelRequest);
	}

	@GetMapping("/showRooms")
	public List<HotelResponse> getAllHotels()
	{
		return hotelService.getAllHotel();
	}

}
