package com.composite.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Indexed;

import com.composite.Utils.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Customer")
//@Indexed(name ="", columnList ="")
//,indexes = {@Index(name +"", columnList ="")})
@IdClass(CustomerPk.class)

public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Id
	private String phoneNumber;

	@Id
	private String email;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private LocalDate DOB;
	
	@CreatedBy
	private int createdBy;
	
	@LastModifiedBy
	private int modifiedBy;
	
	@Column(updatable = false)
	//@CreatedDate
	@CreationTimestamp
	private LocalDateTime createdDate; 
	
	//@LastModifiedDate
	@UpdateTimestamp
	private LocalDateTime modifiedDate; 
	//= LocalDateTime.now();
}
