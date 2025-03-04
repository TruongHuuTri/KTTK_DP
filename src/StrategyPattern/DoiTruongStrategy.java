package StrategyPattern;

public class DoiTruongStrategy implements WorkStrategy{

	@Override
	public void performWork() {
		// TODO Auto-generated method stub
		System.out.println("- Đi tuần tra khu vực");
        System.out.println("- Gán việc cho nhân viên");
        System.out.println("- Báo cáo tình hình");
	}

}
