package ch13;

interface Interface1{
    void ifc();
}
interface Interface2 extends Interface1{
    void ifc();
}
interface Interface3 extends Interface1{
    void ifc();
}

interface Interface4 extends Interface2 , Interface3
{
}
public class Interface implements Interface4
{
    public void ifc(){
        System.out.println("Iam ifc");
    }
    public void if1(){

    }
    public void if2(){}
    public void if3(){

    }
    public static void main(String[] args)
    {
        Interface2 jf = new Interface();
        jf.ifc();
    }
}
