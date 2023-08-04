package com.tech.sprj06s.jung;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JungController {
	@RequestMapping("jung1")
	public String jung1() {
		return "jung1";
	}
	@RequestMapping("jung2")
	public String jung2() {
		return "jung2";
	}
}
