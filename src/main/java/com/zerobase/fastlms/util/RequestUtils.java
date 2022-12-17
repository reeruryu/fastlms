package com.zerobase.fastlms.util;

import javax.servlet.http.HttpServletRequest;

public class RequestUtils {
    public static String getUserAgent(HttpServletRequest request) {
        // 유저의 시스템 정보
        return request.getHeader("User-Agent").toString();
    }

    public static String getClientIP(HttpServletRequest request) {

        // 클라이언트 ip 주소 가져오기
        String ip = request.getHeader("X-FORWARDED-FOR");

        if (ip == null || ip.length() == 0) {
            ip = request.getHeader("Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0) {
            ip = request.getHeader("WL-Proxy-Client-IP");  // 웹로직
        }

        if (ip == null || ip.length() == 0) {
            ip = request.getRemoteAddr();
        }

        return ip;
    }
}
