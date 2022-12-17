package com.zerobase.fastlms.configuration;

import com.zerobase.fastlms.member.service.MemberService;
import com.zerobase.fastlms.util.RequestUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class UserAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private final MemberService memberService;

    // 로그인 성공 시 호출되는 메서드
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        String username = authentication.getName();
        String ip = RequestUtils.getClientIP(request);
        String userAgent = RequestUtils.getUserAgent(request);

        log.info(ip);
        log.info(userAgent);

        boolean result = memberService.insertLoginHistory(username, ip, userAgent);

        if (!result) {
            log.info("login history 저장에 실패하였습니다.");
        }

        super.onAuthenticationSuccess(request, response, authentication);
    }
}
