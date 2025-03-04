package noPattern;

public class EmployeenoPattern {
	private String chucVu;

    public EmployeenoPattern(String chucVu) {
        this.chucVu = chucVu;
    }

    public void handleRequest() {
        System.out.println("Nhân viên chức vụ: " + chucVu);
        if (chucVu.equals("Đội trưởng")) {
            System.out.println("- Đi tuần tra khu vực");
            System.out.println("- Gán việc cho nhân viên");
            System.out.println("- Báo cáo tình hình");
        } else if (chucVu.equals("Giám đốc")) {
            System.out.println("- Ký duyệt hồ sơ");
            System.out.println("- Họp với đối tác");
            System.out.println("- Định hướng chiến lược");
        } else if (chucVu.equals("Nhân viên VP")) {
            System.out.println("- Pha trà");
            System.out.println("- Chuẩn bị tài liệu");
            System.out.println("- Nhập liệu");
        } else if (chucVu.equals("Nhân viên Xưởng")) {
            System.out.println("- Vận hành máy móc");
            System.out.println("- Sản xuất sản phẩm");
        } else if (chucVu.equals("Kế toán trưởng")) {
            System.out.println("- Lập báo cáo tài chính");
            System.out.println("- Kiểm tra sổ sách");
        } else {
            System.out.println("Chức vụ không hợp lệ!");
        }
    }

    public static void main(String[] args) {
        EmployeenoPattern emp = new EmployeenoPattern("Đội trưởng");
        EmployeenoPattern emp1 = new EmployeenoPattern("Nhân viên VP");
        emp.handleRequest();
        emp1.handleRequest();
    }
}
