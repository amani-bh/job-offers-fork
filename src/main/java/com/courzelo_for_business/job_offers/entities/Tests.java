package com.courzelo_for_business.job_offers.entities;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Document(collection="Tests")
@Getter
@Setter
@AllArgsConstructor
public class Tests {

	    @Id
	    @Field(targetType = FieldType.OBJECT_ID,value = "idTest")
	    private String idTest;

	    @Field(value = "idQuiz")
	    private String idQuiz;
	    
	    @Field(value = "idBusiness")
	    private String idBusiness;
	    
	    @Field(value = "DateCreation")
	    private Date dateCreation;
	    
	    
		public Tests() {
			
			
		}
	    
	    
}