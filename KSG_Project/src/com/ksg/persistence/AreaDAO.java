package com.ksg.persistence;

import org.springframework.stereotype.Repository;

@Repository
public class AreaDAO extends AbstractDAO{
	
	public AreaDAO() {
		System.out.println("create");
	}

	
	public void insert() {
		System.out.println("insert");
	}
	public void delete() {}
	public void select() {}
	public void update() {}
}
