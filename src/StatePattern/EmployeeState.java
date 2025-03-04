package StatePattern;

public class EmployeeState {
    private String chucVu;
    private ChucVuState state;

    public EmployeeState(String chucVu) {
        this.chucVu = chucVu;
        if (chucVu.equals("Đội trưởng")) {
            state = new DoiTruongState();
        } else if (chucVu.equals("Giám đốc")) {
            state = new GiamDocState();
        } else if (chucVu.equals("Nhân viên VP")) {
            state = new NhanVienVPState();
        }
    }

    public void handleRequest() {
        System.out.println("Nhân viên chức vụ: " + chucVu);
        if (state != null) {
            state.lamViec();
        } else {
            System.out.println("Chức vụ không được hỗ trợ!");
        }
    }

    public static void main(String[] args) {
        EmployeeState emp = new EmployeeState("Đội trưởng");
        emp.handleRequest();
    }
}
