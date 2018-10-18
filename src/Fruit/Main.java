/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fruit;

/**
 *
 * @author Pham Quynh
 */
public class Main {
    public static void main(String[] args){
        QuaTao tao = new QuaTao("tao tau", 20, "trung quoc", 20000);
        tao.show();
        CamSanh cs = new CamSanh("Son La", "binh thuong", 15, "cam sanh", 40000);
        cs.show();
        CamCaoPhong cp = new CamCaoPhong("tot", 45000, "cam cao phong", 20, "dien  bien");
        cp.show();
        
    }
}
