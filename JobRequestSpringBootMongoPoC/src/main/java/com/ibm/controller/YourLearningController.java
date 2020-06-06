package com.ibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.poc.repository.YourLearningRepository;
import com.ibm.poc.req.LearningReqObj;

@RestController
@RequestMapping("/YourLearningController")
public class YourLearningController {
	
	@Autowired
	private YourLearningRepository yl;

	@PostMapping("/saveLearningDetails")
	public String saveLearningDetails(@RequestBody LearningReqObj learningReqObj) {
		
		try {

		System.out.println("Inside saveLearningDetails :" + learningReqObj);
		if(learningReqObj.getAction()==null) {
			yl.insert(learningReqObj);
		} else {
			
			if ("Train".equals(learningReqObj.getJob_type()) && "Score".equals(learningReqObj.getAction().getJob_type())){
				//if(learningReqObj.getOrder_number().equals(learningReqObj.getAction().getOrder_number()) && !learningReqObj.getJob_id().equals(learningReqObj.getAction().getJob_id())) {
					// insert another record (as child)  parent_job_id should be the parent job id.
					yl.insert(learningReqObj);
					// update parent next_action column ?** TODO
				//}
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			return e.getMessage();
		}

		return "Learning details saved successfully!";
	}
	
	@GetMapping("/getLearningDetails")
	public List<LearningReqObj> getAllLearningDetails(){
		return yl.findAll();
	}

	@GetMapping("/ping")
	public String ping() {
		System.out.println("Hello");
		return "Hello Job Request Project!";

	}

}
