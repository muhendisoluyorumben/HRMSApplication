package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{ // bizim için CRUD kodlarını oto yazıyo<entity türü(buraya yazdığımız tür için metodlar oluşturur), id nin türü(primary key in türü)>

}
