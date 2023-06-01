package Preparation4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
        Employee emp1=new Employee(1101,"Dhananjeyan",25,"male","Mechanical",2019,20000.456d);
		
		Employee emp2=new Employee(1106,"Jana",42,"male","Store",2019,25800.756d);

		Employee emp3=new Employee(1107,"Jajina",19,"female","Doctor",2019,50000.656d);
		
		Employee emp4=new Employee(1129,"Viji",30,"female","Software designer",2019,33000.956d);

		Employee emp5=new Employee(1146,"Sasi",23,"male","designer",2019,46000.416d);
		
		ArrayList<Employee> employee=new ArrayList<>();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(emp5);
		// List<Employee> col=employee.stream().filter(x->x.getAge()>20).collect(Collectors.toList());
		//System.out.println(col);
		//Employee select=employee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().get();
		//System.out.println(select);
		//Optional<Employee> emp = employee.stream()
		     //  .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();

		//System.out.println(emp);
		//List<Employee> sort=employee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).skip(3).collect(Collectors.toList());
		//sort.forEach(x->System.out.println(x));
		//System.out.println(sort);
		List<Employee> salary= employee.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(5).skip(1).collect(Collectors.toList());
		salary.forEach(x->System.out.println(x));
	}

}
