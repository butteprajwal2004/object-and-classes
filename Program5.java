/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class Rectangle1 {
    int a1=4,b1=5,a2=5,b2=8;
  public static void main(String[] args)
    {
           rectangle rect=new rectangle();
            System.out.println("Area of rectangle 1 is :"+rect.Area(rect.a1,rect.b1));
            System.out.println("Area of rectangle 2 is :"+rect.Area(rect.a2,rect.b2));
     }
     public int Area(int length,int breadth)
     {
               return length*breadth;   
     }
}
