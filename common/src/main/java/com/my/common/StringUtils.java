package com.my.common;

/**
 * Created by Administrator on 2017/11/3.
 */
public class StringUtils {
    public static boolean isEmpty(String str){
        if (str != null && !"".equals(str.trim()))
            return  false;
        return  true;
    }
}
