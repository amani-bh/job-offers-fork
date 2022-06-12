package com.courzelo_for_business.job_offers.apirest;


import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courzelo_for_business.job_offers.entities.dtos.JobOffersDTO;
import com.courzelo_for_business.job_offers.servicerest.iservicesrest.IServiceRestJobOffers;




@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping( "/JobOffers" )
@RestController
public class JobOffersRestAPI {

	@Autowired
	private IServiceRestJobOffers iJob;
	
	
	@GetMapping(path = "")
	public List<JobOffersDTO> getAllJobs() {
		return iJob.getAllJobOffers(); 
	}
	
	@GetMapping(path = "/{idJob}")
	public JobOffersDTO getById(@PathVariable(name = "idJob") String idJob) {
		return iJob.getJobById(idJob); 
	}
	
	@GetMapping(path = "/state/{state}")
	public List<JobOffersDTO>  getByState(@PathVariable(name = "state") String state) {
		return iJob.getJobOffersByState(state); 
	}
	
	

	@GetMapping(path = "/existPrehiring/{idPrehiringTest}")
	public boolean verifExistPrehiringTest(@PathVariable(name = "idPrehiringTest") String idPrehiringTest) {
		return iJob.verifTestExist(idPrehiringTest); 
	}
	
	
	@GetMapping(path = "business/{idBusiness}")
	public List<JobOffersDTO> getByIdBusiness(@PathVariable(name = "idBusiness") String idBusiness) {
		return iJob.getJobOffersByBusiness(idBusiness); 
	}
	
	@GetMapping(path = "business/{idBusiness}/{state}")
	public List<JobOffersDTO> getByIdBusinessAndState(@PathVariable(name = "idBusiness") String idBusiness,@PathVariable(name = "state") String state) {
		return iJob.getJobOffersByBusinessAndState(idBusiness,state); 
	}
	
	@PostMapping(path = "/{idBusiness}")
    public ResponseEntity<JobOffersDTO> addJob(@RequestBody  @Valid  JobOffersDTO job,@PathVariable(name = "idBusiness") String idBusiness) {
		
		JobOffersDTO jobResponse = iJob.addJob(job,idBusiness);
		
        return new ResponseEntity<JobOffersDTO>(jobResponse, HttpStatus.CREATED);
    }
	
	
	@PutMapping(path = "/{idJob}")
    public ResponseEntity<JobOffersDTO> updateJob(@PathVariable(name = "idJob") String idJob, @RequestBody  @Valid  JobOffersDTO job) {
		
		JobOffersDTO jobResponse = iJob.updateJob(idJob,job);
		
        return new ResponseEntity<JobOffersDTO>(jobResponse, HttpStatus.CREATED);
    }
	
	@DeleteMapping(path = "/{idJob}")
	public void deleteJob(@PathVariable(name = "idJob") String idJob) {
		iJob.deleteJob(idJob);
		
	}
	
	
	@PutMapping(path = "/Desactivate/{idJob}")
    public ResponseEntity<JobOffersDTO> desactivateJob(@PathVariable(name = "idJob") String idJob) {
		
		JobOffersDTO jobResponse=iJob.desactivateJob(idJob);
		
		return new ResponseEntity<JobOffersDTO>(jobResponse, HttpStatus.CREATED);
        
    }
	
	
	@PutMapping(path = "/Activate/{idJob}")
    public ResponseEntity<JobOffersDTO> activateJob(@PathVariable(name = "idJob") String idJob) {
		
		JobOffersDTO jobResponse=iJob.activateJob(idJob);
		
		return new ResponseEntity<JobOffersDTO>(jobResponse, HttpStatus.CREATED);
        
    }
	
	@PutMapping(path = "/AssignPrehiringTest/{idJob}/{idPrehiringTest}")
    public ResponseEntity<JobOffersDTO> assignPrehiringTest(@PathVariable(name = "idJob") String idJob,@PathVariable(name = "idPrehiringTest") String idPrehiringTest) {
		
		JobOffersDTO jobResponse=iJob.assignPrehiringTest(idJob,idPrehiringTest);
		
		return new ResponseEntity<JobOffersDTO>(jobResponse, HttpStatus.CREATED);
        
    }
	
	@PutMapping(path = "/UnAssignPrehiringTest/{idJob}")
    public ResponseEntity<JobOffersDTO> unAssignPrehiringTest(@PathVariable(name = "idJob") String idJob) {
		
		JobOffersDTO jobResponse=iJob.unassignPrehiringTest(idJob);
		
		return new ResponseEntity<JobOffersDTO>(jobResponse, HttpStatus.CREATED);
        
    }
	
	@PutMapping(path = "/AddTest/{idJob}/{idTest}")
    public ResponseEntity<JobOffersDTO> addTest (@PathVariable(name = "idJob") String idJob,@PathVariable(name = "idTest") String idTest) {
		
		JobOffersDTO jobResponse=iJob.addTest(idJob,idTest);
		
		return new ResponseEntity<JobOffersDTO>(jobResponse, HttpStatus.CREATED);
        
    }
}
	

