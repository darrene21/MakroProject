package za.co.makroproject.person.Employee;
//import za
import java.util.Scanner;
public class Employee extends Person{

private String position;
private long employeeNumber;
private String username;
private String password;

public void setPosition(String position){
 this.position = position;
}
public String getPosition(){
 return this.position;
}
public void setEmployeeNumber(String employeeNumber){
 this.employeeNumber = employeeNumber;
}
public String getEmployeeNumber(){
 return this.employeeNumber;
}
public void setUsername(String username){
 this.username = username;
}
public String getUsername(){
 return this.username;
}
public void setPasswold(String password){
 this.passwoid = password;
}
public String getPassword(){
 return this.password;
}


Employee(){}
Employee(String firstName,String lastName,String dateOfBirth,String emailAddress,char gender,long phoneNumber,String address,long idNumber,long employeeNumber,String username,String password,String position){
super(firstName,lastName,dateOfBirth,emailAddress,gender,phoneNumber,address,idNumber);
   this.employeeNumber = employeeNumber;
   this.username = username;
   this.password = password;
   this.position = position;
}

Scanner sc = new Scanner(System.in);
Employee e = new Employee();
Employeee em = new Employee();


public void login(){

System.out.println("Enter username");
   username = sc.nextLine();
System.out.println("Enter password");
   password = sc.nextLine();

Employee empolyees = new Empolyee[12];

for(int i = 0;i <employee.length;i++){
if(employees[0].username.equals(username)$$ employees[0].password.equals(password){


//System.out.println("

System.out.println("successfully");
}
}
}
public void issuedCard(){
System.out.println("Enter card");
  String card = sc.nextLine();
System.out.println("Enter pin");
  String pin = sc.nextLine();
System.out.println("Successfull");

}
public void scanProduct(){
System.out.println("Enter barCode");
System.out.println("
System.out.println("");


}

}
