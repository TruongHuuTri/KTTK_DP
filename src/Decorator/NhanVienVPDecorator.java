package Decorator;

public class NhanVienVPDecorator extends EmployeeDecorator{

	public NhanVienVPDecorator(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	public void handleRequest() {
		super.handleRequest();
		System.out.println("- Pha trà");
        System.out.println("- Chuẩn bị tài liệu");
        System.out.println("- Nhập liệu");
	}
}
