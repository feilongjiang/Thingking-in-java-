//: ch5_02/Init.java

public class Init{
    String s = "i love you";
    String s2;
    Init(String s1){
        s2 = s1;
    }
    public static void main(String[] args)
    {
        Init ch  = new Init("you love I");
        System.out.println(ch.s2);
        System.out.println(ch.s);
    }
    }
