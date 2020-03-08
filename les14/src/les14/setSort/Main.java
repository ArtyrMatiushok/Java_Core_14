package les14.setSort;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<StorageClass> set = new HashSet<StorageClass>();
		set.add(new StorageClass(10, "Hello"));
		set.add(new StorageClass(-125, "World"));
		set.add(new StorageClass(134, "I'm ok!"));
		set.add(new StorageClass(-79, "Owwwwa"));
		set.add(new StorageClass(-90, "London is the capital of Great Britain"));
		set.add(new StorageClass(0, "m"));
		set.add(new StorageClass(1, "Hello"));
		set.add(new StorageClass(10, "World"));
		set.add(new StorageClass(10, "Hello"));
		set.add(new StorageClass(-79, "Owwwwa"));
		System.out.println(set);
		SortedSet<StorageClass> sort1 = new TreeSet<StorageClass>();
		sort1.addAll(set);
		System.out.println(sort1);
		SortedSet<StorageClass> sort2 = new TreeSet<StorageClass>(new StorageClassComparator());
		sort2.addAll(set);
		System.out.println(sort2);
	}

}
