//Mason Wheeler Section 902
package chapter6;

public class CellPhone 
{
	//Fields
	private String manufact;		//Manufacturer
	private String model;			//Model
	private double retailPrice;		//Retail price
	
	/**
	  	Constructor
	  	@param man	The phone's manufacturer.
	  	@param mod	The phone's model number.
	  	@param price	The phone's retail price. 
	 */
	
	public CellPhone(String man, String mod, double price) {
		manufact = man;
		model = mod;
		retailPrice = price;
	}

	/**
	 	The setManufact method sets the phone's manufacturer name.
	  	@param manufact The phone's manufacturer
	 */
	
	public void setManufact(String man) {
		manufact = man;
	}

	/**
	 	The setModel method sets the phone's model number.
	  	@param model The phone's model number.
	 */
	
	public void setModel(String mod) {
		model = mod;
	}

	/**
	 	The setRetailPrice method sets the phone's retail price.
	 	@param retailPrice The phone's retail price. 
	 */
	
	public void setRetailPrice(double price) {
		retailPrice = price;
	}
	
	/**
	 	getManufact method
	 	@return The name of the phones manufacturer.
	 */
	public String getManufact() {
		return manufact;
	}
	
	/**
	 	getModel method
	 	@return	The name of the phones model.
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 	getRetailPrice method
	 	@return The phone;s retail price.
	 */
	public double getRetailPrice() {
		return retailPrice;
	}
	
}//end of class
