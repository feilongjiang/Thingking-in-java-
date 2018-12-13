//: ch5_08/This.java

class Test{
    void ts(){
        System.out.println("this is a test");
    }
    void test(){
        ts();
        this.ts();
    }
    }
public class This{
    public static void main(String[] args)
    {
        Test ts = new Test();
        ts.test();
    }
    }
