package com.frode.school.repository.impl;

import com.frode.school.repository.TeacherRepository;
import com.frode.school.repository.impl.mapper.TeacherMapper;
import com.frode.school.repository.impl.po.TeacherPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepositoryImpl implements TeacherRepository {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public  TeacherPO getTeacherPOById(Integer tecId) {
       return teacherMapper.getTeacherPOById(tecId);
    }


//    public UserAccountPO getUserAccountPOById(Integer id) {
//        return userAccountMapper.getUserAccountPOById(id);
//    }


}
