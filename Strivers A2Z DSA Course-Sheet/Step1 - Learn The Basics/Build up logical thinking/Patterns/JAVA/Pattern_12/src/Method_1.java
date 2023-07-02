//{ Driver Code Starts
import java.io.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends

class Solution {

    void printTriangle(int n) {
        int right = (2 * n) - 1;
        int m = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= right; j++){
                if(j == 0){
                    for(int p = 0; p < i; p++){
                        System.out.print(m + " ");
                        m++;
                    }
                    m--;
                    j = m - 1;
                }else if(j == right){
                    for(int q = right; q < (2 * n); q++){
                        System.out.print(m + " ");
                        m--;
                    }
                }else{
                    System.out.print("  ");
                }


            }
            right--;
            m = 1;
            System.out.println("");
        }
    }
}