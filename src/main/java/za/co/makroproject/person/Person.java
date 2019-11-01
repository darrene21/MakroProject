package za.co.makroproject.person;
public abstract class Person{

private String firstName;
private String lastName;
private String dateOfBirth;
private long phoneNumber;
private String homeAddress;
private String emailAddress;

public void setFirstName(String firstName){
this.firstName = firstName;
}
public String getFirstName(){
return firstName;
}
public void setLastName(String lastName){
this.lastName = lastName;
}
public String getLastName(){
return lastName;
}
public void setDateOfBirth(String dateOfBirth){
this.dateOfBirth = dateOfBirth;
}
public String getDateOfBirth(){
return dateOfBirth;
} 
public void setPhoneNumber(long phoneNumber){
this.phoneNumber = phoneNumber;
}
public long getPhonenumber(){
return phoneNumber;
}
public void setHomeAdress(String homeAddress){
this.homeAddress = homeAddress;
}
public String getHomeAddress(){
return homeAddress;
}
public void setEmailAddress(String emailAddress){
this.emailAddress = emailAddress;
}
public String getEmailAddress(){
return emailAddress;
}
}










