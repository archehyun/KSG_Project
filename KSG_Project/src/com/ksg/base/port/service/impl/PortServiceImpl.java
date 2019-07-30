package com.ksg.base.port.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksg.base.port.service.PortService;
import com.ksg.persistence.PortDAO;

@Service
public class PortServiceImpl implements PortService{
	
	@Autowired
	PortDAO portDAO;

}
