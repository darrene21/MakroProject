package za.co.makroproject.person.Customer;

import za.co.makroproject.person.Person;
import za.co.makroproject.sales.Payment;
import za.co.makroproject.sales.Cart;
import za.co.makroproject.stock.Product;

import java.util.Scanner;
public class Customer extends Person{

            private String custcardNo;
            private String accNo;
            private int cardNo;

            Scanner sc = new Scanner(System.in);

           public void setCustcardNo(String custcardNo){
             this.custcardNo = custcardNo;
           }
            
           public String getCustcardNo(){
            return custcardNo;
           }

           public void setAccNo(String accNo){
             this.accNo = accNo;
           }

           public String getAccNo(){
             return accNo;
           }

           public void setCardNo(int cardNo){
             this.cardNo = cardNo;
           }

           public int getCardNo(){
            return cardNo;
           }           

           public void makroposCardBonus(payment payment){
           
           
           }
           










