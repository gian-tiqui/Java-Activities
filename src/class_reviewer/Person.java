package class_reviewer;

import java.time.Year;
import java.util.ArrayList;

class Fullname {
    private String firstName, middleName, lastName;

    public Fullname(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

public class Person {

    Fullname fullname;
    int birthYear, birthMonth, birthdate, age;
    String gender;
    ArrayList<String> hobbies;

    public Person() {}

    public Person(String firstName,
                  String middleName,
                  String lastName,
                  int birthYear,
                  int birthMonth,
                  int birthDate,
                  String gender,
                  ArrayList<String> hobbies) {
        int currentYear = Integer.parseInt(String.valueOf(Year.now()));
        this.fullname = new Fullname(firstName, middleName, lastName);
        this.age = currentYear - birthYear;
        this.birthYear = birthYear;
        this.gender = gender;
        this.hobbies = hobbies;
        this.birthMonth = birthMonth;
        this.birthdate = birthDate;
    }

    public Fullname getFullname() {
        return fullname;
    }

    public void setFullname(Fullname fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void updateAge() {
        this.age = Integer.parseInt(String.valueOf(Year.now())) - this.birthYear;
    }

    public String getJSON() {
        return "class_reviewer.Person{" +
                "fullname=" + fullname +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                ", birthdate=" + birthdate +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    public String getFirstName() {
        return fullname.getFirstName();
    }

    public void setFirstName(String firstName) {
        fullname.setFirstName(firstName);
    }

    public String getMiddleName() {
        return fullname.getMiddleName();
    }

    public void setMiddleName(String middleName) {
        fullname.setMiddleName(middleName);
    }

    public String getLastName() {
        return fullname.getLastName();
    }

    public void setLastName(String lastName) {
        fullname.setLastName(lastName);
    }
}
