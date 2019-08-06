package com.k003.basic;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class rectangle {
    protected double chieudai , chieurong , chuvi , dientich;
    Scanner sc = new Scanner (System.in);
    public void input(){
        do {
            System.out.println("nhap chieu dai , chieu rong: ");
            chieudai = sc.nextDouble();
            chieurong = sc.nextDouble();
        }
        while(chieudai <= chieurong);
    }
    public void setChieudai(Double CD){
        this.chieudai = CD;
    }
    public void setChieurong(Double CR){
        this.chieurong = CR;
    }
    public void setChuvi(Double CV){
        this.chuvi = CV;
    }
    public void setDientich(Double DT){
        this.dientich = DT;
    }
    public Double getChieudai(){
        return chieudai;
    }
    public Double getChieurong(){
        return chieurong;
    }
    public Double getChuvi(){
        chuvi = (chieudai + chieurong) * 2;
        return chuvi;
    }
    public Double getDientich() {
        dientich = chieudai * chieurong;
        return dientich;
    }
    public void output(){
        System.out.println("Result: ");
        System.out.println("CV = " + getChuvi());
        System.out.println("DT = " + getDientich());
    }
}
