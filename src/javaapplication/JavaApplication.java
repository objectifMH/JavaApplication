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

    public static int _debOrd = 0;
    public static int _debAbs = 0;

    public static int _cpt = 1;
    public static int tab[][] = null;

    public static int _abs = 0;
    public static int _limitAbs;

    public static int _ord = 0;
    public static int _limitOrd;

    public static int debOrd() {
        while (_abs < _limitAbs) {
            tab[_abs][_ord] = _cpt;
            _cpt++;
            _abs++;
        }
        return _debOrd++;
        //return 

    }

    public static int limitAbs() {
        while (_ord < _limitOrd) {
            tab[_abs][_ord] = _cpt;
            _cpt++;
            _ord++;
        }
        return _limitAbs--;
    }

    public static int limitOrd() {
        while (_abs > _debAbs) {
            tab[_abs][_ord] = _cpt;
            _cpt++;
            _abs--;
        }
        return _limitOrd--;
    }

    public static int debAbs() {
        while (_ord > _debOrd) {
            tab[_abs][_ord] = _cpt;
            _cpt++;
            _ord--;
        }
        return _debAbs++;
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

        _limitAbs = taille - 1;
        _limitOrd = taille - 1;

        while (_cpt < tailleTotale) {
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
        tab[_abs][_ord] = _cpt;

        System.out.println("Mon Colimaçon");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(tab[j][i] + "\t");
            }
            System.out.println();
        }

    }

}
