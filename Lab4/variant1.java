package ru.mirea.lab4;

public class variant1 {
    public static void main(String[] args) {
        int[] m = {1, 0, 16, 3, 5, 6, 47, 8, 11, 9};
        int summa = 0;

        for(int i = 0; i < 10; ++i) {
            summa += m[i];
        }
        System.out.println("Сумма элементов первого массива равна:" + summa);


        int[] n = {2, 1, 17, 4, 6, 7, 48, 9, 12, 10};
        int summ = 0;
        int a=0;

        while (a < 10){
            summ += n[a];
            a++;
        }
        System.out.println("Сумма элементов второго массива равна:" + summ);

        int[] l = {3, 2, 18, 5, 7, 8, 49, 10, 13, 11};
        int sum = 0;
        int b=0;

        do{
            sum += l[b];
            b++;
        } while(b < 10);
        System.out.println("Сумма элементов третьего массива равна:" + sum);
    }
}
