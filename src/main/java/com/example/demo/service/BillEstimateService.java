package com.example.demo.service;

import com.example.demo.constant.SlabDetails;

public class BillEstimateService {
	double oneSlabEnergy=(SlabDetails.Slab_Rate_One_Unit)*(SlabDetails.Slab_Rate_One_Price);
	double twoSlabEnergy=(SlabDetails.Slab_Rate_Two_Unit)*(SlabDetails.Slab_Rate_Two_Price);
	double threeSlabEnergy=(SlabDetails.Slab_Rate_Three_Unit)*(SlabDetails.Slab_Rate_Three_Price);
	double fourSlabEnergy=(SlabDetails.Slab_Rate_Four_Unit)*(SlabDetails.Slab_Rate_Four_Price);
	double fiveSlabEnergy=(SlabDetails.Slab_Rate_Five_Unit)*(SlabDetails.Slab_Rate_Five_Price);
	double sixSlabEnergy=(SlabDetails.Slab_Rate_Six_Unit)*(SlabDetails.Slab_Rate_One_Price);
	
	double firstSlabLimit=SlabDetails.Slab_Rate_One_Unit;
	double secondSlabLimit=SlabDetails.Slab_Rate_One_Unit+SlabDetails.Slab_Rate_Two_Unit;
	double thirdSlabLimit=SlabDetails.Slab_Rate_One_Unit+SlabDetails.Slab_Rate_Two_Unit+SlabDetails.Slab_Rate_Three_Unit;
	double fourthSlabLimit=SlabDetails.Slab_Rate_One_Unit+SlabDetails.Slab_Rate_Two_Unit+SlabDetails.Slab_Rate_Three_Unit +SlabDetails.Slab_Rate_Four_Unit;
	double fifthSlabLimit=SlabDetails.Slab_Rate_One_Unit+SlabDetails.Slab_Rate_Two_Unit+SlabDetails.Slab_Rate_Three_Unit +SlabDetails.Slab_Rate_Four_Unit+SlabDetails.Slab_Rate_Five_Unit;
	double sixthSlabLimit=SlabDetails.Slab_Rate_One_Unit+SlabDetails.Slab_Rate_Two_Unit+SlabDetails.Slab_Rate_Three_Unit +SlabDetails.Slab_Rate_Four_Unit+SlabDetails.Slab_Rate_Five_Unit+SlabDetails.Slab_Rate_Six_Unit;
	
	
	public double getBillAmount(double unit) {
		double amount=0;
		if(unit<=firstSlabLimit) {
			amount=unit*SlabDetails.Slab_Rate_One_Price;
		}
		if(unit>firstSlabLimit && unit<=secondSlabLimit) {
			amount=oneSlabEnergy+(unit-firstSlabLimit)*SlabDetails.Slab_Rate_Two_Price;
		}
		if(unit>secondSlabLimit && unit<=thirdSlabLimit) {
			amount=oneSlabEnergy+twoSlabEnergy+(unit-secondSlabLimit)*SlabDetails.Slab_Rate_Three_Price;
		}
		if(unit>thirdSlabLimit && unit<=fourthSlabLimit) {
			amount=oneSlabEnergy+twoSlabEnergy+threeSlabEnergy+(unit-thirdSlabLimit)*SlabDetails.Slab_Rate_Four_Price;
		}
		if(unit>fourthSlabLimit && unit<=fifthSlabLimit) {
			amount=oneSlabEnergy+twoSlabEnergy+threeSlabEnergy+fourSlabEnergy+(unit-fourthSlabLimit)*SlabDetails.Slab_Rate_Five_Price;
		}
		if(unit>fifthSlabLimit && unit<=sixthSlabLimit) {
			amount=oneSlabEnergy+twoSlabEnergy+threeSlabEnergy+fourSlabEnergy+fiveSlabEnergy+(unit-fifthSlabLimit)*SlabDetails.Slab_Rate_Six_Price;
		}
		if(unit>sixthSlabLimit ) {
			amount=oneSlabEnergy+twoSlabEnergy+threeSlabEnergy+fourSlabEnergy+fiveSlabEnergy+sixSlabEnergy+(unit-sixthSlabLimit)*SlabDetails.Slab_Rate_Seven_Price;
		}
		return amount;
		
	}
	

}
