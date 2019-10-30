package com.ours.base.common;

import org.springframework.http.HttpStatus;

import java.util.LinkedHashMap;

/**
 * @author ls
 * @date 2019-05-20 23:15
 * @description
 */
public class ServiceMessage extends LinkedHashMap<String, Object> {

    public ServiceMessage buildFail() {
        this.put(Const.CODE_KEY, HttpStatus.INTERNAL_SERVER_ERROR.value());
        this.put(Const.MESSAGE_KEY, Const.FAILED_MESSAGE);
        this.put("succ", false);
        return this;
    }

    public ServiceMessage buildFail(boolean succ) {
        this.put(Const.CODE_KEY, HttpStatus.OK.value());
        this.put(Const.MESSAGE_KEY, "");
        this.put("succ", succ);
        return this;
    }
    public ServiceMessage buildFail(String message) {
        this.put(Const.CODE_KEY, HttpStatus.INTERNAL_SERVER_ERROR.value());
        this.put(Const.MESSAGE_KEY, message);
        this.put("succ", false);
        return this;
    }
    public ServiceMessage buildError() {
        this.put(Const.CODE_KEY, HttpStatus.INTERNAL_SERVER_ERROR.value());
        this.put(Const.MESSAGE_KEY, Const.ERROR_MESSAGE);
        this.put("succ", false);
        return this;
    }
    public ServiceMessage() {
        this.put(Const.CODE_KEY, HttpStatus.OK.value());
        this.put(Const.MESSAGE_KEY, Const.SUCCESS_MESSAGE);
        this.put("succ", true);
    }
}
