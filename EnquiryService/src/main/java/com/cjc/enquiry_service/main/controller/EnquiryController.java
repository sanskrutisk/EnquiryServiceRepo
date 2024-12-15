package com.cjc.enquiry_service.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.enquiry_service.main.model.EnquiryDetails;
import com.cjc.enquiry_service.main.service.EnquiryService;

@RestController
public class EnquiryController {
	
	@Autowired private EnquiryService enquiryService;
	
	@PostMapping("/save-enquiry")
	public ResponseEntity<EnquiryDetails> onSaveEnquiry(@RequestBody EnquiryDetails enquiryDetails)
	{
		EnquiryDetails enquiryDetailsRef=enquiryService.saveEnquiry(enquiryDetails);
		
		return new ResponseEntity<EnquiryDetails>(enquiryDetailsRef,HttpStatus.CREATED);
	}

}
