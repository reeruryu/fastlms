package com.zerobase.fastlms.member.service;

import com.zerobase.fastlms.member.model.MemberInput;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface MemberService extends UserDetailsService {

    boolean register(MemberInput parameter);

    /**
     * uuid에 헤당하는 계정을 활성화 함.
     * @param uuid
     * @return
     */
    boolean emailAuth(String uuid);

}
