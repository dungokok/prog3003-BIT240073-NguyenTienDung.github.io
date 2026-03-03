package com.mycompany.nguyentiendung;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\n========= HỆ THỐNG BÀI TẬP - NGUYỄN TIẾN DŨNG =========");
            System.out.println("1. Bài 1: Generic Class");
            System.out.println("2. Bài 2: Generic Method");
            System.out.println("3. Bài 3: Generic Interface");
            System.out.println("4. Bài 4: ArrayList");
            System.out.println("5. Bài 5: LinkedList");
            System.out.println("6. Bài 6: HashSet");
            System.out.println("7. Bài 7: TreeSet");
            System.out.println("8. Bài 8: HashMap");
            System.out.println("9. Bài 9: TreeMap");
            System.out.println("0. Thoát");
            System.out.print("Chọn bài: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    Test_Bai_1<String> t = new Test_Bai_1<>();
                    t.set("Dũng Java");
                    System.out.println("Kết quả: " + t.get());
                    break;
                case 2:
                    Integer[] a = {1, 2, 3};
                    Bai_2.printArray(a);
                    break;
                case 3:
                    OrderedPair<String, String> p = new OrderedPair<>("Tên", "Dũng");
                    System.out.println(p.getKey() + ": " + p.getValue());
                    break;
                case 4: Bai_4.thucHien(); break;
                case 5: Bai_5.thucHien(); break;
                case 6: Bai_6.thucHien(); break;
                case 7: Bai_7.thucHien(); break;
                case 8: Bai_8.thucHien(); break;
                case 9: Bai_9.thucHien(); break;
                case 0: System.out.println("Tạm biệt!"); break;
                default: System.out.println("Chọn sai!");
            }
            if (chon != 0) {
                System.out.println("\nNhấn Enter để quay lại Menu...");
                sc.nextLine();
            }
        } while (chon != 0);
    }
}