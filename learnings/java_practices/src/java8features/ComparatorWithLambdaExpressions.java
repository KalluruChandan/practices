package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//without use of lambda
/*class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        *//*
         *   Comparator is a Functional Interface with compare abstract method
         *   it functions as below
         *       -returns -ve iff o1 comes before o2
         *       -returns +ve iff o1 comes after o2
         *       -returns 0 iff o1 equals to o2
         *
         *//*
        return (o1<o2)?-1:(o1>o2)?1:0;
    }
}
public class ComparatorWithLambdaExpressions{
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(
                List.of(2,7,1,6,11,10,56,25,11)
        );
        System.out.println(integerList);
        Collections.sort(integerList,new MyComparator());
        System.out.println(integerList);
    }
}*/

//with use of lambda
public class ComparatorWithLambdaExpressions {

    public static void main(String[] args) {
        Comparator<Integer> c = (o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
        List<Integer> integerList = new ArrayList<>(
                List.of(2,7,1,6,11,10,56,25,11)
        );
        System.out.println(integerList);
        Collections.sort(integerList,c);
        System.out.println(integerList);
    }
}
