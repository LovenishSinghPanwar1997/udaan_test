package io.udaanTest.workers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.udaanTest.allocateTask.AllocateTask;

@Entity(name="WORKER")
public class Worker {
	
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid2")
	@Column(name="WORKER_ID")
	private String workerId;
	
	@Column(name="WORKER_NAME")
	private String  workerName;
	
	@Column(name="SKILL_SET")
	private String skillSet;

	@JsonManagedReference(value="alloc")
	@OneToMany(mappedBy="worker",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<AllocateTask> taskhistory = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String workerId, String workerName, String skillSet, List<AllocateTask> taskhistory) {
		super();
		this.workerId = workerId;
		this.workerName = workerName;
		this.skillSet = skillSet;
		this.taskhistory = taskhistory;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
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

	public List<AllocateTask> getTaskhistory() {
		return taskhistory;
	}

	public void setTaskhistory(List<AllocateTask> taskhistory) {
		this.taskhistory = taskhistory;
	}

	
}
