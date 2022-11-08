
public class BBs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,5,3,4,56};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int tempvar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempvar;
				}
			}
		}
		for(int elem:a) 
		{
			System.out.println(elem+ " ");
		}
			
		}

}
