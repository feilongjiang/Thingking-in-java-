//: object/Fibonacci.java
public class Fibonacci{
  static int fb(int n){
     if(n==0||n==1)
          return 1;
      else
          return fb(n-1)+fb(n-2);
  }

        public static void main(String[] args){
            int n = Integer.parseInt(args[0]);
            if(n<0)
            {
                System.out.println("number can't small zero");
                return ;
            }
            for(int i =0;i<=n;i++){
                System.out.println(fb(i));
            }

        }
}

