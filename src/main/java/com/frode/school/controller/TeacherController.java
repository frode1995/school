package com.frode.school.controller;


import com.frode.school.repository.impl.po.TeacherPO;
import com.frode.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

   // @RequestParam用来获得静态的URL请求入参

    @RequestMapping(value = "/{tecId}",method = RequestMethod.GET)
    public TeacherPO getTeacherById(@PathVariable("tecId") Integer tecId){
        return teacherService.getTeacherPOById(tecId);

    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring Boot!";
    }





}


/*
@RestController
@RequestMapping("/api")
public class UserController {



    @Autowired
    private UserRestService userRestService;


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public UserAccountPO getUserAccountById(@PathVariable("id") Integer id){
        return userRestService.getUserAccountPOById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserAccountPO getUserAccountById(){
        return userRestService.getUserAccountPOById(1);
    }



    */
/*@RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserAccountByIds() {
        return "hello";
    }*//*


}*/
