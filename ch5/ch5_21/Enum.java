package ch5_21;

enum Penny{
    ONE,TWO,FIVE
    }
public class Enum{
    public static void main(String args[])
    {
        for(Penny p : Penny.values())
            System.out.println(p+",ordianl " + p.ordinal());
    }
    }
