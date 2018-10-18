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
public class CamSanh extends QuaCam {
    private String xuatXu;
    private String chatLuong;

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getChatLuong() {
        return chatLuong;
    }

    public void setChatLuong(String chatLuong) {
        this.chatLuong = chatLuong;
    }

    public CamSanh(String xuatXu, String chatLuong, long gia, String hoaQua, int soLuong) {
        super(gia, hoaQua, soLuong);
        this.xuatXu = xuatXu;
        this.chatLuong = chatLuong;
    }
    @Override
    public void show(){
        System.out.println(getXuatXu()+" "+getChatLuong()+" "+getSoLuong()+" "+getGia());
    }
    
}
