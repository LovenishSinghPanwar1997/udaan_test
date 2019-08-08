package io.udaanTest.task;

public class GetTask {

	private String taskName;
	private String frequency;
	
	public GetTask() {
		
	}
	
	public GetTask(String taskName, String frequency) {
		super();
		this.taskName = taskName;
		this.frequency = frequency;
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
