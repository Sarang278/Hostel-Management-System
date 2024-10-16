package com.hms.Dao;

import java.util.List;

import com.hms.entity.Complaint;

public interface ComplaintDao {
    void saveComplaint(Complaint complaint);
    Complaint getComplaintById(Long id);
    List<Complaint> getAllComplaints();
    void updateComplaint(Complaint complaint);
    void deleteComplaint(Long id);
}

