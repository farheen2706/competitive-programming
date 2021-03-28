import java.util.*;
public class mobius{
 int f;
 int a[] = new int[100];
    mobius()
    {
        f=0;
    }
    void primefac(int n)
    {
        int num=n;
       for(int i=2,j=0;i<n;i++)
       {
           while(num%i==0){
               a[j]=i;
               num=num/i;
               f++;
               j++;
           }
           if(num==1)
           break;
       }
    }
    boolean isRep(){
        int count=0;
        for(int i=0;i<f;i++){
            if(a[i]==a[i+1])
           count++;
        }
        if(count>0)
        return true;
        else
        return false;
    }
    int Mobius(int n)
    {
                if(isRep()==true)
        {
            System.out.print(n+"=");
            for(int i=0;i<f;i++){
                System.out.print(a[i]+"x");
            }
            System.out.println();
            System.out.println("DUPLICATE PRIME FACTORS");
            System.out.println("M("+n+") = 0");
        }
        else{
            if(n==1)
            {
                System.out.println("1=1");
                System.out.println("NO PRIME FACTORS");
                System.out.println("M(1)=1");
            }
            else
            {
                System.out.print(n+"=");
                for(int i=0;i<f;i++){
                    System.out.print(a[i]+"x");
                }
                System.out.println();
                System.out.println("DISTINCE PRIME FACTORS");
                System.out.println("M("+n+") ="+(int)Math.pow(-1,f));
            }
        }
     return 1;
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        n=in.nextInt();
        mobius ob=new mobius();
        ob.primefac(n);
        ob.Mobius(n);
    }
      
}
