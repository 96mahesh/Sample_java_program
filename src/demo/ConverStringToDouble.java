package demo;

public class ConverStringToDouble {

	public static void main(String[] args) {
		
//		String no = "275376.875";
//		double amount = Double.parseDouble(no+100);
//		System.out.println(amount);
		try {
		String ss = "";
		double doubleVAlue = 0;
		String value= "2,75,376";
		System.out.println("Value Of String :"+value);
		String s[] = value.split(",");
		for(int i=0;i<s.length;i++) {
			ss=ss.concat(s[i]);
			System.out.println(ss);
		}
		System.out.println(ss);
		 doubleVAlue = Double.parseDouble(ss);
		 System.out.println("Double value : == :"+doubleVAlue+100);
		//LOGGER.logTestStep(extentTest, "INFO", "Clicked on element:"+viewrequest, false);
	}catch(Exception e) {
		e.printStackTrace();
		//BaseTest.utilObj.get().getAssertManager().sAssertException("Failed while clicking on element:"+viewrequest+ ".Exception"+e.getMessage(), true, true);
	}	

	}
}
