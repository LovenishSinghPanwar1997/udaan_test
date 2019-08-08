package io.udaanTest.task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="TASK")
public class Task {
	
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid2")
	@Column(name="TASK_ID")
	private String taskId;
	
	@Column(name="TASKNAME")
	private String taskName;
	
	@Column(name="FREQUENCY")
	private String frequency;

	public Task(String taskId, String taskName, String frequency) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.frequency = frequency;
	}
	
	public Task() {
		
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	
}
