package za.co.makroproject.person.Manager;
import za.co.makroproject.stock.Product;
import java.util.Scanner;

public class Manager extends Employee{

private Product product[];

public void setProduct(String product){
    this.product = product;
}
public String getProduct(){
    return this.product;
}

Manager m = new Manager();
Scanner sc = new Scanner(System.in);

public void registerCustomer(){
System.out.println("Register new customer");
System.out.println("Enter fullName");
  String fullname = sc.nextLine();
System.out.println("Enter idNumber");
  long idNumber = sc.nextLong();
System.out.println("Enter dateOfBirth");
  String dateOfBirth = sc.nextLine();
System.out.println("Enter phoneNumber");
  long phoneNumber = sc.nextLong();
System.out.println("Enter emailAddress");
  String emailAddress = sc.nextLine();
System.out.println("Enter address");
  String address = sc.nextLine();
System.out.println("Successfull transaction");
System.out.println("IssuedCard");

}

public void registerSupplier(){
System.out.println("Enter companyName");
   String companyName = sc.nextLine();
System.out.println("Enter companyAddress");
   String companyAddress = sc.nextLine();
System.out.println("Enter cellPhone");
   int cellPhone = sc.nextInt();
System.out.println("Successed");
}

public void receiveProduct(){
System.out.println("check quantity of goods");
  long quantityOfProduct = sc.nextLong();
System.out.println("check the epiring date");
  String epiringDate = sc.nextLine(); 
System.out.println("collect goods");
  
}
}