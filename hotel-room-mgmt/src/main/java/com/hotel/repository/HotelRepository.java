package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.entity.HotelEntity;

@Repository
public interface HotelRepository extends CrudRepository<HotelEntity, Long>
{

	@Query("SELECT h FROM HotelEntity h LEFT JOIN FETCH h.rooms")
	public List<HotelEntity> findAllHotelsWithRooms();
}
