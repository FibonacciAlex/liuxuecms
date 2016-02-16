package com.liuxue.cms.modules.controller;

import com.liuxue.cms.common.Result;
import com.liuxue.cms.modules.entiy.PersonInfoPO;
import com.liuxue.cms.modules.entiy.request.Bean;
import com.liuxue.cms.modules.service.PersonServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sandwich on 2016/2/15.
 */
@Controller
public class testController extends BaseController {

    public final static Logger logger = Logger.getLogger(testController.class);

    @Autowired
    public PersonServiceImpl personServiceImpl;

    /**
     * 查询个人信息
     * @param bean
     * @return
     */
    @RequestMapping(value="/personInfo" , produces ="application/json")
    @ResponseBody
    public Result personInfo(@RequestBody Bean bean) throws Exception {
        logger.info("=====");
        String name = bean.getName();
        String sex = bean.getSex();
        Map<String,String> map = new HashMap<String,String>();
        map.put("name",name);
        map.put("sex", sex);
        List<PersonInfoPO> list =  personServiceImpl.getPersonInfo(map);
        return new Result("200","ok",list);
    }
}
