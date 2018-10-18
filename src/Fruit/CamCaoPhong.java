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
public class CamCaoPhong extends QuaCam{
    private String chatLuong;
    public String noiTrong;
    public String getChatLuong() {
        return chatLuong;
    }

    public void setChatLuong(String chatLuong) {
        this.chatLuong = chatLuong;
    }

    public CamCaoPhong(String chatLuong, long gia, String hoaQua, int soLuong, String noiTrong) {
        super(gia, hoaQua, soLuong);
        this.chatLuong = chatLuong;
        this.noiTrong =  noiTrong;
    }
    @Override
    public void show(){
        System.out.println(noiTrong+" "+getHoaQua()+" "+getChatLuong()+" "+getSoLuong()+" "+getGia());
    }
   
    
}
