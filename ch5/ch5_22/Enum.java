package ch5_22;



public class  Enum {
    public static void main(String args[])
    {
        for(Penny p : Penny.values())
        {
            switch (p)
            {
                case ONE: System.out.println(p+ " cheap " + p.ordinal());
                          break;
                case TWO: System.out.println(p + " middle " + p.ordinal());
                          break;
                case FIVE: System.out.println(p + " good " + p.ordinal());
                           break;
                default: System.out.println("not");
            }
        }
    }
    }
