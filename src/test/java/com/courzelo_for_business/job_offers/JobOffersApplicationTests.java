package com.courzelo_for_business.job_offers;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.courzelo_for_business.job_offers.entities.dtos.JobOffersDTO;
import com.courzelo_for_business.job_offers.servicerest.iservicesrest.IServiceRestJobOffers;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JobOffersApplicationTests {

	
	@Autowired
	IServiceRestJobOffers iServiceJobs;

	
	@Test
    public void GetJobs()
    {       List<JobOffersDTO> jobs=iServiceJobs.getAllJobOffers();
            Assert.assertEquals(7,jobs.size());
    }
	
	
	@Test
    public void GetJobById()
    {       JobOffersDTO job=iServiceJobs.getJobById("62ab4d4f5089ed3665f41956");
            Assert.assertEquals("62ab4d4f5089ed3665f41956",job.getIdJob());
    }
	


	@Test
    public void getJobByBusiness()
    {       List<JobOffersDTO> jobs=iServiceJobs.getJobOffersByBusiness("626b2efbf1d5b22ee0106932");
            Assert.assertEquals(6,jobs.size());
    }
	
	
	/*@Test
    public void AddJob()
    {       JobOffersDTO job=new JobOffersDTO(); 
            job.setTitle("new job");
 	        job.setDescription("new job for testinf");
    
		    JobOffersDTO res=iServiceJobs.addJob(job,"626b2efbf1d5b22ee0106932");
            Assert.assertEquals("626b2efbf1d5b22ee0106932",res.getBusiness().getIdBusiness());
    }
	
	
	@Test
    public void UpdJob()
    {       JobOffersDTO job=new JobOffersDTO(); 
            job.setIdJob("62a749a414815f55a7950fd8");
            job.setTitle("updated job");
 	        job.setDescription("new job for testinf");
    
		    JobOffersDTO res=iServiceJobs.updateJob("62a749a414815f55a7950fd8", job);
            Assert.assertEquals("updated job",res.getTitle());
    }
	
	@Test
	public void ActivateJob()
    {       
		    JobOffersDTO job =iServiceJobs.activateJob("62a749a414815f55a7950fd8");
            Assert.assertEquals("Active",job.getState());
    }
	
	@Test
	public void InactivateJob()
    {       
		    JobOffersDTO job =iServiceJobs.desactivateJob("62a749a414815f55a7950fd8");
            Assert.assertEquals("Inactive",job.getState());
    }
	
	
	@Test
	public void AssignPrehiringTest()
    {       
		    JobOffersDTO job =iServiceJobs.assignPrehiringTest("62a749a414815f55a7950fd8","1");
            Assert.assertEquals("1",job.getIdPrehiringTest());
    }
	
	
	@Test
	public void UnAssignPrehiringTest()
    {       
		    JobOffersDTO job =iServiceJobs.unassignPrehiringTest("62a749a414815f55a7950fd8");
            Assert.assertEquals("",job.getIdPrehiringTest());
    }
	
	@Test
	public void VerifPrehiringTest()
    {       
		    boolean res =iServiceJobs.verifTestExist("1");
            Assert.assertEquals(true,res);
    }
	
	@Test
    public void DeleteJob()
    {       
		    iServiceJobs.deleteJob("62a749a414815f55a7950fd8");
		    List<JobOffersDTO> jobs=iServiceJobs.getAllJobOffers();
            Assert.assertEquals(2,jobs.size());
    }
	*/

}
