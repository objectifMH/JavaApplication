/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;
import static javaapplication.JavaApplication.tab;

/**
 *
 * @author mh
 */
public class JavaApplication {

    public static boolean isInc = true;

    public static int debOrd = 0;
    public static int debAbs = 0;

    public static int cpt = 1;
    public static int tab[][] = null;

    public static int abs = 0;
    public static int limitAbs;

    public static int ord = 0;
    public static int limitOrd;

    public static int debOrd() {
        while (abs < limitAbs) {
            tab[abs][ord] = cpt;
            cpt++;
            abs++;
        }
        return debOrd++;
    }

    public static int limitAbs() {
        while (ord < limitOrd) {
            tab[abs][ord] = cpt;
            cpt++;
            ord++;
        }
        return limitAbs--;
    }

    public static int limitOrd() {
        while (abs > debAbs) {
            tab[abs][ord] = cpt;
            cpt++;
            abs--;
        }
        return limitOrd--;
    }

    public static int debAbs() {
        while (ord > debOrd) {
            tab[abs][ord] = cpt;
            cpt++;
            ord--;
        }
        return debAbs++;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Colimaçon : ");
        System.out.println("Quelle est la taille de votre tableau ?");

        Scanner sc = new Scanner(System.in);
        int taille = sc.nextInt();
        int tailleTotale = taille * taille;

        tab = new int[taille][taille];

        limitAbs = taille - 1;
        limitOrd = taille - 1;

        while (cpt < tailleTotale) {
            if (isInc == true) {
                debOrd();
                limitAbs();
                isInc = false;
            }
            if (isInc == false) {
                limitOrd();
                debAbs();
                isInc = true;
            }

        }
        tab[abs][ord] = cpt;

        System.out.println("Mon Colimaçon");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(tab[j][i] + "\t");
            }
            System.out.println();
        }

    }

}
