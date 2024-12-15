package com.cjc.enquiry_service.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.enquiry_service.main.model.EnquiryDetails;
import com.cjc.enquiry_service.main.repository.EnquiryRepository;
import com.cjc.enquiry_service.main.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired private EnquiryRepository enquiryRepository;
	@Override
	public EnquiryDetails saveEnquiry(EnquiryDetails enquiryDetails) {
		
		
		return enquiryRepository.save(enquiryDetails);
	}

}
