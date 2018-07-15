
public class Bubble_Sorting {
	static int i;
	static int j;
	int temp;
	static int arr[]={8,7,2,4,34,99,56,32};
	static int n=arr.length;
	
	//constructor
	public Bubble_Sorting(){
		i=0;
		j=0;
	}
	
	public Bubble_Sorting(int i, int j, int[] arr) {
		this.i = i;
		this.j = j;
		this.arr = arr;
	}
	
	//Setter=Getter methods
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	//Display Method
	public static int bubbleSort(int arr[]){
		for (i=0;i<n;i++){
			for(j=0; j<i;j++){
				if(arr[i]< arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return 0;
	}
	
	public static void displayArray(int arr[]){
		for(i=0;i<n;i++){
			System.out.print(arr[i] + ",");
		}
	}
}
