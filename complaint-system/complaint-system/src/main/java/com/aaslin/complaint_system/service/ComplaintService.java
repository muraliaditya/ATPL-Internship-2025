package com.aaslin.complaint_system.service;

import com.aaslin.complaint_system.entity.Complaint;
import com.aaslin.complaint_system.repository.ComplaintRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ComplaintService {

    private final ComplaintRepository repo;

    public ComplaintService(ComplaintRepository repo) {
        this.repo = repo;
    }

    public Complaint create(Complaint c) { return repo.save(c); }

    public List<Complaint> getAll() { return repo.findAll(); }
    public Complaint getById(Long id) { return repo.findById(id).orElseThrow(); }
    public List<Complaint> getByStatus(Complaint.Status status) {
        return (status == null) ? repo.findAll() : repo.findByStatus(status);
    }

    public Complaint update(Long id, Complaint updated) {
        Complaint db = getById(id);
        db.setDescription(updated.getDescription());
        db.setCategory(updated.getCategory());
        db.setPriority(updated.getPriority());
        db.setStatus(updated.getStatus());
        return repo.save(db);
    }

    public void delete(Long id) { repo.deleteById(id); }

    public int deleteResolvedOlderThanDays(int days) {
        LocalDateTime cutoff = LocalDateTime.now().minusDays(days);
        return (int) repo.deleteByStatusAndCreatedAtBefore(Complaint.Status.RESOLVED, cutoff);
    }
}
