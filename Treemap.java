package Task12;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


	public class Treemap {

		public static void main(String[] args) {
	TreeMap<Integer,String> tree=new TreeMap<>();
	tree.put(101, "Joe");
	tree.put(102, "Amali");
	tree.put(103, "John");
	tree.put(104, "Gabriel");
	tree.put(105, "Ethan");
	tree.put(106, "Jai");
	tree.put(107, "Mayuri");
	tree.put(113, "Anisha");
	tree.put(114, "Inian");
	tree.put(110, "Mathew");
	tree.put(111, "Suthi");
	tree.put(112, "vincy");

	TreeSet<String> namesSet = new TreeSet<>(tree.values());
	System.out.println("Employee names in Alphabetical order");
	for(String name:namesSet) {
		System.out.println(name);
	}
	}
	}


