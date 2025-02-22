import java.util.List;
import java.util.stream.Collectors;

public class FP1 {
    public static void main(String[] args) {

        // Exercise - 1
        // Out of the below list print only those which consist of word sping
        List<String> liOfwords = List.of("Spring","Not"," some" ,"word","spring");
        liOfwords.stream().filter(x->x.toLowerCase().contains("spring")).forEach(System.out::println);

        // Exercise - 2
        // print elements which has atleast 4 characters
        liOfwords.stream().filter(x->x.length()>=4).forEach(System.out::println);

        // Exercise - 3
        // given the below list of numbers print cube of odd numbers
        List<Integer> liOfInt = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(liOfInt.stream().filter(s->s%2!=0).map(x->x*x*x).collect(Collectors.toList()));

        //Exercise -4
        //print all the nos in the list
        List<Integer> li = List.of(12,9,8,3,2,1);
        li.stream().forEach(System.out::println);

        // Exercise -5
        //print all even nos in the list
        li.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}
