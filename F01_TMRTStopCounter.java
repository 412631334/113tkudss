/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltest;

import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 站數
        String[] stations = new String[n];
        for (int i = 0; i < n; i++) {
            stations[i] = sc.next();  // 站代碼陣列
        }

        String start = sc.next();  // 起始站
        String end = sc.next();    // 終點站

        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) {
                startIndex = i;
            }
            if (stations[i].equals(end)) {
                endIndex = i;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(startIndex - endIndex) + 1);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：需要線性掃描陣列 stations 找到起訖站的索引，共花費 O(n) 時間。
 */

