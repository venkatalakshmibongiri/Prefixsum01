import java.util.*;
public class 
{
 static int n;
 static int arr[]=new int[n];
 static int prefix[]=new int[n];
 public static int sumrange(int l,int r)
 {
  prefix[0]=arr[0];
  for(int i=1;i<n;i++)
  {
   prefix[i]=prefix[i-1]+arr[i];
  }
  if(l==0)
  {
   return prefix[r];
  }
  else
  {
   return prefix[r]-prefix[l-1];
  }
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  n=sc.nextInt();
  while(t>0)
  {
   for(int j=0;j<n;j++)
   {
    arr[j]=sc.nextInt();
   }
   int l=sc.nextInt();
   int r=sc.nextInt();
   sumrange(l,r);
  }
  t--;
}
}

Output____________________________________________________________________
3
10
1 2 3 4 5 6 7 8 9 0
0
2
6
3
8
39
5
9
30