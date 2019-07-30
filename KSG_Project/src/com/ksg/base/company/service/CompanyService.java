package com.ksg.base.company.service;

import java.util.Map;

public interface CompanyService {
	public void insert(Map parameterMap);
	public void delete(Map parameterMap);
	public void select(Map parameterMap);
	public void update(Map parameterMap);

}
