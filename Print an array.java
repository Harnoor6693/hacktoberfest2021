import java.util.*;
public class Main {
   

  public static void main(String[] args) {
      // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i< n; i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i =0; i<n; i++){
                int sum =0;
                for(int j=0; j<n; j++){
                    if(i == j) continue;
                    
                    sum += arr[j];
                    
                }
                System.out.print(sum + " ");
            }
            System.out.println();
            
            
        }
        
           
  }

}
