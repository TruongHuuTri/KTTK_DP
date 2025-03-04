package Decorator;

public class DoiTruongDecorator extends EmployeeDecorator {
    public DoiTruongDecorator(Employee employee) {
        super(employee);
    }

    public void handleRequest() {
        super.handleRequest();
        System.out.println("- Đi tuần tra khu vực");
        System.out.println("- Gán việc cho nhân viên");
        System.out.println("- Báo cáo tình hình");
    }
}
