package com.Bhaskar.service;

import com.Bhaskar.entity.SsaWebRequest;
import com.Bhaskar.entity.SsaWebResponse;


public interface SsaWebService {
	
	public SsaWebResponse getCitizenInfo(SsaWebRequest req);

}
