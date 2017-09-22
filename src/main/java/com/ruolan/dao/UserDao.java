package com.ruolan.dao;


import com.ruolan.bean.User;
import com.ruolan.bean.UserInfo;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    public List<User> selectStudent(int index, int listrow) {

//        Map parmars = new HashMap<>();
//        parmars.put("index", index);
//        parmars.put("listrow", listrow);


        List<User> students = sqlSessionTemplate.selectList("com.ruolan.bean.StudentMapper.selectStudent");


        return students;
    }

    public List<UserInfo> selectUserInfo(int index,int listrow) {

        Map parmars = new HashMap<>();
        parmars.put("index", index);
        parmars.put("listrow", listrow);

        List<UserInfo> userInfos = sqlSessionTemplate.selectList("com.ruolan.bean.StudentMapper.selectUserInfo",parmars);

        return userInfos;
    }

    public List<UserInfo> selectInfo(int userId) {

        List<UserInfo> userInfos = sqlSessionTemplate.selectList("com.ruolan.bean.StudentMapper.selectUser",userId);

        return userInfos;
    }
}
