package com.arc.s5;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {

	@GetMapping("noticeWrite")
	public void noticeWrite(HttpSession session) {
		
		if(session.getAttribute("member") == null) {
			System.out.println("Notice Write");
		}else {
			
		}
	}
}
