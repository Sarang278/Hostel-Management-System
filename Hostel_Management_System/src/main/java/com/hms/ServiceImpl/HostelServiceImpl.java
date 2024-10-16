package com.hms.ServiceImpl;

import java.util.List;

import com.hms.DaoImpl.HostelDaoImpl;
import com.hms.Service.HostelService;
import com.hms.entity.Hostel;

public class HostelServiceImpl implements HostelService {

    private HostelDaoImpl hostelDao = new HostelDaoImpl();

    @Override
    public void addHostel(Hostel hostel) {
        hostelDao.saveHostel(hostel);
    }

    @Override
    public Hostel getHostelById(Long id) {
        return hostelDao.getHostelById(id);
    }

    @Override
    public List<Hostel> listAllHostels() {
        return hostelDao.getAllHostels();
    }

    @Override
    public void updateHostel(Hostel hostel) {
        hostelDao.updateHostel(hostel);
    }

    @Override
    public void removeHostel(Long id) {
        hostelDao.deleteHostel(id);
    }
}
