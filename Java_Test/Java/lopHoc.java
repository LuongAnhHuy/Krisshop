package Java;

public class lopHoc {

	public static void main(String[] args) {
		student std = new student("1781510037", "Huy", true);
		if (std.layGioiTinh()) {
			System.out.println("Sinh Vien " + std.layTen() + ", giới tính nữ");
		} else {
			System.out.println("Sinh Vien " + std.layTen() + ", giới tính nam");
		}

	}

}
