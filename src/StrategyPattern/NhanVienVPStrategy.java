package StrategyPattern;

public class NhanVienVPStrategy implements WorkStrategy {

	@Override
	public void performWork() {
		// TODO Auto-generated method stub
		System.out.println("- Pha trà");
        System.out.println("- Chuẩn bị tài liệu");
        System.out.println("- Nhập liệu");
	}

}
