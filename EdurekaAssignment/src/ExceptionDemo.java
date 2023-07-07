
class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Code starts");
		try {
		int arr []= {1,2,3,4,5};
		for(int i=0;i<=arr.length+1;i++) {
			System.out.println("element at position "+i+"is :"+arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handled is :"+e);
		}
		System.out.println("code ends");	

	}

}
