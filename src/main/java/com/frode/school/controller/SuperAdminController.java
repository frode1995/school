package com.frode.school.controller;

import com.frode.school.repository.impl.po.SuperAdminPO;
import com.frode.school.service.SuperAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/superadmin")
public class SuperAdminController {

    @Autowired
    private SuperAdminService superAdminService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    private Map<String,Object> superAdminLoginController(@RequestParam Integer id ){
        //@ResponseBody这个注释在控制器为RestController的情况下加不加都一样，
        // 但是如果控制器是Controller类型就必须要加了,
        // 它可以把返回的对象直接解析为json对象返回客户端(强！)
        Map<String,Object> modelMap = new HashMap<>();
       // SuperAdminPO superAdminPO = superAdminService.getInfo(superAdminPO1.getId());//取得前台传过来的id
        SuperAdminPO superAdminPO = superAdminService.getInfo(id);
        modelMap.put("superAdminPO",superAdminPO);
        return  modelMap;
    }

}

/*
    private User listData(@RequestBody User user1){
        //@RequestBody是作用于参数的，它实现了把客户端传过来的json数据解析为对象，作为参数传进来，
        // 不过客户端传过来的数据类型必须是application/json,不然会出错，
        // 这也是为什么客户端一定要设置ajax的contentType属性为"application/json"的原因
        System.out.println("收到ajax请求！");
        System.out.println(user1.getName());
        User user = new User();
        user.setId(3);
        user.setName("frode");
        user.setPassword("1234");
        return user;

    }

    */
/*  @RequestMapping(value = "/login",method = RequestMethod.POST)
      @ResponseBody//必须返回
      private Map<String,Object> login(String name){
          Map<String,Object> modelMap = new HashMap<>();
          User user=userService.getInfo(name);
          modelMap.put("user",user);

          return  modelMap;

      }*//*

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public String login(@RequestBody String name){//得到前台的body
        User user = null;
        user=userService.getInfo(name);
        if (user!=null){
            return "true";
        }
        else{
            return "false";
        }

    }
}*/
