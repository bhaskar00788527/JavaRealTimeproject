package com.Bhaskar.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bhaskar.entity.SsaWebRequest;
import com.Bhaskar.entity.SsaWebResponse;
import com.Bhaskar.service.SsaWebService;

@RestController
public class SsaWebRestController {

	@Autowired
	private SsaWebService service;
	
	@PostMapping("/ssa")
	public SsaWebResponse getCitizenInfo(@RequestBody SsaWebRequest req) {
		return service.getCitizenInfo(req);
	}
	
}
