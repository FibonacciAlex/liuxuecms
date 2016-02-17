package com.liuxue.cms.modules.service;

import com.liuxue.cms.common.BaseService;
import com.liuxue.cms.modules.entiy.PersonInfoPO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Sandwich on 2016/2/16.
 */
@Service("personServiceImpl")
public class PersonServiceImpl extends BaseService{
    public List<PersonInfoPO> getPersonInfo(Map map) throws Exception{
        return getSqlSessionTemplate().selectList("queryInfo",map);
    }

}
