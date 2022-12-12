package com.zerobase.fastlms.course.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;

    String imagePath;
    String keyword;
    String subject;

    @Column(length = 1000)
    String summary;

    @Lob // large object
    String contents;
    long price;
    long salePrice;
    LocalDateTime saleEndDt;

    LocalDateTime regDt; // 등록일(추가날짜)
    LocalDateTime upDt; // 수정일(수정날짜)
}
