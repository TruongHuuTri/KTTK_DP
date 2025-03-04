package StrategyPattern;

public class EmployeeStrategy {
    private String chucVu;
    private WorkStrategy strategy;

    public EmployeeStrategy(String chucVu) {
        this.chucVu = chucVu;
        setStrategy(chucVu);
    }

    public void setStrategy(String chucVu) {
        if (chucVu.equals("Đội trưởng")) {
            strategy = new DoiTruongStrategy();
        } else if (chucVu.equals("Giám đốc")) {
            strategy = new GiamDocStrategy();
        } else if (chucVu.equals("Nhân viên VP")) {
            strategy = new NhanVienVPStrategy();
        }
    }

    public void handleRequest() {
        System.out.println("Nhân viên chức vụ: " + chucVu);
        if (strategy != null) {
            strategy.performWork();
        } else {
            System.out.println("Chức vụ không hợp lệ!");
        }
    }

    public static void main(String[] args) {
        EmployeeStrategy emp = new EmployeeStrategy("Giám đốc");
        emp.handleRequest();
    }
}