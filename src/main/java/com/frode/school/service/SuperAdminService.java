package com.frode.school.service;

import com.frode.school.repository.impl.po.SuperAdminPO;

public interface SuperAdminService {


    SuperAdminPO getSuperAdminPOById(Integer id);

   public SuperAdminPO  getInfo(Integer id);


}
