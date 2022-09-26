public class Human {
    private String hoTen;
    private int tuoi;
    private int gioiTinh;
    private String diaChi;

    public Human(String string, int i, int fEMALE, String string2) {
    }

    public void Human(String name, int age, int gender, String address) {
        this.hoTen = name;
        this.tuoi = age;
        this.gioiTinh = gender;
        this.diaChi = address;
    }

    public void walk(){
        System.out.println("i'm walking");
    }    

    public void eat(){
        System.out.println("i'm eating");
    }
}