package les14.setSort;

public class StorageClass implements Comparable<StorageClass> {
	private int num;
	private String str;
	
	
	
	public StorageClass(int num, String str) {
		this.num = num;
		this.str = str;
	}
	@Override
	public int compareTo(StorageClass sc) {
		return str.compareTo(sc.str);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "StorageClass [num=" + num + ", str=" + str + "]";
	}
	
	
}
