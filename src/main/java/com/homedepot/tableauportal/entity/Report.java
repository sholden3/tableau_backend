package com.homedepot.tableauportal.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="report")
@Getter
@ToString
@NoArgsConstructor
public class Report {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String description;
	
	@NotEmpty
	@Column(name="report_url")
	private String reportUrl;
	
	@Column(name="date_created")
	@CreationTimestamp
	private Date dateCreated;
	
	@Column(name="last_updated")
	@UpdateTimestamp
	private Date lastUpdated;

	public Report(@NotEmpty String name, @NotEmpty String description, @NotEmpty String reportUrl) {
		this.name = name;
		this.description = description;
		this.reportUrl = reportUrl;
	}
	
	
}
