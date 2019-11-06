package makroproject.src.main.java.za.co.makroProject.person.Company;
import java.util.Scanner;

public class Company{

private String name;
private String address;
private long telephone;
private String emailAddress;


public void setName(String name){
this.name = name;
}

public String getName(){
return name;
}

public void setAddress(String address){
this.address = address;
}

public String getAddress(){
return address;
}

public void setTelephone(long telephone){
this.telephone = telephone;
}

public long getTelephone(){
return telephone;
}
public void setEmailAddress(String emailAddress){
this.emailAddress = emailAddress;
}


public String getEmailAddress(){
return emailAddress;

}

Scanner sc = new Scanner(System.in);
/*System.out.println("Makro");
System.out.println("shop 67 Makro wonderboom");
System.out.println("012 548 1233");
System.out.println("makrowonder@gmail.com");
*/

//scanner sc = new scanner(System.in);

public void employeeRester(){
System.out.println("Enter name");
String name = sc.nextLine();
setName(name);

System.out.println("Enter address");
String address = sc.nextLine();
setAddress(address);

System.out.println("Enter emailAddress");
String emailAddress = sc.nextLine();
setEmailAddress(emailAddress);

System.out.println("Enter telephone");
long telephone = sc.nextLong();
setTelephone(telephone);

//Scanner a = new scanner(System.in);
//System.out.println("....WELCOME TO MAKRO...");


//public void position(){
int choose = sc.nextInt();
if(choose == 1){
System.out.println("cashier");
}

else if(choose == 2){
System.out.println("mananger");
}

else if(choose == 3){
System.out.println("cleaner");
}


System.out.println("choose your job");
System.out.println("1 cashier");
System.out.println("2 manager");
System.out.println("3 cleaner");

}
}




