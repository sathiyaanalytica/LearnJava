package Firstpgm;

public class RestBill{
  
	public static void main(String[] args) 
	{
		int Idli = 2;
		int Dosa = 3;
		int Pongal = 2;
		int Tax_Percentage = 18;
		
		double Idli_Price = 10;
		double Dosa_Price = 30;
		double Pongal_Price = 35;
		
		double Total=(Idli*Idli_Price + Dosa*Dosa_Price + Pongal*Pongal_Price);
		
		double TotalTax= (Total*Tax_Percentage)/100;
		
		double TotalP=Total+TotalTax;
		
		System.out.print("Price before Tax: ");
		System.out.println(Total);
		System.out.print("Price after Tax : ");
		System.out.println(TotalP);
		
	}
}
