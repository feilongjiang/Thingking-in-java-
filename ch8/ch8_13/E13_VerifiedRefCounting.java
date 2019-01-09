package ch8_13; 
import static net.mindview.util.Print.*; 
 
class Shared {
	private int refcount = 0;
	private static int counter = 0;
	private int id = counter++;  
	public Shared() {  
		print("Creating " + this);  
		} 
	public void addRef() { 
		refcount++; 
		} 
	protected void dispose() { 
		if(--refcount == 0)  
			print("Disposing " + this);  
		} 
	protected void finalize() { 
		
			print("Error: object is not properly cleaned-up!"); 
		}   
	public String toString() { 
		return "Shared " + id; 
		}
} 
 
class Composing {  
	private Shared shared; 
	private static int counter = 0;
	private int id = counter++; 
	public Composing(Shared shared) { 
		print("Creating " + this);  
		this.shared = shared;   
		this.shared.addRef();  
		}  
	protected void dispose() { 
		print("disposing " + this); 
		//shared=null;
		shared.dispose();   
		} 
	public String toString() { 
		return "Composing " + id;
		}
	protected void finalize() { 
		
		print("Error: dsafasdf object is not properly cleaned-up!"); 
	}   
	} 
 
public class E13_VerifiedRefCounting { 
	public static void main(String[] args) { 
		Shared shared = new Shared(); 
		Composing[] composing = { new Composing(shared),
				new Composing(shared), new Composing(shared),  
				new Composing(shared), new Composing(shared) }; 
		for(Composing c : composing)    
			c.dispose(); 
		for(int i =0 ; i < composing.length; i++)
			composing[i] = null;
		shared = null;
		System.gc();     // Verify failure:   
		//new Composing(new Shared()); //
		System.gc();  
    } 
} 