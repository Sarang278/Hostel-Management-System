package com.hms.Dao;

import java.util.List;

import com.hms.entity.Hostel;

public interface HostelDao {
    void saveHostel(Hostel hostel);
    Hostel getHostelById(Long id);
    List<Hostel> getAllHostels();
    void updateHostel(Hostel hostel);
    void deleteHostel(Long id);
}
