package com.courzelo_for_business.job_offers.servicerest.iservicesrest;

import java.util.List;

import com.courzelo_for_business.job_offers.entities.dtos.JobOffersDTO;

public interface IServiceRestJobOffers {

	
	public JobOffersDTO addJob(JobOffersDTO requestJob,String idBusiness);
	public List<JobOffersDTO> getAllJobOffers();
	public List<JobOffersDTO> getJobOffersByState(String state);
	public List<JobOffersDTO> getJobOffersByBusiness(String idBusiness);
	public List<JobOffersDTO> getJobOffersByBusinessAndState(String idBusiness,String state);
	public JobOffersDTO getJobById(String idjob) ; 
	public JobOffersDTO updateJob(String idJob , JobOffersDTO requestJob); 
	public void deleteJob(String idJob); 
	
	public JobOffersDTO desactivateJob(String idJob);
	public JobOffersDTO activateJob(String idJob);
	
	public JobOffersDTO assignPrehiringTest(String idJob,String idPrehiringTest);
	public JobOffersDTO unassignPrehiringTest(String idJob) ;
	public JobOffersDTO addTest(String idJob,String idTest);
	public boolean verifTestExist(String idPrehingTest);
	
	public void DeleteTest(String idJob,String idTest);
	
	

	
}
