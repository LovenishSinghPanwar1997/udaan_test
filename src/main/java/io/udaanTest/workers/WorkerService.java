package io.udaanTest.workers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository workerrepository;
	
	public String addWorker(GetWorker getworker) {
		
		if(" " ==getworker.getWorkerName())
			return "Worker Name is mandatory";
		if(" "==getworker.getSkillSet())
			return "Worker Skill Set should be specified";
		
		Worker worker = new Worker();
		worker.setWorkerName(getworker.getWorkerName());
		worker.setSkillSet(getworker.getSkillSet());
		workerrepository.save(worker);
		return "Worker added Successfully";
	}

	public List<Worker> showAll() {
		return workerrepository.findAll();
	}

	public Worker findworker(String workerId) {
		return workerrepository.findByWorkerId(workerId);
	}

}
