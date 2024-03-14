package com.Bhaskar.services;

import com.Bhaskar.bindings.DashboardResponse;
import com.Bhaskar.entities.Counselor;

public interface CounselorService
{
	public String saveCounselor(Counselor c);
	
	public Counselor logInCheck(String email,String pwd);
	
	public  boolean recoverPwd(String email);
	
	public DashboardResponse getDashboardInfo(Integer cid);

}
