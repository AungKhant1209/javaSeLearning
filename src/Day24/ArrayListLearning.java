package Day24;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        int[] array = new int[1000];//need to specified array size
        List<Integer> list = new ArrayList<>();//no need to specified array size
        List<Integer> list1 = new ArrayList<>();
        list1.add(101);
        list1.add(102);
//        list1.add(107);
//        list1.add(103);
//        list1.add(104);
//        list1.add(105);


        list.add(1);
        list.add(102);
        list.add(101);
        list.add(2);
        list.add(3);
        list.add(4);//no need to set data with index
        array[0] = 1;// need to set data with index

        array[1] = 1;//need to get data with index
        System.out.println("list.get(1)"+list.get(1));//need to set data with index
        System.out.println("list.getFirst()"+list.getFirst());
        System.out.println("list.getLast()"+list.getLast());

        list.remove(0);//provide remove
        System.out.println("After remove first item");
        System.out.println("list.get(1)"+list.get(1));//need to set data with index
        System.out.println("list.getFirst()"+list.getFirst());
        System.out.println("list.getLast()"+list.getLast());

        list.addAll(list);
        System.out.println("After add all from list");
        for(int num:list){
            System.out.println(num);
        }

        if(list.contains(1)){
            System.out.println("1 is in list");
        }else{
            System.out.println("1 is not in list");
        }
        if(list.contains(2)){
            System.out.println("2 is in list");
        }else{
            System.out.println("2 is not in list");
        }

        list.set(1, 100);
//        list.addFirst(1234);
        list.addLast(1234);
        System.out.println("list.indexOf(100)--->"+list.indexOf(100));
        if(list1.contains(list)){
            System.out.println("list1 is in list");
        }else{
            System.out.println("list1 is not in list");
        }
        System.out.println("After set 100 to index 1");
        for(int num:list){
            System.out.println(num);
        }

        list.clear();
        System.out.println("After clear list");
        if(list.isEmpty()){
            System.out.println("list is empty");
        }




    }
}