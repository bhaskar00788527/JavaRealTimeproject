package com.Bhaskar.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bhaskar.bindings.DashboardResponse;
import com.Bhaskar.entities.Counselor;
import com.Bhaskar.entities.StudentEnq;
import com.Bhaskar.repositories.CounselorRepo;
import com.Bhaskar.repositories.StudentEnqRepo;
import com.Bhaskar.utilities.EmailUtils;

@Service
public class CounselorServiceImpl implements CounselorService
{

	@Autowired
	EmailUtils emailUtils;
	
	@Autowired
	StudentEnqRepo srepo;
	
	@Autowired
	 private CounselorRepo cnslRepo;
	
	@Override
	public String saveCounselor(Counselor c) 
	{
		//-->>Verfiying duplicate email
		   Counselor obj = cnslRepo.findByEmail(c.getEmail());
		   
		   if(obj!=null) 
		   {
			   return "Duplicate Email";
		   }
		//<<--   
		Counselor svdObj = cnslRepo.save(c);
		if(svdObj.getCid()!=null) 
		{
			return "Registration Sucess";
		}
		return "Registration Failed";
	}

	@Override
	public Counselor logInCheck(String email, String pwd)
	{
		
		return cnslRepo.findByEmailAndPwd(email, pwd);
		
	}

	@Override
	public boolean recoverPwd(String email) 
	{
		Counselor c = cnslRepo.findByEmail(email);
		
		if(c==null)
		{
			return false;
		}
		
		String subject = "Recover Password -Tritect.Ltd";
		String body = "<h1>Your Password is :"+c.getPwd()+"</h1>";
		
        return emailUtils.sendEmail(subject, body, email);
		
		
	}

	@Override
	public DashboardResponse getDashboardInfo(Integer cid) {
		
		List<StudentEnq> allEnqs = srepo.findByCid(cid);
		
	 int enrolledEnqs = allEnqs.stream()
			 .filter(e->e.getEnqStatus().equals("Enrolled"))
			 .collect(Collectors.toList()).size();
		
		DashboardResponse resp = new DashboardResponse();
		 
		resp.setTotalEnq(allEnqs.size());
		resp.setEnrolledEnq(enrolledEnqs);
		resp.setLostEnq(allEnqs.size()-enrolledEnqs);
		 
		return resp;
	}
	 

}
