
public class BinarySearch123 {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,4,6,8,11,12,14,17};
		
		int srch=11;
		
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		
		while (li<hi) {
			
			if (a[mi] == srch)
				
			{
				System.out.println("location at"+ mi);
				//break;
			}
			else if(srch > a[mi]) {
				
				li=mi+1;
			}
			else {
				hi = mi-1;
			}
			mi =(hi+li)/2;
			
		}
		
}

}
