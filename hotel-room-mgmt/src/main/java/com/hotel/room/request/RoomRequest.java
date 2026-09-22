package com.hotel.room.request;

public class RoomRequest
{

	private String roomNumber;
	private String roomType;
	private Double price;
	private Boolean available;
	private Long hotelId;

	public String getRoomNumber()
	{
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber)
	{
		this.roomNumber = roomNumber;
	}

	public String getRoomType()
	{
		return roomType;
	}

	public void setRoomType(String roomType)
	{
		this.roomType = roomType;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}

	public Boolean getAvailable()
	{
		return available;
	}

	public void setAvailable(Boolean available)
	{
		this.available = available;
	}

	public Long getHotelId()
	{
		return hotelId;
	}

	public void setHotelId(Long hotelId)
	{
		this.hotelId = hotelId;
	}

}
