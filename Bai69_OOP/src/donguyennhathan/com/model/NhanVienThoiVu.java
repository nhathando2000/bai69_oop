package donguyennhathan.com.model;

public class NhanVienThoiVu extends NhanVien {

	public NhanVienThoiVu() {
		super();
	}

	public NhanVienThoiVu(int ma, String ten) {
		super(ma, ten);
	}

	@Override
	public void tinhLuong() {
		System.out.println("Nhân viên thời vụ tính lương");
	}

}
