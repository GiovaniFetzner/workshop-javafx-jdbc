package model.entities;

import java.util.List;

public interface DepartmentDao {

	void insert (Department department);
	void update (Department department);
	void deleteById(Integer id);
	Department findByID(Integer id);
	List<Department> findAll();
}
