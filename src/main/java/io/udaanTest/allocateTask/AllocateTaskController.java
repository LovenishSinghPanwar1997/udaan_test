package io.udaanTest.allocateTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/housekeeping")
public class AllocateTaskController {
	
	@Autowired
	private AllocateTaskService ats;
	
	@RequestMapping(method=RequestMethod.POST,value="/allocate-task")
	public String allocTask(@RequestBody AllocateTask alloc) {
		return ats.allocTask(alloc);
		
	}

}
