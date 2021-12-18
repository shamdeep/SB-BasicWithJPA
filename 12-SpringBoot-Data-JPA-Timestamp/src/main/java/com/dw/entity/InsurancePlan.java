package com.dw.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "INSURANCE_PLAN")
@Data
public class InsurancePlan {

	@Id
	@GeneratedValue
	private Integer planId;
	private String planName;
	private String planStatus;

	@CreationTimestamp
	//@Temporal(TemporalType.DATE)
	@Column(updatable = false)
	private LocalDate createdDate;

	@UpdateTimestamp
	//@Temporal(TemporalType.DATE)
	@Column(insertable = false)
	private Date updatedDate;
}
