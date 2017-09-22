package com.ruolan.controller;

import java.util.List;

import javax.annotation.Resource;

import com.ruolan.bean.User;
import com.ruolan.bean.UserInfo;
import com.ruolan.service.StudentService;
import com.ruolan.utils.ResponseModel;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/student")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Resource(name = "studentService")
    private StudentService studentService;


    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public @ResponseBody
    ResponseModel<User> addStudent() {

        User student = new User(11, "bao", "天津市");

        studentService.addStudent(student);

        return ResponseModel.buildOk(student);

    }

    @RequestMapping(value = "/selectStudent", method = RequestMethod.GET)
    public @ResponseBody
    ResponseModel<List<User>> selectStudent(@Param("index") int index, @Param("listrow") int listrow) {

        List<User> userList = studentService.select(1,10);

        return ResponseModel.buildOk(userList);

    }

//    selectUserInfo

    @RequestMapping(value = "/selectUser", method = RequestMethod.GET)
    public @ResponseBody
    ResponseModel<List<UserInfo>> selectUserInfo(@Param("index") int index, @Param("listrow") int listrow) {

        List<UserInfo> userList = studentService.selectUserInfo(index,listrow);

        return ResponseModel.buildOk(userList);

    }

    @RequestMapping(value = "/selectUserInfo", method = RequestMethod.GET)
    public @ResponseBody
    ResponseModel<List<UserInfo>> selectUser(@Param("user_id") int user_id) {

        List<UserInfo> userList = studentService.selectUser(user_id);

        return ResponseModel.buildOk(userList);

    }

}
