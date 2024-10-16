package com.hms.Service;

import java.util.List;

import com.hms.entity.Warden;

public interface WardenService {
    void addWarden(Warden warden);
    Warden getWardenById(Long id);
    List<Warden> listAllWardens();
    void updateWarden(Warden warden);
    void removeWarden(Long id);
}
