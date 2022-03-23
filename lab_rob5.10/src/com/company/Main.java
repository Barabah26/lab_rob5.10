package com.company;

public class Main {

    public static void main(String[] args) {
        int f,j,k;
        j = 0;
        for(int i=1; i<=50000; i++) {
            k = i;
            f = 0;
            while(k!=0) {
                if(k%10==2) {
                    f = 1;
                    break;
                }
                k = k/10;
            }
            if(f == 0) {
                j++;
            }
        }
        System.out.println("Кількість числових комбінацій: "+j);

    }
}
