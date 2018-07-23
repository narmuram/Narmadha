import java.util.Scanner;
public class Positive {
public static void main(String[] args) {
		String s1,s2;
		Scanner s=new Scanner(System.in);
           s1=s.next();
           s2=s.next();
           int a=s1.length();
           int b=s2.length();
           char s3[]=new char[a];
           char s4[]=new char[b];
           int count=0;
           if(a!=b)
           {
        	   System.out.println("no");
           }
           for(int i=0;i<a;i++)
           {
        	s3[i]=s1.charAt(i);        
           }		
           for(int j=0;j<b;j++)
           {
        	s4[j]=s2.charAt(j);
           }
           for(int k=0;k<a;k++){
                  if(s3[k]!=s4[k]){
    	          count++;
              }
           }
           System.out.println(count);
        	  if(count==1)
        	  {
        		  System.out.println("yes");
        	  }
        	  else{
        		  System.out.println("no");
        	  }
}
}
