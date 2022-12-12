package com.zerobase.fastlms.course.dto;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
public class CourseDto {

    Long id;
    String imagePath;
    String keyword;
    String subject;
    String summary;

    String contents;
    long price;
    long salePrice;
    LocalDateTime saleEndDt;
    LocalDateTime regDt; // 등록일(추가날짜)
    LocalDateTime upDt; // 수정일(수정날짜)

    // 추가칼럼
    long totalCount;
    long seq;

}
