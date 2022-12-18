package com.zerobase.fastlms.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bannerName;

    private String filename;
    private String urlFilename;

    @Enumerated(EnumType.STRING)
    private BannerCode target;
    private String link;
    private int sortValue;
    private boolean usingYn;

    private LocalDateTime regDt;

}
