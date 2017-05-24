/*S.McDonald 11/2/2016
TestInvoice.java
Create several objects of Invoice class with different scenarios
*/


public class TestInvoice
{
   public static void main(String[] args)
   {
      //create Invoice objects
      Invoice inv1 = new Invoice(1234, 540.75, 4, 19, 2012); //valid invoice record
      Invoice inv2 = new Invoice(200, 540.75, 4, 19, 2012); //invalid invoice number
      Invoice inv3 = new Invoice(1234, -540.75, 14, 19, 2012); //invalid invoice month
      Invoice inv4 = new Invoice(1234, 540.75, 4, 35, 2012); //invalid invoice day
      Invoice inv5 = new Invoice(1234, 540.75, 4, 19, 1970); //invalid invoice year
      Invoice inv6 = new Invoice(123, 540.75, 14, 35, 1970); //invalid invoice
      
      //output
      //display all objects
      inv1.show();
      inv2.show();
      inv3.show();
      inv4.show();
      inv5.show();
      inv6.show();
   
   }//main method

}//class