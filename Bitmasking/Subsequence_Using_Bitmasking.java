package Bitmasking;

public class Subsequence_Using_Bitmasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="abc";
        printsubsequence(s);
	}
  public static void  printsubsequence(String s) {
	  int n=s.length();
	  for(int i=0;i<(1<<n);i++) {
		  Pattern(s,i);
	  }
  }
  private static void Pattern(String s,int i ) {
	  int pos=0;
	  while(i>0) {
		  if((i&1)!=0) {
			  System.out.println(s.charAt(pos));
		  }
		  i>>=1;
	  pos++;
	  }
	  System.out.println();
  }
}
