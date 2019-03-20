package com.qiuying.manicure.exception;

import com.qiuying.manicure.model.Result;
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

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defalultErrorHandler(HttpServletRequest req, Exception e) {
        return Result.failedResult(null);
    }
}
