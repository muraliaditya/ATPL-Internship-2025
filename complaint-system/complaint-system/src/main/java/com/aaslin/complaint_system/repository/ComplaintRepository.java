package com.aaslin.complaint_system.repository;

import com.aaslin.complaint_system.entity.Complaint;
import com.aaslin.complaint_system.entity.Complaint.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    List<Complaint> findByStatus(Status status);
    long deleteByStatusAndCreatedAtBefore(Status status, LocalDateTime cutoff);
}
