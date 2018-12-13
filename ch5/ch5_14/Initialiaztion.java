class Word{
    static String s ;                       //static region
    static String sh = "dasdf";             //static region
    static {s = "this s is Initialization";}//static piece 
}
public class Initialiaztion{
    public static void main(String args[])
    {
     System.out.println("s = "+ Word.s);
     System.out.println(" sh = "+ Word.sh);
    }
} 
