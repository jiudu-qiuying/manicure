package com.qiuying.manicure.model;

/**
 * @author zhangyq
 * @date 2018/5/16 10:48
 */
public class Result<T> {
    //状态码
    private Integer ret;

    //返回结果
    private String retMsg;

    //返回数据
    private T data;


    public static <T> Result successResult(String retMsg, T data) {
        return new Result(EnumCommApi.SUCCESS._ret, retMsg, data);
    }

    public static <T> Result<T> successResult(T data) {
        return new Result(EnumCommApi.SUCCESS, data);
    }


    public static <T> Result<T> failedResult(T data) {
        return new Result(EnumCommApi.FAILED, data);
    }

    public static <T> Result<T> failedResult(String retMsg, T data) {
        return new Result(EnumCommApi.FAILED._ret, retMsg, data);
    }

    public static <T> Result<T> unknowRsult(T data) {
        return new Result(EnumCommApi.UNKNOWED, data);
    }

    public static <T> Result<T> result(Integer ret, String retMsg, T data) {
        return new Result(ret, retMsg, data);
    }

    public static <T> Result<T> result(EnumCommApi enumCommApi) {
        return new Result(enumCommApi);
    }

    public static <T> Result<T> result(EnumCommApi enumCommApi, T data) {
        return new Result(enumCommApi, data);
    }

    public Result(EnumCommApi enumCommApi) {
        this.ret = enumCommApi._ret;
        this.retMsg = enumCommApi._retMsg;
    }

    public Result(EnumCommApi enumCommApi, T data) {
        this.ret = enumCommApi._ret;
        this.retMsg = enumCommApi._retMsg;
        this.data = data;
    }

    public Result(Integer ret, String retMsg, T data) {
        this.ret = ret;
        this.retMsg = retMsg;
        this.data = data;
    }


    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "ret=" + ret +
                ", retMsg='" + retMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
