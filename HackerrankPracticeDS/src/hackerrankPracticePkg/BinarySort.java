package hackerrankPracticePkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySort {
    public static void main(String[] args) {
        int[] numbers = {3,5,8,5,32,64,9,10,19};

        List<Integer> numberList = new ArrayList<>();

        for (int i : numbers) {
            numberList.add(i);
        }

        System.out.println(numberList);
        Collections.sort(numberList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //if both numbers are same
                if(o1 == o2){
                    return 0;
                }

                String firstBinary = Integer.toBinaryString(o1);
                String secondBinary = Integer.toBinaryString(o2);

                int firstCountOfOnes = countOfOnes(firstBinary);
                int secondCountOfOnes = countOfOnes(secondBinary);

                if(firstCountOfOnes == secondCountOfOnes){
                    return o1.compareTo(o2);
                }

                return firstCountOfOnes < secondCountOfOnes ? -1 : 1;
            }

            private int countOfOnes(String str){
                int countOfOnes = 0;
                for (char ch: str.toCharArray()) {
                    if(ch == '1'){
                        countOfOnes++;
                    }
                }

                return countOfOnes;
            }
        });
        System.out.println(numberList);

        for (Integer i:
             numberList) {
            System.out.print(Integer.toBinaryString(i) + " ");
        }
    }
}
