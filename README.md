# SelectSort
java select sort
public class SelectSort {
	static int arr0[]= {6,5,7,0,3,2,1};
	public void select(int arr[]) {
		int temp;
		for(int i=0;i<arr0.length-1;i++) { 
			int min=arr0[i]; 
			int minIndex=i;
			for(int j=i;j<arr0.length-1;j++) {
				if(arr0[minIndex]>arr0[j+1]) { //这里的arr0也可以用来 min 来替换.
					min= arr0[j+1];
					minIndex= j+1;
				}
/**
				System.out.print(i); //这里是为了让自己在出了问题时可以有办法找到问题出在哪里.之前我用的
				System.out.print(j);//式子是 if(arr0[minIndex]>arr0[j+1]) 这一句就成了两两比较,失去了
				System.out.println("min="+min);//实际的意义,但是当时自己一直找不到错误出在了哪里.就用了这
                                //三句话在j循环外面找,终于找到了自己出错的地方.
*/
			}
			temp= arr0[i];
			arr0[i]= arr0[minIndex];
			arr0[minIndex]= temp;
		}
	}
	
	public static void main(String[] args) {
		SelectSort a=new SelectSort();
		a.select(arr0);		
		for(int i=0;i<arr0.length;i++) {
			System.out.print("  "+arr0[i]);
		}

	}

}
