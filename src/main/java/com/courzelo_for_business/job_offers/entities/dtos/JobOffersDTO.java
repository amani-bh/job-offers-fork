package com.courzelo_for_business.job_offers.entities.dtos;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class JobOffersDTO {

	
	    private String idJob;

	    private String title;

	    private String description;
	    
	    private Date creationDate;
	    
	    private Date deadlineDate;
	    
	    private Date startDate;
	    
	    private String industry;
	    
	    private String subIndustry;
	   
	    private String state;
	    
	    private String jobType;
	    
	    private String schedulesType;
	    
	    private String country;
	    
	    private String location;
	    
	    private String locationType;
	   
	    private List<String> requirement;

	    private int hireNumber;
	    
	    private int salary;
	    
	    private String salaryOption;
	    
	    private int salaryRangeMax;
	    
	    private int salaryRangeMin;
	    
	    private int salaryStartAmout;
	  
	    private String salaryCurrency;

	    private String jobBenefits;
	
	    private boolean communication;
	    
	    private List<String> communicationMails;

	    private String idBusiness;
	    
	    private String idPrehiringTest;
	    
	    private List<String> idTest;

		public JobOffersDTO() {}
		
		
	   
}
