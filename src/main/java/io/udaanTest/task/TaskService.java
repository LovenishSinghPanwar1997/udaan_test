package io.udaanTest.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskrepository;

	public String addTask(GetTask gettask) {
		Task task = new Task();
		task.setTaskName(gettask.getTaskName());
		task.setFrequency(gettask.getFrequency());
		taskrepository.save(task);
		return "Task Added Successfully";
	}

}
