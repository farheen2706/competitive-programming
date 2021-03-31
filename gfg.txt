Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr

*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*---*-*
Solution is written in java

import java.util.*;
import java.lang.*;
import java.io.*;



class GFG {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test>=0){
		    String s=sc.next();
		    String sd[]=s.split("\\.");
		   
		    for(int i=sd.length-1;i>=0;i--){
		        if(i==0){
		            System.out.print(sd[i]);
		        }
		        else
		        System.out.print(sd[i]+".");
		    }
		    System.out.println();
		    
		    
		    test--;
		}
	}
}
