package Java;

public class student {
	private String MSSV;
	private String ten;
	private boolean gioiTinh;
//	boolean gioiTinhNam = true;
//	boolean gioiTinhNu = false;
	
	// Hàm khởi tạo đối tượng
	public student(String MSSV, String ten, boolean gioiTinh) {
		this.MSSV = MSSV;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
//		this.gioiTinh = gioiTinhNam;
//		this.gioiTinh = gioiTinhNu;
	}
	
	// Các hàm get để lấy giá trị thuộc tính của đối tượng
	public String layMSSV () {
		return this.MSSV;
	}
	
	public String layTen () {
		return this.ten;
	}
	
	public boolean layGioiTinh() {
		return this.gioiTinh;
	}
	
	// Các hàm set để thiết lập giá trị thuộc tính của đối tượng
	
	public void datMSSV (String MSSV) {
		this.MSSV = MSSV;
	}
	
	public void datTen (String ten) {
		this.ten = ten;
	}
	
	public void datGioiTinh (boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	

}
