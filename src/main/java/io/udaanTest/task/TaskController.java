package io.udaanTest.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/housekeeping/tasks")
public class TaskController {
	
	@Autowired
	private TaskService taskservice;
	
	@RequestMapping(method = RequestMethod.POST,value="/add-task")
	public String addTask(@RequestBody GetTask gettask) {
		return taskservice.addTask(gettask);
	}

}
