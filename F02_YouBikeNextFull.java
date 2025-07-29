/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltest;

/**
 *
 * @author jason
 */
import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            times[i] = toMinutes(sc.nextLine());
        }

        int query = toMinutes(sc.nextLine());

        int left = 0, right = n - 1;
        int result = -1;

        // Binary search for first time > query
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (result == -1) {
            System.out.println("No bike");
        } else {
            System.out.println(toHHMM(times[result]));
        }
    }

    // 將 HH:mm 轉為分鐘
    public static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    // 將分鐘轉回 HH:mm 格式
    public static String toHHMM(int minutes) {
        int h = minutes / 60;
        int m = minutes % 60;
        return String.format("%02d:%02d", h, m);
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：使用二分搜尋法在排序陣列中尋找第一個大於查詢時間的時刻，時間複雜度為 O(log n)。
 */

