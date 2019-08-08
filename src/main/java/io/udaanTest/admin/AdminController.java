package io.udaanTest.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/housekeeping/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	@RequestMapping(method=RequestMethod.POST,value="/add-admin")
	public String addAdmin(@RequestBody Admin admin) {
		return adminservice.addAdmin(admin);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/login")
	public boolean logIn(@RequestBody Admin admin) {
		return adminservice.logIn(admin);
	}

}
