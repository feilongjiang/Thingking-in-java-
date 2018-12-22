package access;
import access.connection.*;

public class ConnectionManager1{
    public static void main(String[] args)
    {
        Connection[] ca = new Connection[10];
        for(int i = 0; i < 10; i++)
        ca[i] = ConnectionManager.getConnection();
        System.out.println(ConnectionManager.getConnection());
        for(int i = 0; i < 5; i++)
            {
                Connection c = ConnectionManager.getConnection();
                System.out.println(c);
            }
    }
}
