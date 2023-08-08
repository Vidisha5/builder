import java.util.Arrays;import java.util.List;
public class B {
public static void main(String[] args) {List<Integer> b = Arrays.asList(1,2,3,4);System.out.println(b.stream().reduce(0, (a,c)->a+c));	}}
