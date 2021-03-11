package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Scrie un program care transforma un numar de minute in ani si zile 1an=365zile=525600, 1 zi=1440minute(24*60)


/*      Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti numarul total de minute: ");
        int min=scan.nextInt();
        int ani=0;
        int zile=0;
        while(min>=1440)
        {
            if(min>=525600){
            ani=ani+1;
            min=min-525600;
            }
            else
                if(min>=1440) {
                    zile = zile + 1;
                    min = min - 1440;
                }

        }
        System.out.println("Numarul de minute introdus reprezinta "+ ani+" an(i) si "+zile+" zile ");
*/
        int zi= 1440;
        int an= 525600;
        Scanner s=new Scanner(System.in);
        System.out.println("introduceti minutele  pt a afla anii: ");
        int minute=s.nextInt();

        zi=(minute%an)/zi;

        an=minute/an;


        System.out.println("Numarul de minute introdus:"+minute+" reprezinta "+ an+" an(i) si "+zi+" zile ");
    }
}
