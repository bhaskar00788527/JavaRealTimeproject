 package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.binding.SearchCriteria;
import com.example.demo.entity.Studentenq;
import com.example.demo.repo.StudentEnqRepo;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private StudentEnqRepo srepo;
	
	public boolean addEnq1(Studentenq se)
	{
		Studentenq savedEnq = srepo.save(se);
		return savedEnq.getEnqId()!=null;
	}

	@Override
	public List<Studentenq> getEnquiries1(Integer cid, SearchCriteria sc)
	{ 
		Studentenq enq = new Studentenq();
		 //Setting id
		enq.setCid(cid);
		 
		 //If mode selected add to query
		if(sc.getClassMode()!=null && !sc.getClassMode().equals("")) 
		{
			enq.setClassMode(sc.getClassMode());
		}
		
		if(sc.getCourseName()!=null && !sc.getCourseName().equals("")) 
		{
			enq.setCoursename(sc.getCourseName());
		}
		
		if(sc.getEnqStatus()!=null && !sc.getEnqStatus().equals("")) 
		{
			enq.setEnqstatus(sc.getEnqStatus());
		}
		
		Example<Studentenq> of = Example.of(enq);
		List<Studentenq> enquiries = srepo.findAll(of);
		
		return enquiries;
	}

	@Override
	public boolean addEnq(Studentenq se) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Studentenq> getEnquiries(Integer cid, SearchCriteria s) {
		// TODO Auto-generated method stub
		return null;
	}

}
