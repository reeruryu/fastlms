package com.zerobase.fastlms.course.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class TakeCourseDto {

    long id;
    long courseId;
    String userId;

    long payPrice; // 결제 금액
    String status; // 상태(수강신청, 결제완료, 수강취소)

    LocalDateTime regDt; // 신청일

    // JOIN
    String userName;
    String phone;
    String subject;

    // 추가 컬럼
    long totalCount;
    long seq;

    public String getRegDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd MM:mm");
        return regDt != null ? regDt.format(formatter) : "";
    }

}
