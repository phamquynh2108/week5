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
public class HoaQua {
    private String hoaQua;
    private int soLuong;

    public String getHoaQua() {
        return hoaQua;
    }

    public void setHoaQua(String hoaQua) {
        this.hoaQua = hoaQua;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public HoaQua(String hoaQua, int soLuong) {
        this.hoaQua = hoaQua;
        this.soLuong= soLuong;
    }
    public void show(){
        System.out.println(getHoaQua()+" "+getSoLuong());
    }
}
