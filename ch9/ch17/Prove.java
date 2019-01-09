//prove fields

package ch17;

interface Interface{
    int i = 3;
}

public class Prove implements Interface{
    public static void main(String[] args)
    {
        Interface in = new Prove();
        //! i = 5;
        System.out.println(i);//here prove i is static
    }
}
