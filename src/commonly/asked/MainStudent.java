package commonly.asked;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStudent {

    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student("meghana", List.of(
                new Subject("maths",98),
                new Subject("science",78),
                new Subject("arts",90)
        )));
        s.add(new Student("sinchana", List.of(
                new Subject("maths",96),
                new Subject("social",90),
                new Subject("kannada",80)
        )));

        // print list of subjects for the given student

        s.stream().filter(student -> student.getName().equals("meghana")).map(x -> x.getSubjects()).flatMap(List::stream).forEach(System.out::println);



//        Optional<Student> max = s.stream().filter(stud -> stud.getSubjects().stream().anyMatch(subject -> subject.getSubName().equals("maths")))
//                .max(Comparator.comparingInt(stud -> stud.getSubjects().stream().filter(sub -> sub.getSubName().equals("maths"))
//                        .findFirst().get().getMarks()
//                ));
//
//        max.ifPresentOrElse(x->System.out.println(x.getName()),()->System.out.println("not found"));


    }
}
