/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PA3;

/**
 *
 * @author user
 */
 import java.util.Scanner;
    public class umur{
    public static void main(String[] args){
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println (" Menghasilkan output menggunakan struktur kawalan pilihan dengan pengaturcaraan JAVA ");
        System.out.println (" _____________________________________ ");
        
        System.out.println ("                                         ^");
        System.out.print (" Masukkan umur anda : ");
        double umur = input.nextDouble();
        
        
        if (umur <= 45)
            System.out.println (" Ucapan =  Anda masih muda dan cantik ");
        
        else
            System.out.println (" Ucapan = Anda sudah tua dan perlukan rehat ");
        
        
        System.out.println (" _____________________________________ ");
        
        
        
        
        
        
    
    }
    }

