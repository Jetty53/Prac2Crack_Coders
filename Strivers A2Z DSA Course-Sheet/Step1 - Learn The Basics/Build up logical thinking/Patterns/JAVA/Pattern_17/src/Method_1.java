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
        char c = 'A';
        char d = 'A';
        for(int i = 1; i <= n; i++){
            for(int p = n - 1; p >= i; p--){
                System.out.print(" ");
            }
            for(int q = 1; q <= i; q++){
                System.out.print(c);
                c++;
            }
            c--;
            for(int r = 2; r <= i; r++){
                c--;
                System.out.print(c);
            }
            c='A';
            System.out.println("");
        }
    }
}