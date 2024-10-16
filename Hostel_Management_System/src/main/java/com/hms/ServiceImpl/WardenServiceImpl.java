package com.hms.ServiceImpl;

import java.util.List;

import com.hms.DaoImpl.WardenDaoImpl;
import com.hms.Service.WardenService;
import com.hms.entity.Warden;

public class WardenServiceImpl implements WardenService {

    private WardenDaoImpl wardenDao = new WardenDaoImpl();

    @Override
    public void addWarden(Warden warden) {
        wardenDao.saveWarden(warden);
    }

    @Override
    public Warden getWardenById(Long id) {
        return wardenDao.getWardenById(id);
    }

    @Override
    public List<Warden> listAllWardens() {
        return wardenDao.getAllWardens();
    }

    @Override
    public void updateWarden(Warden warden) {
        wardenDao.updateWarden(warden);
    }

    @Override
    public void removeWarden(Long id) {
        wardenDao.deleteWarden(id);
    }
}
