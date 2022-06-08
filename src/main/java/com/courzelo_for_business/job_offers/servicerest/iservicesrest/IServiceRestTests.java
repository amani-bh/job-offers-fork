package com.courzelo_for_business.job_offers.servicerest.iservicesrest;

import java.util.List;
import com.courzelo_for_business.job_offers.entities.dtos.TestsDTO;

public interface IServiceRestTests {

	
	public TestsDTO addTest(TestsDTO test);
	public List<TestsDTO> getAllTests();
	 public List<TestsDTO> getByBusiness(String idBusiness );
	public TestsDTO updateTest(String idTest , TestsDTO requestTest);
	public void deleteTest(String idTest);
}
