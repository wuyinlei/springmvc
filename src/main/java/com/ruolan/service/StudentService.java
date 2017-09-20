package com.ruolan.service;


import com.ruolan.bean.User;
import com.ruolan.dao.UserDao;

import java.util.List;

public class StudentService {

    private UserDao studentDao;

    public UserDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(UserDao studentDao) {
        this.studentDao = studentDao;
    }

    public void addStudent(User student) {
        // TODO Auto-generated method stub
        studentDao.addStudent(student);
    }

    public List<User> select() {
        return studentDao.selectStudent();
    }

}
