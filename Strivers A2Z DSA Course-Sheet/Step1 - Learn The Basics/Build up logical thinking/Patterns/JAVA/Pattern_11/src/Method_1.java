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
        int p = 0;
        for(int i = 1; i <= n; i++){
            if(p == 0){
                p = 1;
            }else{
                p = 0;
            }
            int q = p;
            for(int j = 0; j < i; j++){
                System.out.print(q + " ");
                if(q == 0){
                    q = 1;
                }else{
                    q = 0;
                }

            }

            System.out.println("");
        }
    }
}