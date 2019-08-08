package io.udaanTest.workers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,String> {
	
	public Worker findByWorkerId(String workerid);

}
