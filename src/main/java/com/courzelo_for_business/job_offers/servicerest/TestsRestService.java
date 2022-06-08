package com.courzelo_for_business.job_offers.servicerest;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.courzelo_for_business.job_offers.entities.Tests;
import com.courzelo_for_business.job_offers.entities.dtos.TestsDTO;
import com.courzelo_for_business.job_offers.repositories.TestsRepository;
import com.courzelo_for_business.job_offers.servicerest.iservicesrest.IServiceRestTests;

@Service
public class TestsRestService implements IServiceRestTests {

	
	@Autowired
    private ModelMapper mapper;
    
    @Autowired
    private  TestsRepository testRepository;
    
    
    @Override
    public List<TestsDTO> getAllTests(){
		List<Tests> tests = testRepository.findAll();
		return tests.stream().map(test -> mapper.map(test, TestsDTO.class))
		.collect(Collectors.toList());
		
	}
    
    @Override
    public List<TestsDTO> getByBusiness(String idBusiness ){
		List<Tests> tests = testRepository.findByIdBusiness(idBusiness);
		return tests.stream().map(test -> mapper.map(test, TestsDTO.class))
		.collect(Collectors.toList());
		
	}
    
    
    
	public TestsDTO addTest(TestsDTO test) {
		   Tests thetest = mapper.map(test, Tests.class);
		   Tests newTest = testRepository.save(thetest);
	        return mapper.map(newTest, TestsDTO.class);
		
	}
	
	
	@Override
	public TestsDTO updateTest(String idTest , TestsDTO requestTest) {
		
		Tests test = mapper.map(requestTest, Tests.class);
		
		Tests theTest = testRepository.findByIdTest(idTest);
    	theTest.setIdTest(test.getIdTest());
    	theTest.setIdBusiness(test.getIdBusiness());
    	theTest.setIdQuiz(test.getIdQuiz());
    	theTest.setDateCreation(test.getDateCreation());
    	
     	
    	
    	Tests newTest = testRepository.save(theTest);
		
				
		return mapper.map(newTest, TestsDTO.class);
		
		
	}
	
	
	@Override
	public void deleteTest(String idTest) {
		testRepository.deleteById(idTest);
		
		
		
	}
	
	
}
