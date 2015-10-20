package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.common.Mapper;

public class CUDRService<T extends Mapper<D>, D> {

	@Autowired
	T dao;

	public List<D> selectAll() {
		return dao.selectAll();
	}
}
