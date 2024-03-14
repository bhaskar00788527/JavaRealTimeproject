package com.Bhaskar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Bhaskar.bindings.DashboardResponse;
import com.Bhaskar.entities.Counselor;
import com.Bhaskar.services.CounselorService;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CounselorController
{
	
	@Autowired
	private CounselorService counselorSvc;
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model)
	{
		HttpSession session = req.getSession(false);
		session.invalidate();
		
		return "redirect:/";
	}               
	
	//This method is used to dispaly loginpage
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("counselor", new Counselor());
		return "loginView";
	}
	
	@PostMapping("/login")
	public String handleLogin(Counselor c,HttpServletRequest req, Model model) 
	{
		Counselor obj = counselorSvc.logInCheck(c.getEmail(),c.getPwd());
		
		if(obj==null) 
		{
			model.addAttribute("errMsg", "Invalid credentials ");
			return "loginView";
			 
		}
		
		HttpSession session = req.getSession(true);
		 session.setAttribute("CID", obj.getCid());
		
		
		return "redirect:dashboard";
	}
	
	@GetMapping("/dashboard")
	public String buildDashboard(HttpServletRequest req, Model model) 
	{
		HttpSession session = req.getSession(false);
		Object obj = session.getAttribute("CID");
		Integer cid = (Integer)obj;
		
		DashboardResponse dashboardInfo = counselorSvc.getDashboardInfo(cid);
		
		model.addAttribute("dashboard", dashboardInfo);
		
		
		return "dashboardView";
	}

	@GetMapping("/register")
	public String regPage(Model model) 
	{
		model.addAttribute("counselor", new Counselor());
		return "registerView";
	}
	
	
	@PostMapping("/register")
	public String handleRegistration(Counselor c,Model model) 
	{
		String msg = counselorSvc.saveCounselor(c);
		model.addAttribute("msg", msg);
		return "registerView";
	}
	
	@GetMapping("/forgot-pwd")
	public String recoverPwdPage(Model model)
	{
		return "forgotPwdView";
	}
	
	@GetMapping("/recover-pwd")
	public String recoverPwd(@RequestParam String email,Model model) 
	{
		boolean status = counselorSvc.recoverPwd(email);
		
		if(status) 
		{
			model.addAttribute("smsg", "Password sent to your email");
		}
		else 
		{
			model.addAttribute("errmsg", "invalid email");
		}
		return "forgotPwdView";
	}
	
	
	
	
}
