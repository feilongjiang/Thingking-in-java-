//: ch5_16/StringInit.java

public class StringInit{
    public static void main(String[] args)
    {
        String [] s = new String[4];
        s[0] = " I ";
        s[1] = " love ";
        s[2] = " my ";
        s[3] = " wife ";
        for(String sh :s)
        {
            System.out.print(sh);
        }
        System.out.println("");
    }
    }
