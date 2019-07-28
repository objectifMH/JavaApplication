/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author mh
 */
public class JavaApplication {

    public static boolean isInc = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Colimasson : ");
        System.out.println("Quelle est la taille de votre tableau ?");

        Scanner sc = new Scanner(System.in);
        int taille = sc.nextInt();
        int tailleTotale = taille * taille;
        int cpt = 1;

        int abs = 0;
        int cord = 0;
        int tab[][] = new int[taille][taille];

        int limitAbs = taille - 1;
        int limitOrd = taille - 1;
        int debAbs = 0;
        int debOrd = 0;

        while (cpt < tailleTotale  ) {
            if (isInc == true) {
                while (abs < limitAbs) {
                    tab[abs][cord] = cpt;
                    System.out.println("-> " + abs + "," + cord + " : " + tab[abs][cord] + " > "+limitAbs);
                    cpt++;
                    abs++;
                    
                }
                debOrd++;
                while (cord < limitOrd) {
                    tab[abs][cord] = cpt;
                    System.out.println("v " + abs + "," + cord + " : " + tab[abs][cord] + " > "+limitOrd);
                    cpt++;
                    cord++;
                }
                limitAbs--;
                isInc = false;
            }
            if (isInc == false) {
                while (abs > debAbs) {
                    tab[abs][cord] = cpt;
                    System.out.println("<- " + abs + "," + cord + " : " + tab[abs][cord] + " > "+debAbs);
                    cpt++;
                    abs--;
                }
                limitOrd--;
                while (cord > debOrd) {
                    tab[abs][cord] = cpt;
                    System.out.println("^ " + abs + "," + cord + " : " + tab[abs][cord] + " > "+ debOrd);
                    cpt++;
                    cord--;
                }
                debAbs++;
                isInc = true;
            }

        }
        tab[abs][cord] = cpt ; 

        System.out.println("Mon Colimaçon");
        for (int i = 0; i < taille ; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(tab[j][i] + "\t");
            }
            System.out.println();
        }

    }

}
