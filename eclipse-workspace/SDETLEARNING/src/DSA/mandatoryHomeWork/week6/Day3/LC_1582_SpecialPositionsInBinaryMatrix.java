package DSA.mandatoryHomeWork.week6.Day3;

import org.junit.Test;

public class LC_1582_SpecialPositionsInBinaryMatrix {
	
	@Test
	public void example() {
		int[][] mat = { {1,0,0},{0,0,1},{1,0,0} };
		System.out.println(numSpecial(mat));
	}
	
	@Test
	public void example2() {
		int[][] mat = { { 1,0,0},{0,1,0},{0,0,1} };
		System.out.println(numSpecial(mat));
	}
	
    public int numSpecial(int[][] mat) {
    	int n = mat.length;
        int m = mat[0].length;
        int res = 0;
        if(n == 1 && n == 1) return mat[0][0];
        int flag = 0;
        int col = -1;
        for(int i=0; i<n; i++){
            flag = 0;
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    flag += 1;
                    col = j;
                } 
            }
                if(flag == 1){
                    flag = 0;
                    for(int row = 0; row<n; row++){
                        if(mat[row][col] == 1){
                            flag += 1;
                        }
                    }
                }
            if(flag == 1){
                res += 1; 
            }
        }
        return res;
    }
}