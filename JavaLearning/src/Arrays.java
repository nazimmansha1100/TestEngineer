
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Array reversing!");
			
			int[] numbers = {3, 4, 1, 6, 88, 33, 21};
			
			printArray(reverse(numbers));
	
	}
	
	 public static void printArray(int[] arrray) {
     	
		 for(int i = 0; i< arrray.length; i++){
			 System.out.println(arrray[i]);
		 }
     }
	 
	 
	 public static int[] reverse(int[] list) {
		 
		 int[] result = new int[list.length];
		 
		 for(int i = 0, j= list.length-1; i<list.length; i++, j--) {
			 
			 result[j] =list[i];
		 }
		 
		 return result;
		
	 }

}
