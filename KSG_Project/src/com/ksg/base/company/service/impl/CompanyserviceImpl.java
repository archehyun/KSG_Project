package com.ksg.base.company.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksg.base.company.service.CompanyService;
import com.ksg.persistence.CompanyDAO;

@Service
public class CompanyserviceImpl implements CompanyService{
	
	@Autowired
	CompanyDAO companyDAO;

	@Override
	public void insert(Map parameterMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Map parameterMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(Map parameterMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Map parameterMap) {
		// TODO Auto-generated method stub
		
	}

	

}
