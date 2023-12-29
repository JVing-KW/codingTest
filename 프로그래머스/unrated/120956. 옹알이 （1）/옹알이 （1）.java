class Solution {
    public int solution(String[] babbling) {
        
        String[] strArr = {"aya", "ye", "woo", "ma"};
        String str = "";
        String str1 = "";
        int answer =0;
        int count = 0;
     
        for(int i =0; i< babbling.length; i++){         
            str =  babbling[i];
            str1 = "";
            count = 0;
        for(int j =0; j< strArr.length ; j++){           
            if(babbling[i].contains(strArr[j])){
               str =  str.replace(strArr[j],"*");  
                str1+="*";
                count++; 
            }else if(count == str.length()) {                                                
                  break;                  
               }                
                if(str.equals(str1) && count == str.length()){                                                
                    answer++;
                }                                  
        }             
     
    }
         return answer;
}
}