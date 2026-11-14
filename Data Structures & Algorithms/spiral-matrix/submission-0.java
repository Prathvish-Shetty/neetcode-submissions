class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int mir = 0, mar = matrix.length-1, mic = 0, mac = matrix[0].length-1;
        while(mir <= mar && mic <= mac){
            for(int i = mic; i <= mac; i++){
                res.add(matrix[mir][i]);
            }
            mir++;
            if(mir > mar) return res;
            for(int i = mir; i <= mar; i++){
                res.add(matrix[i][mac]);
            }
            mac--;
            if(mic > mac) return res;
            for(int i = mac; i >= mic; i--){
                res.add(matrix[mar][i]);
            }
            mar--;
            if(mir > mar ) return res;
            for(int i = mar; i >= mir; i--){
                res.add(matrix[i][mic]);
            }
            mic++;
        }
        return res;
    }
}