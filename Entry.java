public class Entry {
	public static void main(String[] args) {
		Point p1 = new Point(4.2, 4.4);
		Point p2 = new Point(6.7, 5.5);
		// p2 được lấy ra từ đối tượng distane có thuộc tính point
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(2.34, 7.8));
	}
}
