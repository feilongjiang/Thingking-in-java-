//: the program is error
package ch7_21;

class Override{
     final  void f(){
        System.out.println("I am override");
    }
}

public class Final extends Override{
         public void f(){
        System.out.println("I am fianl");
    }
    public static void main(String [] args)
    {
        Final fi = new Final();
        fi.f();
    }
}
