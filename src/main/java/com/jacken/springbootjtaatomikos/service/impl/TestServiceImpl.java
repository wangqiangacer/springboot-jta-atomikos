package com.jacken.springbootjtaatomikos.service.impl;


import com.jacken.springbootjtaatomikos.dao.test1.TestDBDao;
import com.jacken.springbootjtaatomikos.dao.test2.TestDB2Dao;
import com.jacken.springbootjtaatomikos.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {
	@Resource
	private TestDBDao test1;
	@Resource
	private TestDB2Dao test2;

	@Transactional
	public void save() {
		test1.saveTest("xiaoming");
		test2.saveTest("xiaoming");
	}
}
