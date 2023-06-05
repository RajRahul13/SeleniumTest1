package test;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rahul";
		String StrRev="";
		for(int i=str.length()-1;i>=0;i--) {
			StrRev=StrRev + str.charAt(i);
		}
		System.out.println(StrRev);
	}

}
