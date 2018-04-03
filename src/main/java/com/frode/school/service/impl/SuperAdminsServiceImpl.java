package com.frode.school.service.impl;

import com.frode.school.repository.SuperAdminRepository;
import com.frode.school.repository.impl.po.SuperAdminPO;
import com.frode.school.service.SuperAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperAdminsServiceImpl  implements SuperAdminService{

    @Autowired
    private SuperAdminRepository superAdminRepository;

    @Override
    public SuperAdminPO getSuperAdminPOById(Integer id) {
        return null;
    }

    @Override
    public SuperAdminPO getInfo(Integer id) {
        return superAdminRepository.superAdminLogin(id);
    }
}
