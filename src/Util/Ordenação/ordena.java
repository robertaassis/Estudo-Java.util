package Util.Ordenação;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ordena {
    public static void main(String[] args) {
        Number n1 = Double.valueOf(34.58);
        Number n2 = Double.valueOf(40);
        Number n3 = Double.valueOf(35.6);

        List numbers = new ArrayList<>();
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        Collections.sort(numbers);
        for(int i=0; i<numbers.size();i++ )
        {
            System.out.println(numbers.get(i));
        }
        //List<Number> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        //sortedList.forEach(System.out::println);
    }
}
