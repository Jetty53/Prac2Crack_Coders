//{ Driver Code Starts
import java.io.*;

class Main_Method_1 {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printDiamond(n);
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {

    void printDiamond(int n) {
        int p = n - 1;
        for(int i = 1; i < n + 1; i++){
            for(int a = 0; a < p; a++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("");
            p--;
        }
        int q = 0;
        for(int i = n; i > 0; i--){
            for(int a = 0; a <= q - 1; a++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("");
            q++;
        }
    }
}