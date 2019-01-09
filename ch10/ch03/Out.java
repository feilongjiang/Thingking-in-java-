package ch03;

public class Out{
    private String s;
    public Out(String s) { this.s = s; }
    private class Inner
    {
        public String toString(){ return s;}
    }
    public Inner getinner() { return new Inner();}
    public static void main(String[] args)
    {
        Out out = new Out("Instance");
        Out.Inner oi = out.getinner();
        System.out.println(oi);
    }
}
