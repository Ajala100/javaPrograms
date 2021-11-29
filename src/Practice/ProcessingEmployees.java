package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("james", "indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("jason", "blue", 3200, "Sales"),
                new Employee("Mendy", "Brown", 4236.4, "sales")
        };

        List<Employee> list = Arrays.asList(employees);
        System.out.println("complete employee list: ");
        list.stream().forEach(System.out::println);

        Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
        //display employees with salaries in the range $4000 - $6000
        //sorted into ascending order by salary
        System.out.printf("%nEmployees earning $4000 - $6000 per month sorted by salary: %n");
        list.stream().filter(fourToSixThousand).sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
        //display first employee with salary in the range $4000 - $6000
        System.out.printf("%n first employees who earns $4000 - $6000:%n%s%n", list.stream().filter(fourToSixThousand).findFirst().get());
        //functions for getting first and last names for an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        //comparator for comparing Employees by fist name then last name
        Comparator <Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

        //sort employees by last name, then first name
        System.out.printf("%n Employees in ascending order by last name then first: %n");
        list.stream().sorted(lastThenFirst).forEach(System.out::println);

        System.out.printf("");

        //display unique employee last names sorted
        System.out.printf("%nUnique employee last names;%n");
        list.stream().map(Employee::getLastName).distinct()
                .sorted().forEach(System.out::println);
        //display only first and last names
        System.out.printf("%nEmployee names in order by last name then first name:%n");
        list.stream().sorted(lastThenFirst).map(Employee::getName).forEach(System.out::println);

        //group elements by department
        System.out.printf("%nEmployees by department: %n");
        Map<String, List<Employee>> groupedByDepartment = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach((department, employeesInDepartment)-> {System.out.printf("%n%s%n", department);
        employeesInDepartment.forEach(employee -> System.out.printf("   %s%n", employee));});

        //count number of Employees in each department
        System.out.printf("%n%Count of employees by department: %n");
        Map<String, Long> employeeCountByDepartment = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.counting()));
        employeeCountByDepartment.forEach((department, count) -> System.out.printf("%s has %d employee(s)%n", department, count));

        //sum of employee salaries with DoubleStream sum method
        System.out.printf("%nSum of employees salaries (via sum method): %.2f%n", list.stream().mapToDouble(Employee::getSalary).sum());

        //calculate sum of employee salaries with stream reduce method
        System.out.printf("Sum of employees salaries (via reduce method): %.2f%n", list.stream()
                .mapToDouble(Employee::getSalary).reduce(0, (value1, value2) -> value1 + value2));
        //average of employee salaries with doubleStream average method
        System.out.printf("average of Employee's salaries: %.2f%n", list.stream().mapToDouble(Employee::getSalary).average()
        .getAsDouble());
    }



}
