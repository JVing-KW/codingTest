class Solution {  
    public int[] solution(int[] arr, int[][] intervals) {
    int a = intervals[0][1] - intervals[0][0];
      int b = intervals[1][1] - intervals[1][0];
    int count =0;
       int[] answer = new int[a+b+2];
        for(int i =intervals[0][0],j=0; i<=intervals[0][1];i++,j++){
            answer[j] = arr[i];
            count++;
        }
        for(int i=intervals[1][0],j=count;i<=intervals[1][1];i++,j++){
            answer[j]=arr[i];
                
            }
     
        return answer;
    }
}