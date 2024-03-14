package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.DashboardReponse;
import com.example.demo.entity.Counsellor;
import com.example.demo.repo.CounsellorRepo;
import com.example.demo.service.EnquiryService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import com.example.demo.service.CounsellorService;

@Controller
public class CounsellorController {

	@Autowired
	private CounsellorService counsellorsvc;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("counsellor", new Counsellor());
		return "loginView";
	}

	@PostMapping("/login")
	public String handleLogin(Counsellor c,HttpServletRequest req, Model model) {
		 Counsellor obj=counsellorsvc.loginCheck(c);
		 if (obj == null) {
		model.addAttribute("errMsg", "Invalid Credentials");
		return "loginView";
		 }
		 
		 HttpSession session=req.getSession(true);
		  session.setAttribute("CID", obj.getCid());
		 
		 return "redirect:dashboard";
	}

	@GetMapping("/dashboard")
	public String buildDashboard(HttpServletRequest req,Model model) {
		
		HttpSession session=req.getSession(false);
		Object obj=session.getAttribute("CID");
		Integer cid=(Integer)obj;
			
		DashboardReponse dashboardInfo=counsellorsvc.getDashBoardInfo(cid);
		
		model.addAttribute("dashboard", dashboardInfo);
		
		return "dashboardView";
	}

	@GetMapping("/register")
	public String regView(Model model) {
		model.addAttribute("counsellor", new Counsellor());
		return "registerView";
	}

	/*
	 * @PostMapping("/register") public String handleRegistration( Counsellor c,
	 * Model model) { String msg = counsellorsvc.saveCounsellor(c);
	 * model.addAttribute("msg", msg); return "registerView"; }
	 */

	@PostMapping("/register")
	public String handleRegistration(Counsellor c, Model model) {
		String msg = counsellorsvc.saveCounsellor(c);
		model.addAttribute("msg", "Registration Succesful");
		return "registerView";
	}

	@GetMapping("/forgot-pwd")
	public String recoverPwdPage(Model model) {
		return "forgotPwdView";
	}

	@GetMapping("/recover-pwd")
	public String recoverPwd(@RequestParam String email, Model model) {
		boolean status = counsellorsvc.recoverPwd(email);
		if (status) {
			model.addAttribute("smsg", "Pwd sent to email");
		} else {
			model.addAttribute("errmsg", "Invalid Email");
		}
		return "forgotPwdView";
	}

}
