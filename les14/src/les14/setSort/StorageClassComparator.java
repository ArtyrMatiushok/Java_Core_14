package les14.setSort;

import java.util.Comparator;

public class StorageClassComparator implements Comparator<StorageClass> {

	@Override
	public int compare(StorageClass o1, StorageClass o2) {
		return (o1.getNum() > o2.getNum() ? 1 : (o1.getNum() < o2.getNum() ? -1 : 0));
	}

}
