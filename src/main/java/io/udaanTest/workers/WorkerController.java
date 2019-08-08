package io.udaanTest.workers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/housekeeping/worker")
public class WorkerController {
	
	@Autowired
	private WorkerService workerservice;
	
	@RequestMapping(method=RequestMethod.POST,value="/add-worker")
	public String addWorker(@RequestBody GetWorker getworker)
	{
		return workerservice.addWorker(getworker);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/all")
	public List<Worker> showAll()
	{
		return workerservice.showAll();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/get-tasks-for-worker/{workerId}")
	public Worker findworker(@PathVariable String workerId) {
		return workerservice.findworker(workerId);
		
	}
}
