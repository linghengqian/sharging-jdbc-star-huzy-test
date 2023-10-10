package org.example.utils;

import java.util.HashMap;

public class ResultModel extends HashMap<String, Object> {
    public static Integer SUCCESS_CODE = 200;
    public static Integer ERROR_CODE = 500;
    public static String DATA_KEY = "data";
    public static String MSG_KEY = "msg";
    public static String TOTAL_KEY = "total";
    public static String LIST_KEY = "list";
    public static String STATUS_KEY = "status";

    public ResultModel() {
    }

    private static ResultModel create() {
        return new ResultModel();
    }

    private ResultModel set(String key, Object object) {
        super.put(key, object);
        return this;
    }

    /**
     * 执行成功返回的对象
     *
     * @return
     */
    public static ResultModel success() {
        return ResultModel.create()
                .set(STATUS_KEY, SUCCESS_CODE)
                .set(MSG_KEY, "操作成功");

    }

    public static ResultModel success(String msg) {
        return ResultModel.create()
                .set(STATUS_KEY, SUCCESS_CODE)
                .set(MSG_KEY, msg);
    }

    public static ResultModel success(Object data) {
        return ResultModel.create()
                .set(STATUS_KEY, SUCCESS_CODE)
                .set(DATA_KEY, data)
                .set(MSG_KEY, "操作成功");
    }


    public static ResultModel success(Object data, String msg) {
        return ResultModel.create()
                .set(STATUS_KEY, SUCCESS_CODE)
                .set(DATA_KEY, data)
                .set(MSG_KEY, msg);
    }

    public static ResultModel customize(Integer code,String msg,Object data) {
        return ResultModel.create()
                .set(STATUS_KEY, code)
                .set(DATA_KEY, data)
                .set(MSG_KEY, msg);
    }

    /**
     * 操作失败返回的对象
     *
     * @return
     */
    public static ResultModel error() {
        return ResultModel.create()
                .set(STATUS_KEY, ERROR_CODE)
                .set(MSG_KEY, "操作失败");
    }

    public static ResultModel error(String msg) {
        return ResultModel.create()
                .set(STATUS_KEY, ERROR_CODE)
                .set(MSG_KEY, msg);
    }

    public static ResultModel error(Object data) {
        return ResultModel.create()
                .set(STATUS_KEY, ERROR_CODE)
                .set(MSG_KEY, "操作失敗")
                .set(DATA_KEY,data);
    }

    public static ResultModel error(Object data, String msg) {
        return ResultModel.create()
                .set(STATUS_KEY, ERROR_CODE)
                .set(DATA_KEY, data)
                .set(MSG_KEY, msg);
    }

    public static ResultModel error(String msg, int code) {
        return ResultModel.create()
                .set(STATUS_KEY, code)
                .set(MSG_KEY, msg);
    }

    /**
     * 方法概述： 分页数据返回
     *
     * @param data  返回数据
     * @param total 总条数
     * @return
     */
    public static ResultModel tableModel(Object data, int total) {
        HashMap<String, Object> resultData = new HashMap<>();
        resultData.put(LIST_KEY, data);
        resultData.put(TOTAL_KEY, total);
        return ResultModel.create()
                .set(STATUS_KEY, SUCCESS_CODE)
                .set(DATA_KEY, resultData)
                .set(MSG_KEY, "操作成功");
    }

    public static ResultModel tableModel(Object data, int total, String msg) {
        HashMap<String, Object> resultData = new HashMap<>();
        resultData.put(LIST_KEY, data);
        resultData.put(TOTAL_KEY, total);
        return ResultModel.create()
                .set(STATUS_KEY, SUCCESS_CODE)
                .set(DATA_KEY, resultData)
                .set(MSG_KEY, msg);
    }
}
