package donguyennhathan.com.model;

//Đây là 1 lớp trừu tượng do có phương thức trừu tượng
public abstract class NhanVien {
	private int ma;
	private String ten;
	
	public NhanVien() {
		super();
	}
	public NhanVien(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public abstract void tinhLuong();

	
}
