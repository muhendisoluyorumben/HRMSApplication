package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.dataAccess.abstracts.JobPositionDao;
import com.example.hrms.entities.concretes.JobPosition;

@Service // bu classın service calssı oldupunu belirtiyor. business katmanı old belirtiyor.
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired // bizim yerimize nesneleri new liyor. btk akademi de bir şeyler varmış bakabilirsiniz
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return  jobPositionDao.findAll();// jpa repository den gelen metod
	}

}
