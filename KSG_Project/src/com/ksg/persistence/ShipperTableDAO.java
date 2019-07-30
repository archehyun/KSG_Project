package com.ksg.persistence;

import org.springframework.stereotype.Repository;

@Repository
public class ShipperTableDAO extends AbstractDAO{
	public void insert() {}
	public void delete() {}
	public void select() {}
	public void update() {}

	public static void main(String[] args) {
		ShipperTableDAO dao = new ShipperTableDAO();
	}

}
