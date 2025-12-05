package dsa.collectionPrograms;
import java.util.ArrayList;
import java.util.List;
public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
           empList.add(new Employee("Alice", 5, 75000));
           empList.add(new Employee("Bob", 5, 75000));
           empList.add(new Employee("Bob", 3, 50000));
           empList.add(new Employee("Charlie", 8, 90000));
           empList.add(new Employee("Alpha", 5, 86500));
    
        System.out.println(empList);
        empList.sort(
            (e1,e2)->{
              int num= Double.compare(e2.experience, e1.experience);//Descending order
              if(num==0){
                num=Double.compare(e2.salary, e1.salary);//Descending order
                if(num==0){
                    num=e1.name.compareTo(e2.name);//Ascending order
                }
              }
              return num;
            }
        );
        System.out.println(empList);



    }
    
}
class Employee{
    String name;
    double experience;
    double salary;
   public Employee(String name, double experience, double salary){
        this.name=name;
        this.experience=experience;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", experience=" + experience + ", salary=" + salary + "]\n";
    }
    
}