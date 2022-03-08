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
public class Sapi extends Hewan{
    @Override
    public String makan (){
        System.out.println(super.makan());
        return "sapi makan rumput" ;
    }
    @Override
    public String berkembangbiak(){
        System.out.println(super.berkembangbiak());
        return "sapi berkembangbiak dengan cara beranak ";
    }
}
