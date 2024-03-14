package com.example.demo.service;


import com.example.demo.binding.DashboardReponse;
import com.example.demo.binding.DashboardReponse;
import com.example.demo.entity.Counsellor;
import com.example.demo.entity.Studentenq;

public interface CounsellorService {

	
	public String saveCounsellor(Counsellor c);

	public Counsellor loginCheck(Counsellor c);

	public boolean recoverPwd(String email);

	public DashboardReponse getDashBoardInfo(Integer cid);

	//public DashboardReponse getDashBoardInfo(Studentenq en);


}
