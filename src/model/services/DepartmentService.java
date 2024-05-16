package model.services;

import java.util.List;

import model.entities.DaoFactory;
import model.entities.Department;
import model.entities.DepartmentDao;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartamentDao();

	public List<Department> findAll(){
		return dao.findAll();
	}
	
	public void saveOrUpdate(Department obj) {
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
}
