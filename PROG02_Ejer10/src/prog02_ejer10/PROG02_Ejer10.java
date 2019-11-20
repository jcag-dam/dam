/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog02_ejer10;

/**
 *
 * @author Alberto Méndez Batista
 */
public class PROG02_Ejer10 {

    public static void main(String[] args) {
        
        System.out.println("------- Conversiones entre enteros y coma flotante -------");
        
        float x = 4.5f;
        float y = 3.0f;
        int i = 2;
        int j;
        j = (int) (i * x);
        double dx = 2.0;
        double dz;
        dz = (double) (dx * y);
        
        System.out.println("Producto de int por float: j= i*x = "+j);
        System.out.println("Producto de float por double: dz=dx * y = "+dz);
        
        System.out.println("------- Operaciones con byte -------");
        
        byte bx = 5;
        byte by = 2;
        byte bz;
        bz = (byte) (bx - by);
        
        System.out.println("byte: "+bx+" - "+by+" = "+bz);
        
        bx = (byte) -128;
        by = (byte) 1;
        bz = (byte) (bx - by);
        
        System.out.println("byte "+bx+" - "+by+" = "+bz);
        
        int numeroEntero;
        numeroEntero = (int) (bx - by);
        
        System.out.println("(int)("+bx+" - "+by+" ) = "+numeroEntero);
        
        System.out.println("------- Operaciones con short -------");
        
        short sx = 5;
        short sy = 2;
        short sz;
        sz = (short) (sx - sy);
        
        System.out.println("short: "+sx+" - "+sy+" = "+sz);
        
        sx = (short) 32767;
        sy = (short) 1;
        sz = (short) (sx + sy);
        
        System.out.println("short: "+sx+" + "+sy+" = "+sz);
        
        System.out.println("------- Operaciones con char -------");
        
        char cx = '\u000F';
        char cy = '\u0001';
        int z;
        z = (int) (cx - cy);
        
        System.out.println("char: "+cx+" - "+cy+" = "+z);
        
        z = (int) (cx - 1);
        
        System.out.println("char: "+cx+" - 1 = "+z);
        
    }
    
}
