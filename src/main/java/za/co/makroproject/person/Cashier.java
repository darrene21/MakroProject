package za.co.makroproject.person.Cashier;
import java.util.Scanner;

public class Cashier extends Employee{

private double amountReceived;
private double change;

Cashier(){}
Cashier(double amountReceipt,double change){
Super(employeeNumber,username,passord,position);

this.amountReceived = amountReceived;
this.change = change;

}

Scanner sc = new Scanner(System.in);

public void giveChange(){
System.out.println("Enter amount");
double amount = sc.nextDouble();


//public void scanProduct(){
//System.out.println("Enter bar code ");
//String barCode = sc.nextLine;
}
}

