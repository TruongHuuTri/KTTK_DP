package StatePattern;

public class NhanVienVPState implements ChucVuState {

	@Override
	public void lamViec() {
		// TODO Auto-generated method stub
		System.out.println("- Pha trà");
        System.out.println("- Chuẩn bị tài liệu");
        System.out.println("- Nhập liệu");
	}

}
