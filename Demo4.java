package day0906;

public class Demo4 {
	static int arr0[]= {6,5,7,0,3,2,1};
	public void select(int arr[]) {
		int temp;
		for(int i=0;i<arr0.length-1;i++) {
			int min=arr0[i];
			int minIndex=i;
			for(int j=i;j<arr0.length-1;j++) {
				if(arr0[minIndex]>arr0[j+1]) {
					min= arr0[j+1];
					minIndex= j+1;
				}
				System.out.print(i);
				System.out.print(j);
				System.out.println("min="+min);
			}
			temp= arr0[i];
			arr0[i]= arr0[minIndex];
			arr0[minIndex]= temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 a=new Demo4();
		a.select(arr0);		
		for(int i=0;i<arr0.length;i++) {
			System.out.print("  "+arr0[i]);
		}

	}

}
