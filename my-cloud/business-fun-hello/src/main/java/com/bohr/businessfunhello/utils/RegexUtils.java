package com.bohr.businessfunhello.utils;

import org.apache.commons.lang.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式工具类
 * @author Bohr
 */
public class RegexUtils {

    /**
     * 匹配手机号
     */
    private static final Pattern MOBILE_PATTERN = Pattern.compile("1\\d{10}");

    /**
     *  校验字符串格式是否手机号
     * @param src
     * @return
     */
    public static boolean isMobile(String src){
        if (StringUtils.isEmpty(src)){
            return false;
        }
        Matcher matcher = MOBILE_PATTERN.matcher(src);
        return matcher.matches();
    }
}
