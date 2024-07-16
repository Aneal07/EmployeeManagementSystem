import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
  private int id;
  private String name;
  private int age;
  private double salary;

  public Employee(int id, String name, int age, double salary) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
  }
}

class EmployeeManagementSystem {
  private ArrayList<Employee> employees = new ArrayList<Employee>();

  public void addEmployee(Employee e) {
    employees.add(e);
  }

  public void removeEmployee(int id) {
    for (int i = 0; i < employees.size(); i++) {
      Employee e = employees.get(i);
      if (e.getId() == id) {
        employees.remove(i);
        break;
      }
    }
  }

  public void displayEmployees() {
    for (Employee e : employees) {
      System.out.println(e);
    }
  }
}

