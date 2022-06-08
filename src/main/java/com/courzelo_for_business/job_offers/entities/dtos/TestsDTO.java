package com.courzelo_for_business.job_offers.entities.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TestsDTO {

	private String idTest;

    private String idQuiz;
    
    private String idBusiness;
   
    private Date dateCreation;
    
    

	public TestsDTO() {
		
	}
    
    
}
