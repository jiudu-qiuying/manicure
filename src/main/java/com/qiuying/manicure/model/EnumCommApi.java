package com.qiuying.manicure.model;

/**
 * @author zhangyq
 * @date 2018/5/16 10:36
 */
public enum EnumCommApi {

    UNKNOWED(202, "未知错误", "未知错误"),

    SUCCESS(200,"请求成功","操作成功"),

    FAILED(201,"请求失败","操作失败");

    /***
     *
     * 枚举对象值
     *
     * **/
    Integer _ret;

    /**
     * 枚举信息
     **/
    String _retMsg;

    String _detail;


    EnumCommApi(Integer ret, String retMsg) {
        this._ret = ret;
        this._retMsg = retMsg;
    }

    EnumCommApi(Integer ret, String _retMsg, String _detail) {
        this._ret = ret;
        this._retMsg = _retMsg;
        this._detail = _detail;
    }
}
