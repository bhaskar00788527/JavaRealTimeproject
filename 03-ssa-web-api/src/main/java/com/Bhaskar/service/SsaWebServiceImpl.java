package com.Bhaskar.service;

import org.springframework.stereotype.Service;

import com.Bhaskar.entity.SsaWebRequest;
import com.Bhaskar.entity.SsaWebResponse;

@Service
public class SsaWebServiceImpl implements SsaWebService {

    SsaWebResponse response=new SsaWebResponse();
    
	@Override
	public SsaWebResponse getCitizenInfo(SsaWebRequest req) {
		Long ssn = req.getSsn();
		
		response.setSsn(ssn); 
		
	String ssnstr=String.valueOf(ssn);

	
	if(ssnstr.startsWith("1")) {
		response.setStateName("New Jersy");
	}
	else if(ssnstr.startsWith("2")) {
		response.setStateName("Texas");
		}
	else if(ssnstr.startsWith("3")) {
		response.setStateName("Kentuchy");
	}
	else if(ssnstr.startsWith("4")) {
		response.setStateName("Rhode Island");
	}
	else if(ssnstr.startsWith("5")) {
		response.setStateName("Albama");
	}
	else if(ssnstr.startsWith("6")) {
		response.setStateName("kalifonia");
	}
	else if (ssnstr.startsWith("7")) {
		response.setStateName("Stanford");
	}
	else if(ssnstr.startsWith("8")){
		response.setStateName("Ohio");
	}
    else if(ssnstr.startsWith("9")) {
    	response.setStateName("Dallas");
	}
	return response;
	
	}
}



	
