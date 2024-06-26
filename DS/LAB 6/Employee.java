import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee id");
        int Employee_id=sc.nextInt();
        System.out.println("Enter Name");
        String Name=sc.next();
        System.out.println("Enter Designation");
        String Designation=sc.next();
        System.out.println("Enter salary");
        int salary=sc.nextInt();
        sc.close();
        employee_detail ep=new employee_detail(Employee_id, Name, Designation, salary);
        ep.printdetails();
    }
}
class employee_detail{
    int Employee_id;
    String Name;
    String designation;
    int salary;
    employee_detail(int Employee_id,String Name,String designation,int salary){
        this.Employee_id=Employee_id;
        this.Name=Name;
        this.designation=designation;
        this.salary=salary;
    }
    public void printdetails(){
        System.out.println(Employee_id);
        System.out.println(Name);
        System.out.println(designation);
        System.out.println(salary);
    }
}
