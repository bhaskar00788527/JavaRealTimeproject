package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.binding.SearchCriteria;
import com.example.demo.entity.Studentenq;
import com.example.demo.service.EnquiryService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EnquiryController 
{
	@Autowired
	private EnquiryService enqService;
	
	@GetMapping("/enquiry")
	public String enqPage(Model model) 
	{
		model.addAttribute("enq", new Studentenq());
		return "addEnqView";
	}
	
	@PostMapping("/enquiry")
	public String addEnquiry(@ModelAttribute("enq") Studentenq enq,HttpServletRequest req,Model model) 
	{
		HttpSession session = req.getSession(false);
		Integer cid = (Integer)session.getAttribute("CID");
		
		if(cid==null) 
		{
			return "redirect:/logout";
		}
		
		enq.setCid(cid);
		
		boolean addEnq = enqService.addEnq(enq);
		
		
		if(addEnq) 
		{
			model.addAttribute("succMsg", "Enquiry Added");
		}
		else 
		{
			model.addAttribute("errMsg", "Enquiry Failed To Add");
		}
		return "addEnqView";
	}
	
	@GetMapping("/enquiries")
	public String viewEnquiries(HttpServletRequest req, Model model) 
	{
		HttpSession session = req.getSession(false);
		Integer cid = (Integer)session.getAttribute("CID");
		
		if(cid==null) 
		{
			return "redirect:/logout";
		}
		
		model.addAttribute("sc", new SearchCriteria(null, null, null));
		
		List<Studentenq> enquiriesList = enqService.getEnquiries(cid, new SearchCriteria(null, null, null));
		model.addAttribute("enquiries", enquiriesList);
		
		return "displayEnqView";
	}
	
	@PostMapping("/filter-enquiries")
	public String filterEnquiries(@ModelAttribute("sc") SearchCriteria sc,HttpServletRequest req, Model model) 
	{
		HttpSession session = req.getSession(false);
		Integer cid = (Integer)session.getAttribute("CID");
		
		List<Studentenq> enquiriesList = enqService.getEnquiries(cid,sc);
		model.addAttribute("enquiries", enquiriesList);
		
		return "displayEnqView";
	}

}
