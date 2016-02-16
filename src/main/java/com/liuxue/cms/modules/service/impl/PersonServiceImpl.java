package com.liuxue.cms.modules.service.impl;

import com.liuxue.cms.dao.PersonInfoDao;
import com.liuxue.cms.modules.entiy.PersonInfoPO;
import com.liuxue.cms.modules.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Sandwich on 2016/2/16.
 */
@Service("personServiceImpl")
public class PersonServiceImpl implements PersonService{
    @Autowired
    public PersonInfoDao personInfoDao;
    @Override
    public List<PersonInfoPO> query(Map map){
        return personInfoDao.query(map);
    }
}
