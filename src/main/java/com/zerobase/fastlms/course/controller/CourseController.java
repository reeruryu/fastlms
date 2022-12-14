package com.zerobase.fastlms.course.controller;


import com.zerobase.fastlms.admin.dto.CategoryDto;
import com.zerobase.fastlms.admin.service.CategoryService;
import com.zerobase.fastlms.course.dto.CourseDto;
import com.zerobase.fastlms.course.model.CourseParam;
import com.zerobase.fastlms.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class CourseController extends BaseController {

    private final CourseService courseService;
    private final CategoryService categoryService;

    @GetMapping("/course")
    public String course(Model model, CourseParam parameter) {
        //, @RequestParam(name="categoryId") long categoryId

        List<CourseDto> list = courseService.frontList(parameter);
        model.addAttribute("list", list);

        List<CategoryDto> categoryList = categoryService.frontList(
                CategoryDto.builder().build());

        int courseTotalCount = 0;
        if (categoryList != null) {
            for (CategoryDto x: categoryList) {
                courseTotalCount += x.getCourseCount();
            }
        }
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("courseTotalCount", courseTotalCount);

        return "course/index";
    }

}

