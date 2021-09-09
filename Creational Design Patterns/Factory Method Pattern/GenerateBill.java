import java.io.*;


class GenerateBill {

	public static void main(String[] args) throws IOException {

		GetPlanFactory planFactory = new GetPlanFactory();

		System.out.println("Enter the name of the plan for which the bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();
		System.out.println("Enter the number of units for bill to be calculated: ");
		int units = Integer.parseInt(br.readLine());

		Plan p = planFactory.getPlan(planName);
		//Call getRate() method and calculateBill() Method of DomesticPlan

		System.out.println("Bill amount for " + planName + "of" + units + "units is: ");
		p.getRate();
		p.calculateBill(units);


	}

}
