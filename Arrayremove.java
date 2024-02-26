package Task12;
import java.util.ArrayList;

public class Arrayremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        // Display the elements before removal
	        System.out.println("Elements before removal:");
	        System.out.println(arrayList);

	        // Remove all elements from the ArrayList
	        arrayList.clear();

	        // Display the elements after removal
	        System.out.println("Elements after removal:");
	        System.out.println(arrayList);
	    }


}
