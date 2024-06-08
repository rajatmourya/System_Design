package Weekend2.Oops.lambdastrategy;

import java.util.List;

public class BadCode {

    public static int sumAll (List<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static int sumAllOdd (List<Integer> nums){
        int  sum = 0;
        for (int num : nums) {
            if (num %2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sumAllEven (List<Integer> nums){
        int  sum = 0;
        for (int num : nums) {
            if (num %2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumAll(List.of(1,2,3,4,5)));
        System.out.println(sumAllEven(List.of(1,2,3,4,5)));
        System.out.println(sumAllOdd(List.of(1,2,3,4,5)));
    }
}

/*
Predicate

test which return true or false.

predicate<Integer> isOdd = (X) -> x % 2 != 0;

isOdd.test(5)

predicate<Object>
 */
