package com.liuxue.cms.common;

/**
 * Created by Sandwich on 2016/2/16.
 */
public class Result {
    private String statusCode;//200 成功；0 失败
    private String message;//提示信息
    private Object data;//数据


    public Result() {
    }

    public Result(String statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
