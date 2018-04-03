package com.frode.school.repository;


import com.frode.school.repository.impl.po.SuperAdminPO;


public interface SuperAdminRepository {



        SuperAdminPO getSuperAdminPOById(Integer id);

        SuperAdminPO  superAdminLogin(Integer id);//验证登录


}
