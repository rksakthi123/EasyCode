
public class CTCVsInHand {
	
	static double esppPercentage=0;

	public static void main(String[] args) {
		CTCVsInHand obj=new CTCVsInHand();
		obj.getInHandSalary(1243000);
	}
	
	public void getInHandSalary(double ctc) {
		double basic=ctc/2;
		//double pf=basic*(.12)/12;
		double pf=1800;
		double hra=basic*(.4)/12;
		double espp=ctc*(esppPercentage)/12;
		double lta=basic*(.15)/12;
		double otherAllowance=(basic/12)-(pf+hra+lta);
		double incomeTax=getIncomeTax(ctc)/12;
		double gross=(basic/12)+hra+lta+otherAllowance;
		double net=gross-(pf+incomeTax+200+espp);
		System.out.println("Gross Salary:"+gross);
		System.out.println("Net Salary:"+net);
		System.out.println("ESPP:"+espp);
		System.out.println("pf:"+pf);
		System.out.println("Income Tax:"+incomeTax);
	}
	public double getIncomeTax(double income) {
		//income=income-200000; //home loan interest
		income=income-100000;  //80C
		income=income-50000;  //Standard deduction
		double taxableIncome=income;
		double tax=112500;
		income=income-1000000;
		tax=tax+(income*.3);
		if(taxableIncome>=5000000) {
			tax=tax*1.1;
		}
		
		return tax;		
	}

}
