package com.ruolan.dao;


import com.ruolan.bean.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;


public class UserDao {

	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public void addStudent(User student) {
		int i = sqlSessionTemplate.insert("com.ruolan.bean.StudentMapper.addStudent", student);
		System.out.println(i);
	}

	public List<User> selectStudent() {


		List<User> students = sqlSessionTemplate.selectList("com.ruolan.bean.StudentMapper.selectStudent");

		return students;
	}
}
