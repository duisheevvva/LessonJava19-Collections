package pharmacyTask.models;

import pharmacyTask.enums.Gender;
import pharmacyTask.enums.Position;

public class Employee {
    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private double expiriece;
    private Position position;
    private Gender gender;


    public Employee() {
    }

    public Employee(Long id, String fullName, String email, String phoneNumber, double expiriece, Position position, Gender gender) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.expiriece = expiriece;
        this.position = position;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getExpiriece() {
        return expiriece;
    }

    public void setExpiriece(double expiriece) {
        this.expiriece = expiriece;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", expiriece=" + expiriece +
                ", position=" + position +
                ", gender=" + gender +
                '}';
    }
}
