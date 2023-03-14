package HW_10032023;
/*
Задача 2. Дан непустой массив целых чисел nums, каждый элемент которого встречается дважды, кроме одного.
Найдите этот единственный элемент. Пример 1: Вход: nums = [2,2,1] Выход: 1
Пример 2: Вход: nums = [4,1,2,1,2] Выход: 4
Пример 3: Вход: nums = [1] Выход: 1

 *
* */

public class Tasktwo_10032023 {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,1,2,3,4,3,5,4,6,5,7,8,8,7,6,10};
        int result=0;
        //дефолт XOR поиск
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        System.out.println(result);
    }

}
