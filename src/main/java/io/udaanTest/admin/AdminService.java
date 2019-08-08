package io.udaanTest.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminrepo;
	
	public boolean logIn(Admin admin) {
		if(null==adminrepo.findByUserName(admin.getUserName()))
			return false;
		if(null==adminrepo.findByUserPassword(admin.getUserPassword()))
			return false;
		return true;
	}

	public String addAdmin(Admin admin) {
		adminrepo.save(admin);
		return "Admin Added Successfully";
	}

}
