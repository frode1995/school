package com.frode.school.repository.impl;

import com.frode.school.repository.SuperAdminRepository;
import com.frode.school.repository.impl.mapper.SuperAdminMapper;
import com.frode.school.repository.impl.po.SuperAdminPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SuperAdminRepositoryImpl implements SuperAdminRepository {

   @Autowired
   private SuperAdminMapper superAdminMapper;
    @Override
    public SuperAdminPO getSuperAdminPOById(Integer id) {
        return null;
    }

    @Override
    public SuperAdminPO superAdminLogin(Integer id) {
        return superAdminMapper.superAdminLogin(id);
    }
}
