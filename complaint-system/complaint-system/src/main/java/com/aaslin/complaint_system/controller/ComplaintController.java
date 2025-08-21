package com.aaslin.complaint_system.controller;

import com.aaslin.complaint_system.entity.Complaint;
import com.aaslin.complaint_system.service.ComplaintService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ComplaintController {

    private final ComplaintService service;
    public ComplaintController(ComplaintService service) { this.service = service; }
   
    @GetMapping("/")
    public String homeRedirect() { return "redirect:/complaints"; }

    @GetMapping("/complaints")
    public String list(@RequestParam(value = "status", required = false) Complaint.Status status,
                       Model model,
                       @ModelAttribute("msg") String msg) {
        model.addAttribute("complaints", service.getByStatus(status));
        model.addAttribute("selectedStatus", status);
        model.addAttribute("msg", msg);
        return "list";
    }

    @GetMapping("/complaints/new")
    public String showCreate(Model model) {
        model.addAttribute("complaint", new Complaint());
        return "register";
    }

    @PostMapping("/complaints")
    public String create(@ModelAttribute Complaint complaint, RedirectAttributes ra) {
        service.create(complaint);
        ra.addFlashAttribute("msg", "Complaint created successfully.");
        return "redirect:/complaints";
    }

    @GetMapping("/complaints/edit/{id}")
    public String showEdit(@PathVariable Long id, Model model) {
        model.addAttribute("complaint", service.getById(id));
        return "update";
    }

    @PostMapping("/complaints/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Complaint complaint, RedirectAttributes ra) {
        service.update(id, complaint);
        ra.addFlashAttribute("msg", "Complaint updated.");
        return "redirect:/complaints";
    }

    @GetMapping("/complaints/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes ra) {
        service.delete(id);
        ra.addFlashAttribute("msg", "Complaint deleted.");
        return "redirect:/complaints";
    }

    @GetMapping("/complaints/delete")
    public String deletePage() { return "delete"; }

    @PostMapping("/complaints/delete-by-days")
    public String deleteByDays(@RequestParam int days, RedirectAttributes ra) {
        int count = service.deleteResolvedOlderThanDays(days);
        ra.addFlashAttribute("msg", count + " resolved complaints removed.");
        return "redirect:/complaints";
    }

    @GetMapping("/success")
    public String successPage() { return "success"; }
}
