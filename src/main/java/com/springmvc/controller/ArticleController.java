package com.springmvc.controller;

import java.util.List;

import org.apache.log4j.Logger;
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
	private ArticleService articleService;

	private static final Logger LOGGER = Logger.getLogger(ArticleController.class);

	@RequestMapping("/list")
	public ModelAndView list() {
		LOGGER.info("Start list");
		PageHelper.startPage(1, 2);
		List<Article> list = articleService.selectAll();
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("list", list);
		return mav;
	}
}
