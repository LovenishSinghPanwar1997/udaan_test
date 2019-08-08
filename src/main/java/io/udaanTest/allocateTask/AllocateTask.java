package io.udaanTest.allocateTask;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.udaanTest.workers.Worker;

@Entity(name="allocate_task")
public class AllocateTask {
	
	@Id
	@Column(name="task_id")
	private String taskId;
	@Column(name="asset_id")
	private String assetId;
	@Column(name="worker_id")
	private String workerId;
	@Column(name="time_of_allocation")
	private Date timeOfAllocation;
	@Column(name="task_to_be_performed_by")
	private Date taskToBePerformedBy;
	
	@JsonBackReference(value = "alloc")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "worker")
	private Worker worker;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public Date getTimeOfAllocation() {
		return timeOfAllocation;
	}

	public void setTimeOfAllocation(Date timeOfAllocation) {
		this.timeOfAllocation = timeOfAllocation;
	}

	public Date getTaskToBePerformedBy() {
		return taskToBePerformedBy;
	}

	public void setTaskToBePerformedBy(Date taskToBePerformedBy) {
		this.taskToBePerformedBy = taskToBePerformedBy;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public AllocateTask(String taskId, String assetId, String workerId, Date timeOfAllocation, Date taskToBePerformedBy,
			Worker worker) {
		super();
		this.taskId = taskId;
		this.assetId = assetId;
		this.workerId = workerId;
		this.timeOfAllocation = timeOfAllocation;
		this.taskToBePerformedBy = taskToBePerformedBy;
		this.worker = worker;
	}
	
	
	public AllocateTask() {
		
	}
	

}
