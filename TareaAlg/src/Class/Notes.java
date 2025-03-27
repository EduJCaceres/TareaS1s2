/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ASUS
 */
public class Notes {
     private double note1;
    private double note2;
    private double note3;
    private double note4;

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }

    public double getNote4() {
        return note4;
    }

    public void setNote4(double note4) {
        this.note4 = note4;
    }

    @Override
    public String toString() {
        return "Notes{" + "note1=" + note1 + ", note2=" + note2 + ", note3=" + note3 + ", note4=" + note4 + '}';
    }
}
