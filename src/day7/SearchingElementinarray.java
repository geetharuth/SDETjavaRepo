package day7;

public class SearchingElementinarray {

	public static void main(String[] args) {
		//search for an element in array(linear search)
		int a[]= {10,20,30,40,50};
		int search_element=30;
		boolean status=false; //false-not found true-found
			/*	for(int i=0;i<a.length;i++)
				{
					if(a[i]==search_element)
					{
						System.out.println("element found");
						status=true;
						break;
					}
					if(status=false)
					{
						System.out.println("element is not found");
					}
				}*/
for(int x:a)
{
	if(x==search_element)
	{
		System.out.println("element found");
		status=true;
		break;
	}
	if(status=false)
	{
		System.out.println("element is not found");
	}
}
	}

}
