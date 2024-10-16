package com.hms.Service;

import java.util.List;

import com.hms.entity.Complaint;

public interface ComplaintService {
    void addComplaint(Complaint complaint);
    Complaint getComplaintById(Long id);
    List<Complaint> listAllComplaints();
    void updateComplaint(Complaint complaint);
    void removeComplaint(Long id);
}

