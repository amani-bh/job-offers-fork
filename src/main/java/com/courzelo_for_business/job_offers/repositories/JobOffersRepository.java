package com.courzelo_for_business.job_offers.repositories;


import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo_for_business.job_offers.entities.JobOffers;


@Repository
public interface JobOffersRepository extends MongoRepository<JobOffers,String> {

	//this repository contain all operations of mongodb
		public JobOffers findByTitle(String title);
		public JobOffers findByIdJob(String idJob);
		public List<JobOffers> findByIdBusiness(String idBusiness);
		public List<JobOffers> findByState(String state);
		public List<JobOffers> findByIdBusinessAndState(String idBusiness,String state);
		public List<JobOffers> findByCreationDateBetween(Date d1,Date d2);
		
		public List<JobOffers> findByJobType(String jobType);
		public boolean existsByIdPrehiringTest(String idPrehiringTest);
		
		
		
		
		 
}
