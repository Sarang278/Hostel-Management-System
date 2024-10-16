package com.hms.Dao;

import java.util.List;

import com.hms.entity.Room;

public interface RoomDao {
    void saveRoom(Room room);
    Room getRoomById(Long id);
    List<Room> getAllRooms();
    void updateRoom(Room room);
    void deleteRoom(Long id);
}
