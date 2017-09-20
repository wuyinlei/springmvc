package com.ruolan.controller;

import java.util.List;

import javax.annotation.Resource;

import com.ruolan.bean.User;
import com.ruolan.service.ResponseResult;
import com.ruolan.service.StudentService;
import com.ruolan.utils.RestResultGenerator;
import com.ruolan.utils.Result;
import com.ruolan.utils.ResultUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/student")
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Resource(name="studentService")
	private StudentService studentService;
	
	
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value="/addStudent", method = RequestMethod.GET)
	public @ResponseBody
	Result<User> addStudent(){
		
		User student=new User(11,"bao","天津市");

		studentService.addStudent(student);
		
		return ResultUtil.success(student);
		
	}
	
	@RequestMapping(value="/selectStudent", method = RequestMethod.GET)
	public @ResponseBody
	ResponseResult<List<User>> selectStudent(){
		
		 List<User> userList = studentService.select();
	        return RestResultGenerator.genResult(userList, "成功!");
		
	}
	
}
