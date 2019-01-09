package ch10;

interface Musical{
    void voice();
}

public class Piano{
    public Musical method(boolean b)
    {
        if(b)
        {
        class Shout implements Musical{
            public void voice()
            {
                System.out.println("voice good");
            }
        }
        return new Shout();
        }

        return null;
    }

    public static void main(String[] args)
    {
        Musical p = new Piano().method(true);
        p.voice();
    }
}
