package io.udaanTest.allocateTask;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.udaanTest.workers.Worker;
import io.udaanTest.workers.WorkerRepository;

@Service
public class AllocateTaskService {
	
	@Autowired
	private AllocateTaskRepository atr;

	@Autowired
	private WorkerRepository wrp;
	
	public String allocTask(AllocateTask alloc) {
		Date date = new Date();
		alloc.setTimeOfAllocation(date);
		String workerid = alloc.getWorkerId();
		Worker worker = wrp.findByWorkerId(workerid);
		alloc.setWorker(worker);
		atr.save(alloc);
		return "Task Allocated";
	}

}
