package za.co.makroprojuct.sales.payment;
import java.util.Scanner;

public class Payment{
private String time;
private String date;
private double totalPayment;
private double balance;
private double price;
private int quantity;

public void setTime(String time){
 this.time = time;
}
public String getTime(){
 return this.time;
}
public void setDate(String date){
 this.date = date;
}
public String getDate(){
 return this.date;
}
public void setTotalPayment(double totalPayment){
 this.totalPayment = totalPayment;
}
public double getTotalPayment(){
 return this.totalPayment;
}
public void setBalance(double balance){
 this.balance = balance;
}
public double getBalance(){
 return this.balance;
}
public void setPrice(double price){
 this.price = price;
}
public double getPrice(){
 return this.price;
}
public void setQuantity(int quantuty){
 this.quantity = quantity;
}
public int getQuantity(){
 return this.quantity;
}

Payment(){}

Payment(String time,String date,double totalPayment,double balance,double price,int quantity){
 this.time = time;
 this.date = date;
 this.totalPayment = totalPayment;
 this.balance = balance;
 this.price = price;
 this.quantity = quantity;

}

Scanner sc = new Scanner(System.in);

public void cash(){
System.out.println("Enter cash");
  int cash = sc.nextInt();
 
if(cash == price){
System.out.println("recept");
}else if(cash != price){
System.out.println("remove item");

}

}
}
