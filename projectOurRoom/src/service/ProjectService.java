package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IProjectDao;
import model.Project;

@Service
public class ProjectService {

	@Autowired
	IProjectDao dao;
	
	public List<Project> getAllProject(){
		return dao.selAll();
	}
}
