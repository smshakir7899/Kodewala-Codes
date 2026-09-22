package com.hotel.request.response;

import java.util.List;

import com.hotel.room.request.response.RoomResponse;

public class HotelResponse
{

	private Long id;
	private String name;
	private String location;
	private String description;
	private String status;

	private List<RoomResponse> rooms;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public List<RoomResponse> getRooms()
	{
		return rooms;
	}

	public void setRooms(List<RoomResponse> rooms)
	{
		this.rooms = rooms;
	}

}
