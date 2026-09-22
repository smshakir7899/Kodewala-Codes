package com.hotel.room.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hotel.room.entity.RoomEntity;

@Repository
public interface RoomRepository extends CrudRepository<RoomEntity, Long>
{

}
