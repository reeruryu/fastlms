package com.zerobase.fastlms.member.model;

import com.zerobase.fastlms.admin.dto.CategoryDto;
import com.zerobase.fastlms.admin.entity.Category;
import com.zerobase.fastlms.member.entity.LoginHistory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LoginHistoryDto {

    private long id;

    private String userId;
    private LocalDateTime loginDt;
    private String ip;
    private String userAgent;

    public static LoginHistoryDto of(LoginHistory loginHistory) {
        return LoginHistoryDto.builder()
                .userId(loginHistory.getUserId())
                .loginDt(loginHistory.getLoginDt())
                .ip(loginHistory.getIp())
                .userAgent(loginHistory.getUserAgent())
                .build();
    }

    public String getLoginDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd MM:mm");
        return loginDt != null ? loginDt.format(formatter) : "";
    }
}
