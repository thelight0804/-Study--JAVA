/*
Date : 21.10.18
Title : 4장 객체의 행동_7주차 강의 1
Project : Properties
 */
package cse.oop2.ch04.properties;

class ExProperties{
    int i;
    float f;
    char [] c;
    boolean b;

    public int getI() { return i; } //int
    public void setI(int i) {  this.i = i; }

    public float getF() {  return f; } //float
    public void setF(float f) {  this.f = f; }
    
    public char[] getC() {  return c; } //char [] (배열)
    public void setC(char[] c) {  this.c = c;  }

    public boolean isB() {  return b;  } //boolean
    public void setB(boolean b) { this.b = b; } //bool의 get은 is이다
}

public class PropertiesMain {
    public static void main(String[] args) {
        
    }
}
