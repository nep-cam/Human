/**
 * viết chương trình nhập vào mảng 
 * sắp xếp mảng vừa nhập theo giá trị tăng dần
 * in ra mảng sau khi sắp xếp
 */
import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        int num, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng:");
        num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Nhập vào các phần tử trong mảng:");
        for (i = 0; i < num; i++)
            array[i] = sc.nextInt();
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
        for (i = 0; i < num; i++) {
            System.out.print(array[i] + "\t");
        }

        float diemToan = 8;     //biến lưu điểm toán của sinh viên
        float diemVan = 10;     //biến lưu điểm văn của sinh viên
        float diemTB = (8 * 2 + 10) / 3;    //điểm trung bình 2 môn, môn toán hệ số 2
        int A[] = {1, 2, 3, 4}; 
    }
}