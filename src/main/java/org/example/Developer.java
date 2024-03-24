package org.example;

public class Developer {
    private String firstname;
    private String lastname;
    private long salary;

    public Developer() {
    }

    public Developer(String firstname, String lastname, long salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void getInformation(){
        System.out.println("My name is - " + firstname + " and lastname - " + lastname + " my salary is - " + salary );
    }
}
