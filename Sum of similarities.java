abstract class Similarity
{
  public abstract int sumSimilarities(String str,int n);
}
class substring extends Similarity{
  public int sumSimilarities(String str, int n)
  {
    // Write your code here
        int Z[] = new int[n];
        int L,R,k;
        L=R=0;
        for (int i =1;i<n;++i) {
            if(i>R) {
                L = R = i;
                while(R <n && str.charAt(R-L) == str.charAt(R)) 
                    R++;
                Z[i] = R-L;
                R--;
            }else {
                k = i-L;
                if(Z[k] < R-i+1) 
                    Z[i] = Z[k];
                else {
                    L = i;
                
                while(R<n && str.charAt(R-L) == str.charAt(R)) {
                    R++;
                }
                Z[i] = R-L;
                R--;
                }
            }
        }
        int total = n;
        for (int i = 1;i<n;i++) {
            total += Z[i];
        }
        return total;
  }
}
