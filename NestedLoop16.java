import java.util.*;

class Main {
    public static void main(String[] k) {
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int star = n;
        int space = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            star--;
            space += 2;

            System.out.println();
        }

        star = 1;
        space = space - 2;

        for(int i = 1; i <= n - 1; i++) {
            for(int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            
            star++;
            space = space - 2;
            
            System.out.println();
        }
    }
}
