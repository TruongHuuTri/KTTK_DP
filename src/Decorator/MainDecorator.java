package Decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Employee doiTruong = new DoiTruongDecorator(new BasicEmployee("Đội trưởng"));
        doiTruong.handleRequest();

        System.out.println("\n-------------------\n");

        Employee giamDoc = new GiamDocDecorator(new BasicEmployee("Giám đốc"));
        giamDoc.handleRequest();
        
        System.out.println("\n-------------------\n");
        
        Employee nhanVienVP = new NhanVienVPDecorator( new BasicEmployee("Nhân viên VP"));
        nhanVienVP.handleRequest();
        
    }
}
