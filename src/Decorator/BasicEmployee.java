package Decorator;

public class BasicEmployee implements Employee {
    private String chucVu;

    public BasicEmployee(String chucVu) {
        this.chucVu = chucVu;
    }

    public void handleRequest() {
        System.out.println("Nhân viên chức vụ: " + chucVu);
    }
}
