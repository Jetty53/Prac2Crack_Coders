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
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int j = n - i; j >= 1; j--){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i <= (n - 1); i++){
            for(int j = n - i; j > 0; j--){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = n - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}