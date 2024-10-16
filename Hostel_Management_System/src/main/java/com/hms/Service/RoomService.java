package com.hms.Service;

import java.util.List;

import com.hms.entity.Room;

public interface RoomService {
    void addRoom(Room room);
    Room getRoomById(Long id);
    List<Room> listAllRooms();
    void updateRoom(Room room);
    void removeRoom(Long id);
}

