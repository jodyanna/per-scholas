package com.perscholas.java_basics;

public class ManagerAndTrainee {
  public static void main(String[] args) {
    Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
    m.calculateSalary();
    m.calculateTransportAllowance();

    Trainee t = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
    t.calculateSalary();
    t.calculateTransportAllowance();
  }
}

class Employee {
  long employeeId;
  String employeeName;
  String employeeAddress;
  long employeePhone;
  double basicSalary;
  double specialAllowance = 250.80;
  double hra = 1000.50;

  public Employee(long id, String name, String address, long phone) {
    this.employeeId = id;
    this.employeeName = name;
    this.employeeAddress = address;
    this.employeePhone = phone;
  }

  public void calculateSalary() {
    double salary = this.basicSalary + (this.basicSalary * specialAllowance / 100) + (this.basicSalary * hra / 100);
    System.out.println(salary);
  }

  public void calculateTransportAllowance() {
    double transportAllowance = 10 / 100f * basicSalary;
    System.out.println(transportAllowance);
  }
}

class Manager extends Employee {
  public Manager(long id, String name, String address, long phone, double salary) {
    super(id, name, address, phone);
    this.basicSalary = salary;
  }

  @Override
  public void calculateTransportAllowance() {
    double transportAllowance = 15 * basicSalary / 100f;
    System.out.println(transportAllowance);
  }
}

class Trainee extends Employee {
  public Trainee(long id, String name, String address, long phone, double salary) {
    super(id, name, address, phone);
    this.basicSalary = salary;
  }
}
