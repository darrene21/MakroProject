package za.co.makroproject.person.Person;
public abstract class Person{

private String firstName;
private String surname;
private String dob;
private long phoneNumber;
private long idNumber;
private String homeAddress;
private String emailAddress;
private String gender;
private String maritalStatus;

public void setFirstName(String firstName){
this.firstName = firstName;
}

public String getFirstName(){
return firstName;
}

public void setSurname(String surname){
this.surname = surname;
}

public String getSurname(){
return surname;
}

public void setDob(String dob){
this.dob = dob;

}

public String getDob(){
return dob;
} 

public void setPhoneNumber(long phoneNumber){
this.phoneNumber = phoneNumber;
}

public long getPhoneNumber(){
return phoneNumber;
}

public void setIdNumber(long idNumber){
this.idNumber = idNumber;
}

public long getIdNumber(){
return idNumber;
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

public void setGender(String gender){
this.gender = gender;
}

public String getGender(){
return gender;
}

public void setMaritalStatus(String maritalStatus){
this.maritalStatus = maritalStatus;
}

public String getMaritalStatus(){
return maritalStatus;
}

public String toString() {
  return "Person [firstName=" + firstName + ", surname=" + surname + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", idNumber=" + idNumber + ", homeAddress=" + homeAddress + ", emailAddress=" + emailAddress + ", gender=" + gender + ", maritalStatus=" + maritalStatus + "]";

}

}










