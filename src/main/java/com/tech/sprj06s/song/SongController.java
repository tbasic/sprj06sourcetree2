package com.tech.sprj06s.song;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongController {

	@RequestMapping("song1")
	public String song1() {
	
		return "song1";
	}
	
	@RequestMapping("song2")
	public String song2() {
	
		return "song2";
	}
}
