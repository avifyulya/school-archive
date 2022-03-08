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
public class cicak extends Hewan {
    @Override
    public String makan (){
        System.out.println(super.makan());
        return "Cicak makan laron" ;
    }
    @Override
    public String berkembangbiak(){
        System.out.println(super.berkembangbiak());
        return "Cicak berkembangbiak dengan cara bertelur";
    }
}
