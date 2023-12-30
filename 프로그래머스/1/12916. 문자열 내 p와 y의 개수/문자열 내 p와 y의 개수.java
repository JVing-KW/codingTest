class Solution {
    boolean solution(String s) {
        boolean answer = true;
       String low =  s.toLowerCase();
    String[] str = low.split("");
        int countP =0;
        int countY =0;
        for(int i =0 ; i< str.length;i++){
            
            if(str[i].equals("p")){
                countP++;
            }else if(str[i].equals("y")){
                countY++;
            }
                         
        }
        if(countP == countY  ){
            answer = true;
        }else if(countY == 0 && countP == 0 ){
            answer = true;
        }
        else{
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}