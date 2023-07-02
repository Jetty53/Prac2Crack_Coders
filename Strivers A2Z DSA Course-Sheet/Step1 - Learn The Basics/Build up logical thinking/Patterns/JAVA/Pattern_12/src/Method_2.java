//{ Driver Code Starts
import java.io.*;

class Main_2 {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution_2 obj = new Solution_2();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends

class Solution_2 {

    void printTriangle(int n) {
        int gap = (2 * n) - 2;
        for(int i = 1; i <= n; i++){
            for(int p = 0; p < i; p++){
                System.out.print((p + 1) + " ");
            }
            for(int q = 0; q < gap; q++){
                System.out.print("  ");
            }
            gap -= 2;
            for(int r = i; r > 0; r--){
                System.out.print(r + " ");
            }
            System.out.println("");
        }
    }
}