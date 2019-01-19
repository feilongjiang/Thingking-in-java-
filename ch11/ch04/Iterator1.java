package ch04;
import java.util.*;
class Generate{
    Map<Integer,String> map = new HashMap<Integer, String>();
    {
        map.put(1,"mother");
        map.put(2,"wife");
        map.put(3,"father");
    }
    public String next()
    {
        Random rand = new Random();
        int i = rand.nextInt(2) + 1; 
        return map.get(i);
    }
}

public class Iterator1{
    public static void main(String[] args)
    {
        Generate g = new Generate();
        Collection<String> cll = new ArrayList<String>();
        Collection<String> cll1 = new LinkedList<String>();
        Collection<String> cll2 = new HashSet<String>();
        Collection<String> cll3 = new LinkedHashSet<String>();
        Collection<String> cll4 = new TreeSet<String>();
        for( int i = 0; i < 10; i++)
        {
        	cll.add(g.next());
        	cll1.add(g.next());
        	cll2.add(g.next());
        	cll3.add(g.next());
        	cll4.add(g.next());
        }
        Iterator<String> iterator = cll.iterator();
        Iterator<String> iterator1 = cll1.iterator();
        Iterator<String> iterator2 = cll2.iterator();
        Iterator<String> iterator3 = cll3.iterator();
        Iterator<String> iterator4 = cll4.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        while(iterator1.hasNext())
            System.out.print(iterator1.next() + " ");
        System.out.println();
        while(iterator2.hasNext())
            System.out.print(iterator2.next() + " ");
        System.out.println();
        while(iterator3.hasNext())
            System.out.print(iterator3.next() + " ");
        System.out.println();
        while(iterator4.hasNext())
            System.out.print(iterator4.next() + " ");
        
    }
}
