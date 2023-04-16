import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int p = 0; p < n; p++) {
            String s = sc.nextLine();
            String[] ar = s.split(" ");
            ArrayList<String> arr = new ArrayList<>();
            ArrayList<Integer> hi = new ArrayList<>();
            int i = 0;
            for (String x : ar) {
                arr.add(x);
                hi.add(arr.get(i).length());
                i++;
            }
            int temp = 0;
            for (i = 0; i < hi.size(); i++) {
                for (int j = i + 1; j < hi.size(); j++) {
                    if (hi.get(i) < hi.get(j)) {
                        temp = hi.get(j);
                        hi.set(j, hi.get(i));
                        hi.set(i, temp);
                    }
                }
            }
            boolean firstWord = false;
            for (i = 0; i < hi.size(); i++) {
                for (int j = 0; j < hi.size(); j++) {
                    if (hi.get(i) == arr.get(j).length()) {
                        if (firstWord) {
                            System.out.print(" ");
                        } else {
                            firstWord = true;
                        }
                        System.out.print(arr.get(j));
                        arr.set(j, "Pneumonoultramicroscopicsilicovolcanoconiosis");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
