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
        for(int i = 1; i <= n; i++){
            for(int p = n; p >= i; p--){
                System.out.print("*");
            }
            for(int q = 1; q < i; q++){
                System.out.print("  ");
            }
            for(int r = n; r >= i; r--){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i <= n; i++){
            for(int p = 0; p < i; p++){
                System.out.print("*");
            }
            for(int q = n - 1; q >= i; q--){
                System.out.print("  ");
            }
            for(int r = 0; r < i; r++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}