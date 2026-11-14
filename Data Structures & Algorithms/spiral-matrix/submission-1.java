class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new ArrayList<>();
    int mir = 0, mar = matrix.length - 1, mic = 0, mac = matrix[0].length - 1;
    while (mir <= mar && mic <= mac) {
      for (int i = mic; i <= mac; i++) {
        res.add(matrix[mir][i]);
      }
      mir++;
      for (int i = mir; i <= mar; i++) {
        res.add(matrix[i][mac]);
      }
      mac--;
      if (mir <= mar) {
        for (int i = mac; i >= mic; i--) {
          res.add(matrix[mar][i]);
        }
        mar--;
      }
      if(mic <= mac){
        for (int i = mar; i >= mir; i--) {
            res.add(matrix[i][mic]);
        }
        mic++;
      }
    }
    return res;
  }
}