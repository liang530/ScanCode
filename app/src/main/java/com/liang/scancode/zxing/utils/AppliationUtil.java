package com.liang.scancode.zxing.utils;

/**
 * Created by 刘红亮 on 2015/7/23 22:35.
 */
public class AppliationUtil {
    //应用程序最大可用内存
    public static int MAX_MEMORY = ((int) Runtime.getRuntime().maxMemory())/1024/1024;
    //应用程序已获得内存
    public static long TOTAL_MEMORY = ((int) Runtime.getRuntime().totalMemory())/1024/1024;
    //应用程序已获得内存中未使用内存
    public static long FREE_MEMORY = ((int) Runtime.getRuntime().freeMemory())/1024/1024;



}