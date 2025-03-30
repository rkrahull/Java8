package com.rahul.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Steams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul","Rohit","Kunal","Pulkit","Kartik","Rahul","Kunal");
        List<String> namesUpper = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(namesUpper);

        List<String> namesLower = names.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(namesLower);

        //distinct
        List<String> distinctNames=names.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNames);

        //count
        long count=names.stream().distinct().count();
        System.out.println(count);

        //limit
        names.stream().limit(4).forEach(name-> System.out.print(name + " "));
        System.out.println();

        //min
        List<Integer> integerList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> min = integerList.stream().min((val1, val2)->{
            return val1.compareTo(val2);
        });
        System.out.println(min.get());

        //max
        Optional<Integer> max = integerList.stream().max((val1, val2)->{
            return val1.compareTo(val2);
        });
        System.out.println(max.get());

        //reduce

        Optional<String> name=names.stream().reduce((value,combinedValue)->{
            return value+combinedValue;
        });
        System.out.println(name.get());

        //toArray()

        Object[] arr = names.stream().toArray();
        for(Object val : names)
            System.out.print(val+ " ");
        System.out.println();

        //sorted
        List<Integer> list = Arrays.asList(7,4,1,6,2,8,0,3);
        List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        List<Integer> reverse = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverse);

        //anyMatch()
        Set<String> st=new HashSet<>();
        st.add("One apple");
        st.add("One mango");
        st.add("Two apples");
        st.add("More grapes");
        st.add("Two guavas");

        boolean result=st.stream().anyMatch(value->{return value.startsWith("One");});
        System.out.println(result);

        //allMatch()
        result=st.stream().allMatch(value->{return value.startsWith("One");});
        System.out.println(result);

        //noneMatch()
        result=st.stream().noneMatch(value->{return value.startsWith("One");});
        System.out.println(result);

        //findAny()
        Optional<String> element = names.stream().findAny();
        System.out.println(element.get()); // NoSuchElementException if empty

        //findFirst()
        element = names.stream().findFirst();
        System.out.println(element.get()); //NoSuchElementException if empty

        //concat()
        List<String> names1 = Arrays.asList("Rahul","Rohit");
        List<String> names2 = Arrays.asList("Kunal","Pulkit","Kartik");

        Stream <String> stream1=names1.stream();
        Stream <String> stream2=names2.stream();

        List<String> finalList = Stream.concat(stream1,stream2).collect(Collectors.toList());
        System.out.println(finalList);

    }
}

