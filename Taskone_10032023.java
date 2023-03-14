package HW_10032023;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
element appears only once. The relative order of the elements should be kept the same.


* */

import java.util.Arrays;

public class Taskone_10032023 {
    public static void main(String[] args) {
        int[] a = { 0,0,1,1,1,2,2,3,3,4};

        int n = a.length;
        //ПОжалуй тот случай, когда жалеешь что работаешь с "примитивом".
        for ( int i = 0, m = 0; i != n; i++, n = m )
        {
            for ( int j = m = i + 1; j != n; j++ )
            {
                if ( a[j] != a[i] )
                {
                    if ( m != j ) a[m] = a[j];
                    m++;
                }
            }
        }


        if ( n != a.length )
        {
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ) b[i] = a[i];

            a = b;
        }

        for ( int x : a ) System.out.print( x + " " );
        System.out.println();

    }
}
