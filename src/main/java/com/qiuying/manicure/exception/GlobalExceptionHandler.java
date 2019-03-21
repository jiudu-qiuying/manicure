package com.qiuying.manicure.exception;

import com.qiuying.manicure.model.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangyq
 * @date 2019/3/19 19:46
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static Logger logger = LogManager.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defalultErrorHandler(HttpServletRequest req, Exception e) {
        logger.error(e.getMessage(), e);
        return Result.failedResult("服务器异常", e.toString());
    }
}
