package com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cloud/userinfo")
public class UserinfoController {

	/*@Autowired
	private UserinfoFeign userinfoFeign;*/
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Object list() {
		return "ddd";
		//return userinfoFeign.list();
	}
}
