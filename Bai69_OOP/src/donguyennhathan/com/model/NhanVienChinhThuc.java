package donguyennhathan.com.model;

public class NhanVienChinhThuc extends NhanVien {

	public NhanVienChinhThuc() {
		super();
	}

	public NhanVienChinhThuc(int ma, String ten) {
		super(ma, ten);
	}

	@Override
	public void tinhLuong() {
		System.out.println("Nhân viên chính thức tính lương");
	}

}
