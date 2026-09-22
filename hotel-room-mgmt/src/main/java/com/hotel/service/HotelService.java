package com.hotel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.HotelEntity;
import com.hotel.entity.HotelRequest;
import com.hotel.repository.HotelRepository;
import com.hotel.request.response.HotelResponse;
import com.hotel.room.entity.RoomEntity;
import com.hotel.room.request.response.RoomResponse;

@Service
public class HotelService
{

	@Autowired
	HotelRepository hotelRepository;

	public HotelResponse createHotel(HotelRequest hotelRequest)
	{

		HotelEntity hotelEntity = new HotelEntity();
		hotelEntity.setName(hotelRequest.getName());
		hotelEntity.setLocation(hotelRequest.getLocation());
		hotelEntity.setDescription(hotelRequest.getDescription());
		hotelEntity.setStatus(hotelRequest.getStatus());

		HotelEntity savedHotel = hotelRepository.save(hotelEntity);

		HotelResponse hotelResponse = new HotelResponse();
		hotelResponse.setId(savedHotel.getId());
		hotelResponse.setName(savedHotel.getName());
		hotelResponse.setLocation(savedHotel.getLocation());
		hotelResponse.setDescription(savedHotel.getDescription());
		hotelResponse.setStatus(savedHotel.getStatus());
		return hotelResponse;

	}

	public List<HotelResponse> getAllHotel()
	{

		Iterable<HotelEntity> hotels = hotelRepository.findAllHotelsWithRooms();
		List<HotelResponse> responses = new ArrayList<>();

		for (HotelEntity hotelEntity : hotels)
		{
			HotelResponse response = new HotelResponse();

			response.setId(hotelEntity.getId());
			response.setName(hotelEntity.getName());
			response.setLocation(hotelEntity.getLocation());
			response.setDescription(hotelEntity.getDescription());
			response.setStatus(hotelEntity.getStatus());

			List<RoomResponse> roomResponses = new ArrayList<>();

			for (RoomEntity room : hotelEntity.getRooms())
			{
				RoomResponse roomResponse = new RoomResponse();

				roomResponse.setId(room.getId());
				roomResponse.setRoomNumber(room.getRoomNumber());
				roomResponse.setRoomType(room.getRoomType());
				roomResponse.setPrice(room.getPrice());
				roomResponse.setAvailable(room.getAvailable());
				roomResponse.setHotelId(hotelEntity.getId());

				roomResponses.add(roomResponse);
			}

			response.setRooms(roomResponses);
			responses.add(response);
		}
		return responses;

	}
//
//	public void getHotelById()
//	{
//
//	}
//
//	public void deleteHotel()
//	{
//
//	}
}
