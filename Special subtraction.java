import java.util.Scanner;

public class MyArray
{  
    static int[] arr = new int[5];
 
    
  public void input(){
    Scanner sc = new Scanner(System.in);
        for(int i =0; i <5; i++){
            arr[i] = sc.nextInt();     
        }
  }
   public void max()
  {    
        int max = arr[0];
    for(int i: arr){
            if(max < i){
                max = i;
            }
        }
        System.out.println(max);
  }
  public void min()
  {  
        int min = arr[0];
        for(int i: arr){
            if(min > i)
                min = i;
        }
        System.out.println(min);
    
  }
  public void subfn() throws Exception
  {  
        int sub = arr[0];
        for(int i =0; i<4; i++){
      sub = sub -arr[i+1];
        }
        System.out.println(sub);
        if(sub >=0){
            throw new Exception("Subtract is greater than equal to Zero");
        }
        else{
            throw new Exception("Subtract is less than Zero");
        }
    
  }
}
