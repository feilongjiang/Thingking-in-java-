// here return array

package access.connection;

public class Connection{
    Connection(){}
    private static int counter = 0;
    private int id = counter++ ;
    public  String toString(){
        return "connection" + id;
    }
}
