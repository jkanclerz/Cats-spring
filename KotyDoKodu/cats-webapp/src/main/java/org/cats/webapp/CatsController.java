package org.cats.webapp;

import org.cats.application.CatDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CatsController {
	
	@Autowired
	private CatDAO catdao;
	//@Autowired
	//private Cat cat;
	
	@RequestMapping("/list")
	public String list(Model model) {
		return "list";
	}
	
	@RequestMapping("/cat/addCatToCollection")
	public String addCat(Model model) {
		return "addCat";
	}
	@RequestMapping("/cat-{id}")
	public String details(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("kot", catdao.getCatID(0));
		return "details";
	}
	
}
