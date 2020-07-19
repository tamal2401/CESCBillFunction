package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.BillConclude;
import com.example.demo.Model.BillDetails;
import com.example.demo.aggregator.BillCalculation;

@Controller
public class BillController {
	@Autowired
	BillCalculation billCal;
	@GetMapping("/")
	public String getBillInfo() {
		return "Bill";
	}
	
	@PostMapping("/billCalculate")
	public ModelAndView calculateDiff( BillDetails bill) throws Exception{
		if(null==bill) {
			throw new Exception();
		}
		ModelAndView mv=new ModelAndView("Result");
		BillConclude billConclude=billCal.getEstimateBill(bill);
		System.out.println(billConclude);
		mv.addObject("obj", billConclude);
		
		return mv;
		
		
	}

}
