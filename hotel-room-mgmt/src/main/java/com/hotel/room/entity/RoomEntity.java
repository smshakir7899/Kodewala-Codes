package com.hotel.room.entity;

import com.hotel.entity.HotelEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class RoomEntity
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String roomNumber;
	private String roomType;
	private Double price;
	private Boolean available;

	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private HotelEntity hotel;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

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

	public HotelEntity getHotel()
	{
		return hotel;
	}

	public void setHotel(HotelEntity hotel)
	{
		this.hotel = hotel;
	}

}
