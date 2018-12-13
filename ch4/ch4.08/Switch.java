//: ch4.08/Switch.java


public class Switch{
    public static void main(String[] args){
        for(int i = 0;i<10;i++)
        {
            switch(i)
            {
                case 1:System.out.println("i value is "+ i);
                case 2:System.out.println("i value is "+ i);
                default:System.out.println("other i I would't show");break;
            }
        }
    }
}
