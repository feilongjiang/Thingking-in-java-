//: ch5_09/Constructor.java

package ch5_09;
public class Constructor{
    Constructor(String s)
    {
        System.out.println("this is first constructor" + s);
    }
    Constructor(){
        this(" am fei long");
    }
    public static void main(String[] args)
    {
      Constructor a =  new Constructor();
    }
    }
