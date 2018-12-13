//: ch4_10/Vampire.java
/** @version 1.0
  * @author  feilong
  */

/*吸血鬼数算法，假定吸血鬼数为n，x,y为尖牙
  *一.给定所求吸血归属的范围
  *二.确定是否时吸血鬼数
  *1.if (x*y)%9!=（x+y)%9,不是吸血归属
  *2.if 是吸血归属
  *3.取出n x y 三个的每位数字
  *4.if n 的每位数字 全部是由x y 的每位数字组成 ，确定时吸血鬼数
  */

public class Vampire
{
    public static void main(String[] args)
    {
        vampire();
    }
    static void vampire()
    {
        int x=0;
        int y=0;
        int count = 0;
        int [] num =  new int[4];
        int [] vam =  new int[4];
        for(x=10;x<=100;x++)
            for(y=10;y<=99;y++)
            {
                if((x*y)%9!=(x+y)%9)
                    continue;
                count = 0;
                int product = x*y;
                vam[0] = product/1000; //千位
                vam[1] = (product%1000)/100;//百位
                vam[2] = (product%1000%100)/10;   //十位
                vam[3] = product%1000%100%10;   //个位
                num[0] = x/10;//十位
                num[1] = x%10;//个位
                num[2] = y/10;
                num[3] = y%10;
                for(int i = 0;i<4;i++)
                    for(int j = 0;j<4;j++)
                        if(vam[i]==num[j])
                        {
                            count++;
                            vam[i]=-1;  
                            num[j]=-2; //防止重复计算
                       
                           if(count == 4)
                             System.out.println("vampire = "+product+",x = "+ x + ",y = "+ y);
                       }
            }
    }
                
}
