package com.Bhaskar.services;

import java.util.List;

import com.Bhaskar.bindings.SearchCriteria;
import com.Bhaskar.entities.Counselor;
import com.Bhaskar.entities.StudentEnq;

public interface EnquiryService 
{
	public boolean addEnq(StudentEnq se);
	
	public List<StudentEnq> getEnquiries(Integer cid,SearchCriteria s);

}
