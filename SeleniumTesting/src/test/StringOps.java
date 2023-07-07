package test;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOps1();
	}
	public static void StringOps1() {
		String str1="  rahul rai";
		System.out.println(str1.concat(" raj"));
		System.out.println(str1.charAt(3));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1.trim());
		System.out.println(str1.getBytes());
		System.out.println(str1.contains("rai"));
		System.out.println(str1);
	}

}
