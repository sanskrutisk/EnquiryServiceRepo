package com.cjc.enquiry_service.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CibilDetails {

	@Id
	private int cibilId;
	private int cibilScore;
	private String cibilRemark;
}
