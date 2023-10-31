package practice1;


class CountryNotValidException extends Exception{
	public CountryNotValidException(String s) {
		super(s);
	}
}

class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException (String s) {
		super(s);
}
}
class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException (String s) {
		super(s);
}
}

 class TaxCalculator {
  public double calculateTax(String empName, boolean isIndian, double empSal)throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException  {
    	double taxAmount =0;
    	
    	if(! isIndian) {
    		
    			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
    		
    			
    	}
    	if(empName == null || empName.isEmpty()) {
    		
    		
    			throw new EmployeeNameInvalidException("The employee name cannot be empty");
    		
    		
    	}
    	
    	if(empSal>100000 && isIndian) {
    		taxAmount =empSal *8/100;
    	}
    	else if(50000<empSal && empSal<1100000 && isIndian) {
    		taxAmount =empSal *6/100;
    	}
    	else if(30000<empSal && empSal<=50000 && isIndian) {
    		taxAmount =empSal *5/100;
    	}
    	else if(10000<empSal && empSal<=30000 && isIndian) {
    		taxAmount =empSal *4/100;
    	}
    	else {
    		
    			throw new TaxNotEligibleException("The employee does not need to pay tax");
    		
    		
    	}
    	return taxAmount;
  }
}
 
public class CalculatorSimulator {
	public static void main(String[] args) {
		TaxCalculator t = new TaxCalculator();
		try {
			double result= t.calculateTax("Anindita", true, 50000);
			System.out.println(result);
		}
		catch(CountryNotValidException e){
			
			e.printStackTrace();
		}
		catch (EmployeeNameInvalidException e) {
            
            e.printStackTrace();
        } catch (TaxNotEligibleException e) {
            
            e.printStackTrace();
        }
	}
}
