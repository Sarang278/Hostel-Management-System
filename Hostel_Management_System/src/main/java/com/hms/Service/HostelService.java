package com.hms.Service;

import java.util.List;

import com.hms.entity.Hostel;

public interface HostelService {
    void addHostel(Hostel hostel);
    Hostel getHostelById(Long id);
    List<Hostel> listAllHostels();
    void updateHostel(Hostel hostel);
    void removeHostel(Long id);
}
