package com.zerobase.fastlms;

import com.zerobase.fastlms.component.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;
    @RequestMapping("/")
    public String index(){
        String email = "yhz102109@naver.com";
        String subject = "안녕하세요. 제목입니다.";
        String text = "<p>안녕하세요.</p><p>반갑습니다.</p>";

//        mailComponents.sendMailTest();
        mailComponents.sendMail(email, subject, text);

        return "index";
    }
}
