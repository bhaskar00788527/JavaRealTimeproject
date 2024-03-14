package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.DashboardReponse;
import com.example.demo.entity.Counsellor;
import com.example.demo.entity.Studentenq;
import com.example.demo.repo.CounsellorRepo;
import com.example.demo.repo.StudentEnqRepo;
import com.example.demo.util.EmailUtils;

@Service
public class CounsellorServiceImpl implements CounsellorService {

	@Autowired
	private CounsellorRepo crepo;
	
	@Autowired
	private StudentEnqRepo srepo;
	
	@Autowired
	private EmailUtils emailUtils;
	
	@Override
	public String saveCounsellor(Counsellor c) {
		Counsellor obj=crepo.findByEmail(c.getEmail());
		if(obj!= null) {
			return "Duplicate email";
		}
		
		Counsellor saveobj=crepo.save(c);
		if(saveobj.getCid()!= null) {
			return "Registraction successfully";
		}
		return "Registraction failed";
	}
	@Override
	public Counsellor loginCheck(Counsellor c) {
		return crepo.findByEmailAndPassword(c.getEmail(),c.getPassword());
 		
	}
	
	@Override
	public boolean recoverPwd(String email) {

		Counsellor c=crepo.findByEmail(email);
		if(c==null) {
			return false;
		}
		String subject="Recover Password :Ashok it";
		String body="<h1>Your password :"+c.getPassword()+"</h1>";
		 return emailUtils.sendEmail(subject,body,email);

	}
	@Override
	public DashboardReponse getDashBoardInfo(Integer cid) {
		
		List<Studentenq> allEnqs=srepo.findByCid(cid);
		
		int enrolledEnqs=allEnqs.stream()
				                .filter(e ->e.getEnqstatus() .equals("Enrolled"))
				                .collect(Collectors.toList())
				                .size();  
		
		DashboardReponse resp=new DashboardReponse();
		
		resp.setTotalenq(allEnqs.size());
		resp.setEnrolledenq(enrolledEnqs);
		resp.setLostenq(allEnqs.size() - enrolledEnqs);
		
 		return resp;
 		
	}

	}

	
	
	
	
	




