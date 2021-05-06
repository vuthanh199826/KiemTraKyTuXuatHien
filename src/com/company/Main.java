package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi vao day");
        String str = sc.nextLine();
        System.out.println("nhap ky tu muon kiem tra vao day");
        char x ;
        x = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==x){
                count++;
            }
        }
        System.out.println("co tong cong "+count+ " lan ky tu " + x +" xuat hien");
    }
}
