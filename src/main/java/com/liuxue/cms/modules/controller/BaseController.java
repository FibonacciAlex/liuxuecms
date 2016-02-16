package com.liuxue.cms.modules.controller;

import com.liuxue.cms.common.Constants;
import com.liuxue.cms.common.Result;

/**
 * Created by Sandwich on 2016/2/16.
 */
public abstract class BaseController {
    /**
     * 成功返回接口，返回调用信息
     * @param message
     * @return
     */
    protected Result ok(String message) {
        return result(Constants.RESULT_CODE_SUCCESS, message, null);
    }

    /**
     * 成功调用接口返回接口信息及数据
     * @param result
     * @param message
     * @param obj
     * @return
     */
    protected Result ok(String result, String message, Object obj) {
        return result(Constants.RESULT_CODE_SUCCESS, message, obj);
    }

    /**
     * 失败返回接口，返回调用信息
     * @param message
     * @return
     */
    protected Result error(String message) {
        return result(Constants.RESULT_CODE_ERROR, message, null);
    }

    /**
     * 失败调用接口返回接口信息及数据
     * @param result
     * @param message
     * @param obj
     * @return
     */
    protected Result error(String result, String message, Object obj) {
        return result(Constants.RESULT_CODE_ERROR, message, obj);
    }

    private  Result result(String statusCode, String message, Object obj){
        return new Result(statusCode,message,obj);
    }
}
