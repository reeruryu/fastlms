package com.zerobase.fastlms.admin.model;

import com.zerobase.fastlms.admin.entity.BannerCode;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BannerInput {
    long id;
    String bannerName;

    String filename;
    String urlFilename;

    String link;
    BannerCode target;
    int sortValue;
    boolean usingYn;

    LocalDate regDt;

    // 삭제를 위한
    String idList;

}
