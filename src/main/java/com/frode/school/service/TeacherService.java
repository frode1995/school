package com.frode.school.service;


import com.frode.school.repository.impl.po.TeacherPO;

public interface TeacherService {

    //UserAccountPO getUserAccountPOById (Integer id);
    TeacherPO getTeacherPOById(Integer tecId);
}
