import java.util.Scanner;


/**
 *
 * @author VIK
 */
public class GameOfPrimes {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            
            int lower=0,upper=0,n=0;
            boolean flag=false;
            try {
                 lower=Integer.parseInt(sc.nextLine().trim());
        
            } catch (Exception e) {
                flag=true;
            }
            try {
                 upper =Integer.parseInt(sc.nextLine().trim());
        
            } catch (Exception e) {
                flag=true;
            }
            try {
                 n=Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                flag=true;
            }
            if(flag)
                throw new Exception();
            if(lower>upper || lower<=0 || n<=0)
                throw new Exception();
        
        int count=0;
        int i=lower;
        for (i = lower; i <=upper; i++) {
            if(isPrime(i) && getJohn(i)==1)
            {
                count++;
               // System.out.println(count+" "+i+" "+getJohn(i));
                if(count==n)
                {    System.out.println(i);
                    break;
                }
                
            }
            
        }
        if(i>upper)
        {
            System.out.println("No number is present at this index");
        }
        }catch(Exception e)
        {
            System.out.println("Invalid Input");
        }
    }
    
    
    public static boolean isPrime(int num) {
        boolean flag = false;
        if (num < 2) {
            return flag;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return flag;
        }
        int i = 3;
        int rootn = (int) Math.sqrt(num);
        for (; i <= rootn; i += 2) {
            if (num % i == 0) {
                break;
            }

        }
        if (i > rootn) {
            flag = true;
        }
        return flag;
    }
     static int getJohn(int y)
    {
        if(y<=4)
        {
            return y;
        }
        if(y==10)
            return 1;
        String s=y+"";
        
        char[] c=s.trim().toCharArray();
        int sum=0;
        for (int i = 0; i < c.length; i++) {
            sum+=Math.pow(Integer.parseInt(c[i]+"".trim()),2);
        }
        
        
        sum= getJohn(sum);
        return sum;
        
    }
}

