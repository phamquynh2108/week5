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
public class QuaCam extends HoaQua{
    private long gia;

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public QuaCam(long gia, String hoaQua, int soLuong) {
        super(hoaQua, soLuong);
        this.gia = gia;
    }
    
    
    
}
