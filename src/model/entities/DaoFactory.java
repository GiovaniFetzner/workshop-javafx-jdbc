package model.entities;

import db.DB;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartamentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
