/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainn;

/**
 *
 * @author ASUS
 */
public class Mainn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sapi inheritance = new Sapi();
        System.out.println(inheritance.makan());
        System.out.println(inheritance.berkembangbiak());
        System.out.println("==================================");
        cicak inheritance1 = new cicak();
        System.out.println(inheritance1.makan());
        System.out.println(inheritance1.berkembangbiak());
    }
    
}
