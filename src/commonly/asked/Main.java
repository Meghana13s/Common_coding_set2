package commonly.asked;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("sinch","female",134));
        empList.add(new Employee("sinchana","female",134));
        empList.add(new Employee("parikshith","male",564));
        empList.add(new Employee("rahul","male",1394));
        empList.add(new Employee("latha","female",1343));

        empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName)).forEach(System.out::println);

//        double v = empList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
//        System.out.println(v);
//
//        HashMap<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee::getGender, HashMap::new, Collectors.counting()));
//        Long male = collect.get("male");
//        Long female = collect.get("female");

//        Map<String, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(emp -> emp.getGender() == "female" ? "female" : "male"));
//        List<Employee> female = collect.get("female");
//        List<Employee> male = collect.get("male");

//        System.out.println(female);
//        System.out.println(male);


    }
}
