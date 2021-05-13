package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.entities.concretes.JobPosition;

@RestController // restfull api nin controller ı olduğunu belirtiyorz.
@RequestMapping("/api/jobpositions") // url de bu controle ulaşmak için ne yazmamız gerektiğini belirtiyoruz.
public class JobPositionsController {
	
	private JobPositionService jobPositionService;
	@Autowired // jobPositionService implemente eden nesneyi newliyor.
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	} 
	
	@GetMapping("/getall") // url nin sonunda burasıı varrsa bu metodu çalıştırır
	public List<JobPosition> getAll(){
		return jobPositionService.getAll();
		
	}
}
