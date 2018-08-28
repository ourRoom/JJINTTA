package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	ProjectService service;
	
	@RequestMapping("/listAll")
	public ModelAndView showList() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", service.getAllProject());
		mv.setViewName("project");
		
		return mv;
	}
}
