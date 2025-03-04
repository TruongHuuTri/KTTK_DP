package StatePattern;

public class DoiTruongState implements ChucVuState {

	@Override
	public void lamViec() {
		// TODO Auto-generated method stub
		System.out.println("- Đi tuần tra khu vực");
        System.out.println("- Gán việc cho nhân viên");
        System.out.println("- Báo cáo tình hình");
	}

}
