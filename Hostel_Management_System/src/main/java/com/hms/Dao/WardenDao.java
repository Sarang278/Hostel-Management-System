package com.hms.Dao;

import java.util.List;

import com.hms.entity.Warden;

public interface WardenDao {
    void saveWarden(Warden warden);
    Warden getWardenById(Long id);
    List<Warden> getAllWardens();
    void updateWarden(Warden warden);
    void deleteWarden(Long id);
}

