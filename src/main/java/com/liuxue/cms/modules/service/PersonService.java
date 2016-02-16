package com.liuxue.cms.modules.service;

import com.liuxue.cms.modules.entiy.PersonInfoPO;

import java.util.List;
import java.util.Map;

/**
 * Created by Sandwich on 2016/2/16.
 */
public interface PersonService {
    List<PersonInfoPO> query(Map map);
}
