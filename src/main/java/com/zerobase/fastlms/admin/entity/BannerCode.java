package com.zerobase.fastlms.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BannerCode {
    TARGET_SELF("_self", "해당 창에서 열기"),
    TARGET_BLANK("_blank", "새 창으로 열기"),
    TARGET_PARENT("_parent", "부모 창에서 열기")
    ;

    private final String value;
    private final String text;
}
