
import java.io.*;
public class triangle {
    public static void main(String[] args)throws IOException {
     int a,b,c,h,perimeter;
     double area;
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Area of a triangle"); 
     System.out.println("enter the value of a");
     a=Integer.parseInt(br.readLine());
     System.out.println("Enter the value of b");
     b=Integer.parseInt(br.readLine());
     System.out.println("Enter the value of c");
     c=Integer.parseInt(br.readLine());
     System.out.println("Enter the value of h");
     h=Integer.parseInt(br.readLine());
     area = 0.5*b*h;
     System.out.println("Area= "+area);
     perimeter = a+b+c;
     System.out.println("perimeter: "+perimeter);
    }
}
