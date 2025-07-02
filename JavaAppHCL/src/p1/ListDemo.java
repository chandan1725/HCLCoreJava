package p1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	List<Integer> list = new ArrayList<>();
	
	public ListDemo() {
		list.add(15);
		list.add(135);
		list.add(215);
		list.add(25);
		list.add(28);
		list.add(34);
		list.add(30);
		
	}
	
	public void insertElement(int element)
	{
		list.add(element);
	}
	
	public List<Integer> getElementsByRange(int r1,int r2)
	{
		List<Integer> sublist = new ArrayList<>();
		
		for (Integer element : list) {
			if(element>=r1 && element<=r2)
			{
				sublist.add(element);
			}
			
		}
		return sublist;
	}
	
	public int searchElement(int searchItem)
	{
		for (Integer element : list) {
			if(element == searchItem)
			{
				return element;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		
		ListDemo app = new ListDemo();
		app.insertElement(47);
		app.insertElement(457);
		app.insertElement(147);
		app.insertElement(27);
		
		int elementFromList = app.searchElement(47);
		if(elementFromList !=0)
		System.out.println("Element "+elementFromList);
		else System.out.println("Element Not in the list");
		
		// -------------------------------------
		
		
		List<Integer> subList = app.getElementsByRange(20, 35);
		subList.stream().forEach((x)->System.out.println(x));
		
		
	}
	
}//end class














