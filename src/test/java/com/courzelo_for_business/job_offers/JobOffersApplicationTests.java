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

	
	/*@Test
    public void GetJobs()
    {       List<JobOffersDTO> jobs=iServiceJobs.getAllJobOffers();
            Assert.assertEquals(jobs.size(),2);
    }
	
	
	@Test
    public void GetJobById()
    {       JobOffersDTO job=iServiceJobs.getJobById("62a67bb814af075d45cdba27");
            Assert.assertEquals(job.getIdJob(),"62a67bb814af075d45cdba27");
    }
	


	@Test
    public void getJobByBusiness()
    {       List<JobOffersDTO> jobs=iServiceJobs.getJobOffersByBusiness("626b2efbf1d5b22ee0106932");
            Assert.assertEquals(jobs.size(),2);
    }
	
	
	@Test
    public void AddJob()
    {       JobOffersDTO job=new JobOffersDTO(); 
            job.setTitle("new job");
 	        job.setDescription("new job for testinf");
    
		    JobOffersDTO res=iServiceJobs.addJob(job,"626b2efbf1d5b22ee0106932");
            Assert.assertEquals(res.getBusiness().getIdBusiness(),"626b2efbf1d5b22ee0106932");
    }
	
	
	@Test
    public void UpdJob()
    {       JobOffersDTO job=new JobOffersDTO(); 
            job.setIdJob("62a749a414815f55a7950fd8");
            job.setTitle("updated job");
 	        job.setDescription("new job for testinf");
    
		    JobOffersDTO res=iServiceJobs.updateJob("62a749a414815f55a7950fd8", job);
            Assert.assertEquals(res.getTitle(),"updated job");
    }
	
	@Test
	public void ActivateJob()
    {       
		    JobOffersDTO job =iServiceJobs.activateJob("62a749a414815f55a7950fd8");
            Assert.assertEquals(job.getState(),"Active");
    }
	
	@Test
	public void InactivateJob()
    {       
		    JobOffersDTO job =iServiceJobs.desactivateJob("62a749a414815f55a7950fd8");
            Assert.assertEquals(job.getState(),"Inactive");
    }
	
	
	@Test
	public void AssignPrehiringTest()
    {       
		    JobOffersDTO job =iServiceJobs.assignPrehiringTest("62a749a414815f55a7950fd8","1");
            Assert.assertEquals(job.getIdPrehiringTest(),"1");
    }
	
	
	@Test
	public void UnAssignPrehiringTest()
    {       
		    JobOffersDTO job =iServiceJobs.unassignPrehiringTest("62a749a414815f55a7950fd8");
            Assert.assertEquals(job.getIdPrehiringTest(),"");
    }
	
	@Test
	public void VerifPrehiringTest()
    {       
		    boolean res =iServiceJobs.verifTestExist("1");
            Assert.assertEquals(res,true);
    }
	*/
	@Test
    public void DeleteJob()
    {       
		    iServiceJobs.deleteJob("62a749a414815f55a7950fd8");
		    List<JobOffersDTO> jobs=iServiceJobs.getAllJobOffers();
            Assert.assertEquals(jobs.size(),2);
    }
	

}
