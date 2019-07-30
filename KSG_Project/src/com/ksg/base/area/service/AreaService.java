package com.ksg.base.area.service;

import java.util.Map;

/**
 * @author LDCC
 *
 */
public interface AreaService {
	
	

	public void insert(Map parameterMap);	
	
	public void delete(Map parameterMap);
	public void select(Map parameterMap);
	public void selectInfo(Map parameterMap);
	public void selectInfoCount(Map parameterMap);
	public void update(Map parameterMap);

}
