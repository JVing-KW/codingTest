class Solution {
    public String solution(String phone_number) {
      String star =  phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
      String num = phone_number.substring(phone_number.length()-4,phone_number.length());
        
        String answer = star + num;
        
           
        
        return answer;
    }
}