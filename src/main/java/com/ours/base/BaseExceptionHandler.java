package com.ours.base;


import com.ours.base.common.ServiceMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

/** 统一异常处理
 * @author ls
 * @date 2019-05-20 22:48
 * @description
 */

@RestControllerAdvice
public class BaseExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

    @Order(100)
    @ExceptionHandler(Exception.class)
    public Map<String,Object> defalutExceptionHandler(Exception e) {
        logger.error("occor exception", e);
        ServiceMessage result = new ServiceMessage();
        result.buildError();
        return result;
    }


}
