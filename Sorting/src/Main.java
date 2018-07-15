
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={8,7,2,4,34,99,56,32};
		
		//Not need to create object when we have 'static' in methods
		System.out.println("To display Bubble Sort in Ascending Order");
		System.out.println("Before Sorting:");
		Bubble_Sorting.displayArray(arr);
		System.out.println(" ");
		System.out.println("After Sorting");
		Bubble_Sorting.bubbleSort(arr);
		Bubble_Sorting.displayArray(arr);
		}
}
