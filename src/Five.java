public class Five {
    public static void main(String[] args) {
        int n = 0;
        while(n < 5) {
            System.out.println(n + " hamsters");
            n = n + 1;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 3) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        }
    }

