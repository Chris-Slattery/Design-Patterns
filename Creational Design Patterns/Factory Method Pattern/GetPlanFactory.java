

//Class to generate an object of concrete class based on given information

class GetPlanFactory {

	//Use getPlan method to get object of type Plan
	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}//end if

		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}//end if

		else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommerPlan();
		}//end else if

		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}//end else if

		return null;
	}//end getPlan Method
}
