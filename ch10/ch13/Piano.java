package ch13;

interface Musical{
    void voice();
}

public class Piano{
    public Musical method()
    {
        return new Musical(){
            public void voice()
            {
                System.out.println("voice good");
            }
        };
    }

    public static void main(String[] args)
    {
        Musical p = new Piano().method();
        p.voice();
    }
}
