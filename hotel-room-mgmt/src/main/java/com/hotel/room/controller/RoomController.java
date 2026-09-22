package com.hotel.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.room.request.RoomRequest;
import com.hotel.room.request.response.RoomResponse;
import com.hotel.room.service.RoomService;

@RestController
@RequestMapping("room")
public class RoomController
{

	@Autowired
	RoomService roomService;

	@PostMapping("/create")
	public RoomResponse createRoom(@RequestBody RoomRequest roomRequest)
	{
		return roomService.createRoom(roomRequest);

	}
}
