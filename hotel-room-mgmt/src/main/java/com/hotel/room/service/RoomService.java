package com.hotel.room.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.HotelEntity;
import com.hotel.repository.HotelRepository;
import com.hotel.room.entity.RoomEntity;
import com.hotel.room.repository.RoomRepository;
import com.hotel.room.request.RoomRequest;
import com.hotel.room.request.response.RoomResponse;

@Service
public class RoomService
{
	@Autowired
	HotelRepository hotelRepository;

	@Autowired
	RoomRepository roomRepository;

	public RoomResponse createRoom(RoomRequest roomRequest)
	{

		HotelEntity hotelEntity = hotelRepository.findById(roomRequest.getHotelId()).orElseThrow();
		RoomEntity roomEntity = new RoomEntity();
		roomEntity.setRoomNumber(roomRequest.getRoomNumber());
		roomEntity.setRoomType(roomRequest.getRoomType());
		roomEntity.setPrice(roomRequest.getPrice());
		roomEntity.setAvailable(roomRequest.getAvailable());
		roomEntity.setHotel(hotelEntity);

		RoomEntity savedRooms = roomRepository.save(roomEntity);

		RoomResponse roomResponse = new RoomResponse();
		roomResponse.setId(savedRooms.getId());
		roomResponse.setRoomNumber(savedRooms.getRoomNumber());
		roomResponse.setRoomType(savedRooms.getRoomType());
		roomResponse.setPrice(savedRooms.getPrice());
		roomResponse.setAvailable(savedRooms.getAvailable());
		roomResponse.setHotelId(savedRooms.getId());
		return roomResponse;

	}

	/*
	 * public void getAllRooms() {
	 * 
	 * }
	 * 
	 * 
	 * public void getRoomById() {
	 * 
	 * }
	 * 
	 * public void deleteRoom() {
	 * 
	 * }
	 */
}
