import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<String, Integer> mapPlayers = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            mapPlayers.put(players[i],i);
        }
   
        for(String calling : callings) {  
            int indexing = mapPlayers.get(calling);
                if(indexing > 0) {
                    mapPlayers.put(players[indexing-1],indexing);    
                    mapPlayers.put(calling,indexing-1); 
                    String indexPlayer = players[indexing];
                    players[indexing] = players[indexing-1];
                    players[indexing-1] = indexPlayer;
                    answer=players;
                    
                }
        }
        return answer;
    }
}