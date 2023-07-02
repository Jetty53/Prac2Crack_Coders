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
        char c = (char)(65 + n - 1);
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(c + " ");
                c--;
            }
            c = (char)(65 + n - 1);
            System.out.println("");
        }
    }
}