import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = scanner.nextInt();
        }
       
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean result = false;
        for ( int i = 0; i < s-1; i++) {
            if( ((arr[i]==m) && (arr[i+1]==n))) {
                result = true;
                }
            else if( ((arr[i]==n) && (arr[i+1]==m)) ){
                result = true;
                }
            }
        System.out.print(result);
    }
}
