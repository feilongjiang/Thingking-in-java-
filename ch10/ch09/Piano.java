package ch09;

interface Musical{
    void voice();
}

public class Piano{
    public Musical method()
    {
        class Shout implements Musical{
            public void voice()
            {
                System.out.println("voice good");
            }
        }
        return new Shout();
    }

    public static void main(String[] args)
    {
        Musical p = new Piano().method();
        p.voice();
    }
}
