package com.frode.school.service.impl;

import com.frode.school.repository.TeacherRepository;
import com.frode.school.repository.impl.po.TeacherPO;
import com.frode.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//将自动注册到Spring容器，不需要再在applicationContext.xml文件定义bean了，
// 类似的还包括@Component、@Repository、@Controller。
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public TeacherPO getTeacherPOById(Integer tecId) {
        return teacherRepository.getTeacherPOById(tecId);
    }
}

/*
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserAccountRepository userAccountRepository;


    @Override
    public UserAccountPO getUserAccountPOById(Integer id) {
        return userAccountRepository.getUserAccountPOById(id);
    }
}*/
