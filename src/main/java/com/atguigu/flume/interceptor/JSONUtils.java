package com.atguigu.flume.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

/**
 * @作者 吴佳荣
 * @时间 2022/6/7
 * @目的
 */
public class JSONUtils {
    public static boolean isJSONValidate(String log){
        try {
            JSON.parse(log);
            return true;
        }catch (JSONException e){
            return false;
        }
    }
}
