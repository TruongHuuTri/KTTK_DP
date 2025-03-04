package Decorator;

public class GiamDocDecorator extends EmployeeDecorator {
    public GiamDocDecorator(Employee employee) {
        super(employee);
    }

    public void handleRequest() {
        super.handleRequest();
        System.out.println("- Ký duyệt hồ sơ");
        System.out.println("- Họp với đối tác");
        System.out.println("- Định hướng chiến lược");
    }
}