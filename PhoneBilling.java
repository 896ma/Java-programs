

//importing  modules


import java.time.*;
import java.util.Scanner;
class PhoneBilling{
    static double Amount =0.0;
    static int  Time, Duration;
    static double  VAT,totalcharge;
    static String  Network_provider;
    
     
    //Creating a method for inputing values
    static void InputValues(){
         Scanner SIMcompany =new Scanner(System.in);
         System.out.println("Enter network Provider for the call receiver");
         Network_provider=SIMcompany.nextLine();
         Scanner Timeofcall = new Scanner(System.in);
         System.out.println("Enter Time of call");
         Time=  Timeofcall.nextInt();
         Scanner  Durationofcall =new Scanner(System.in);
         System.out.println("Enter call Duration");
         Duration =  Durationofcall.nextInt();
 
    }  
 
    //Computing Call Charge 

    static void ComputeCharges (){
     //Charges for calls made to a Safaricom network
    if (Network_provider == "Safaricom"){ 
    
        if(Time >= 0601 && Time <=1800){
         Amount =4* Duration;
           if(Duration >2){ 
            VAT =0.16 * Amount;
           }   
        totalcharge =Amount+VAT;
    
        } 
        else if (Time >=1801 && Time <=0600){
          Amount = 3*Duration;
           if(Duration>2){ 
            VAT =0.16* Amount;
           }
          totalcharge=Amount+VAT;    
        }  
    } 
    //charges for calls made to networks other than Safaricom eg.Airtel or Telkom
    else if (Network_provider!="Safaricom"){
      Amount =5*Duration;
        if (Duration >2){
          VAT =0.16*Amount;
        } 
      totalcharge =Amount +VAT;
    } 

    }

public static void main(String args[]){
     
    InputValues();
        ComputeCharges();
        System.out.println("Total call expenses are  ksh." + totalcharge);


      }
}
    


        
    
    
 
  



