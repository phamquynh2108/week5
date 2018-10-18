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
public class QuaTao extends HoaQua {
    private String xuatXu;
    private long gia;

    public QuaTao(String hoaQua, int soLuong, String xuatXu,long gia) {
        super(hoaQua, soLuong);
        this.gia = gia;
        this.xuatXu = xuatXu;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }
    @Override
    public void show(){
        System.out.println(getHoaQua()+" "+getSoLuong()+" "+xuatXu+" "+gia);
    }
    public long buy(){
        return getSoLuong()*gia;
    }
    
}
