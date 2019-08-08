package io.udaanTest.workers;

public class GetWorker {

	private String  workerName;
	private String skillSet;
	
	public GetWorker() {
		
	}
	
	public GetWorker(String workerName, String skillSet) {
		super();
		this.workerName = workerName;
		this.skillSet = skillSet;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	
}
