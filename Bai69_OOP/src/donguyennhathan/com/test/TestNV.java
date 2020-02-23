package donguyennhathan.com.test;

import donguyennhathan.com.model.NhanVienChinhThuc;
import donguyennhathan.com.model.NhanVienThoiVu;

public class TestNV {

	public static void main(String[] args) {
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1,"tèo thẹo");
		teo.tinhLuong();
		NhanVienThoiVu ty = new NhanVienThoiVu(2,"Tý mẻ");
		ty.tinhLuong();
	}

}
