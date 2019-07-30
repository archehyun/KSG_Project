package com.ksg.base.area.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksg.base.area.service.AreaService;

import com.ksg.persistence.AreaDAO;

@Service("areaService")
public class AreaServiceImpl implements AreaService{

	@Autowired
	AreaDAO areaDAO;
	
	

	
	/**
	 * @Method Name : insert
	 * @param parameterMap
	 * @date: 2019. 06. 27
	 * @history
	 * -------------------------------
	 * 변경일                      작성자          변경내용
	 * ------------------------------
	 * 2019. 06. 27. 박창현          최초작성
	 * @return {@link TransferObject}
	 */
	@Override
	public void insert(Map param) {
		areaDAO.insert();
		
	}
	
	/**
	 * @Method Name : delete
	 * @param parameterMap
	 * @date: 2019. 06. 27
	 * @history
	 * -------------------------------
	 * 변경일                      작성자          변경내용
	 * ------------------------------
	 * 2019. 06. 27. 박창현          최초작성
	 * @return {@link TransferObject}
	 */
	@Override
	public void delete(Map parameterMap) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @Method Name : select
	 * @param parameterMap
	 * @date: 2019. 06. 27
	 * @history
	 * -------------------------------
	 * 변경일                      작성자          변경내용
	 * ------------------------------
	 * 2019. 06. 27. 박창현          최초작성
	 * @return {@link TransferObject}
	 */
	@Override
	public void select(Map parameterMap) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @Method Name : update
	 * @param parameterMap
	 * @date: 2019. 06. 27
	 * @history
	 * -------------------------------
	 * 변경일                      작성자          변경내용
	 * ------------------------------
	 * 2019. 06. 27. 박창현          최초작성
	 * @return {@link TransferObject}
	 */
	@Override
	public void update(Map parameterMap) {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * @Method Name : selectInfo
	 * @param parameterMap
	 * @date: 2019. 06. 27
	 * @history
	 * -------------------------------
	 * 변경일                      작성자          변경내용
	 * ------------------------------
	 * 2019. 06. 27. 박창현          최초작성
	 * @return {@link TransferObject}
	 */
	@Override
	public void selectInfo(Map parameterMap) {
		
		
	}
	
	/**
	 * @Method Name : selectInfoCount
	 * @param parameterMap
	 * @date: 2019. 06. 27
	 * @history
	 * -------------------------------
	 * 변경일                      작성자          변경내용
	 * ------------------------------
	 * 2019. 06. 27. 박창현          최초작성
	 * @return {@link TransferObject}
	 */
	@Override
	public void selectInfoCount(Map parameterMap) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		AreaServiceImpl imp = new AreaServiceImpl();
		imp.insert(null);
	}
	

}
