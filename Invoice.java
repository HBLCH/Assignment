package assignments;

public class Invoice {
   
	String itemDesc;
	String itemNum;
	double itemPrice;
	int itemQuant;
	
	
	
	
	public String getItemDesc() {
		return itemDesc;
	}




	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}




	public String getItemNum() {
		return itemNum;
	}




	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}




	public double getItemPrice() {
		return itemPrice;
	}




	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}




	public int getItemQuant() {
		return itemQuant;
	}




	public void setItemQuant(int itemQuant) {
		this.itemQuant = itemQuant;
	}




	public Invoice(String itemDesc, String itemNum, double itemPrice, int itemQuant) {
		super();
		this.itemDesc = itemDesc;
		this.itemNum = itemNum;
		this.itemPrice = itemPrice;
		this.itemQuant = itemQuant;
	}

	public double getInvoiceAmount() {
		
		if (this.itemQuant<0) {
			this.itemQuant=0;
		}
		else if (this.itemPrice<0.0) {
			this.itemPrice=0;
		}
		return itemQuant*itemPrice;
		
		
	}



	public static void main(String[] args) {
		Invoice invoiceTest=new Invoice("name","1234",1,-1);
		System.out.println(invoiceTest.getInvoiceAmount());
		
	}
}
