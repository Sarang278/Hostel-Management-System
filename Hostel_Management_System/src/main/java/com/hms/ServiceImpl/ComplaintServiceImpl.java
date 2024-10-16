package com.hms.ServiceImpl;

import java.util.List;

import com.hms.DaoImpl.ComplaintDaoImpl;
import com.hms.Service.ComplaintService;
import com.hms.entity.Complaint;

public class ComplaintServiceImpl implements ComplaintService {

    private ComplaintDaoImpl complaintDao = new ComplaintDaoImpl();

    @Override
    public void addComplaint(Complaint complaint) {
        complaintDao.saveComplaint(complaint);
    }

    @Override
    public Complaint getComplaintById(Long id) {
        return complaintDao.getComplaintById(id);
    }

    @Override
    public List<Complaint> listAllComplaints() {
        return complaintDao.getAllComplaints();
    }

    @Override
    public void updateComplaint(Complaint complaint) {
        complaintDao.updateComplaint(complaint);
    }

    @Override
    public void removeComplaint(Long id) {
        complaintDao.deleteComplaint(id);
    }
}
