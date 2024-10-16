package com.hms.ServiceImpl;
import java.util.List;

import com.hms.DaoImpl.RoomDaoImpl;
import com.hms.Service.RoomService;
import com.hms.entity.Room;

public class RoomServiceImpl implements RoomService {

    private RoomDaoImpl roomDao = new RoomDaoImpl();

    @Override
    public void addRoom(Room room) {
        roomDao.saveRoom(room);
    }

    @Override
    public Room getRoomById(Long id) {
        return roomDao.getRoomById(id);
    }

    @Override
    public List<Room> listAllRooms() {
        return roomDao.getAllRooms();
    }

    @Override
    public void updateRoom(Room room) {
        roomDao.updateRoom(room);
    }

    @Override
    public void removeRoom(Long id) {
        roomDao.deleteRoom(id);
    }
}
