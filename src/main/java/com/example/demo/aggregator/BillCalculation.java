package com.example.demo.aggregator;

import org.springframework.stereotype.Service;

import com.example.demo.Model.BillConclude;
import com.example.demo.Model.BillDetails;
import com.example.demo.service.BillEstimateService;

@Service
public class BillCalculation {
	
	public BillConclude getEstimateBill(BillDetails bill) throws Exception {
		BillConclude billConclude=new BillConclude();
		BillEstimateService billService=new BillEstimateService();
		if(null!=bill.getName()) {
			billConclude.setName(bill.getName());
		}
		if(null==bill.getName()) {
			throw new Exception();
		}
		
		if(null!=(Double)bill.getAmountMar()|| null!=(Double)bill.getAmountApr()|| null!=(Double)bill.getAmountMay()|| null!=(Double)bill.getAmountJune()) {
			double totalBillPaid=bill.getAmountMar()+bill.getAmountApr()+bill.getAmountMay()+bill.getAmountJune();
				billConclude.setTotalBillPaid(totalBillPaid);
		}
		if(null==(Double)bill.getPostReading()&&null==(Double)bill.getPreReading()) {
			throw new Exception();
		}
			double unit=bill.getPostReading()-bill.getPreReading();
			double avgUnit=unit/4;
			double avgConsumpion=billService.getBillAmount(avgUnit);
			billConclude.setExpectedBillAmount(avgConsumpion*4);
			return billConclude;
		
		
	}

}
