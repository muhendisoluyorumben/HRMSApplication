package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter setter ları otomatik olşturuyor.
@Entity  //
@Table(name="job_positions")// veri tababnında hangi tabloya denk geldiğini söylüyoruz
@NoArgsConstructor // parametresiz constructor u oluşturur
@AllArgsConstructor // parametreli constructor u oluşturuyor.

public class JobPosition {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // id'yi postgre tarafında identity olarak belirledik. bunu yapmamız programın çalışması açısından iyi.
	
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	
}
