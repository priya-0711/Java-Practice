import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FP4WithStudentClassQues {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929"))

        );
        //1.find list of students whose rank is between 50 and 100
        System.out.println(students.stream().filter(s->s.getRank()>50 && s.getRank()<100).collect(Collectors.toList()));

        //2.find students staying in karnataka and sort them by their names
        System.out.println(students.stream().filter(s->s.getCity().equalsIgnoreCase("karnataka")).sorted(Comparator.comparing(Student::getSname)).collect(Collectors.toList()));

        //3.find students staying in karnataka and sort them by their names in reverse order
        System.out.println(students.stream().filter(s->s.getCity().equalsIgnoreCase("karnataka")).sorted(Comparator.comparing(Student::getSname,Comparator.reverseOrder())).collect(Collectors.toList()));

        //4.find all dept names
        System.out.println(students.stream().map(Student::getDept).distinct().collect(Collectors.toList()));

        //5.find all contact numbers
        System.out.println(students.stream().flatMap(s->s.getContacts().stream()).collect(Collectors.toSet()));

        //6.find list of students by department names
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDept)));

        //7.find the count of dept names
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting())));

        //8. find the dept which has max no of students
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());

        //9/find avg age of male and female students
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge))));

        //10. find highest rank in each dept
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.minBy(Comparator.comparing(Student::getRank)))));

        //11.find student who has second rank
        System.out.println(students.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get());

    }
}
