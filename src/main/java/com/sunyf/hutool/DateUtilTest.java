package com.sunyf.hutool;

import cn.hutool.core.date.DateUtil;

public class DateUtilTest {
    public static void main(String[] args) {
        String now = DateUtil.now();
        System.out.println("当前时间字符串，格式：yyyy-MM-dd HH:mm:ss " + now);

    }


}
