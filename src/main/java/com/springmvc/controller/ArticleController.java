package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.springmvc.model.Article;
import com.springmvc.service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	ArticleService articleService;

	@RequestMapping("/list")
	public ModelAndView list() {
		PageHelper.startPage(1, 2);
		List<Article> list = articleService.selectAll();
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("list", list);
		return mav;
	}
}
