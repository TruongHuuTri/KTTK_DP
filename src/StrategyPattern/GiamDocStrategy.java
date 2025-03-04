package StrategyPattern;

public class GiamDocStrategy implements WorkStrategy{

	@Override
	public void performWork() {
		// TODO Auto-generated method stub
		System.out.println("- Ký duyệt hồ sơ");
        System.out.println("- Họp với đối tác");
        System.out.println("- Định hướng chiến lược");
	}

}
