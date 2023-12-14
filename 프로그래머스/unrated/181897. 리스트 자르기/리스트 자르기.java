class Solution {
        public static int[] solution(int n, int[] slicer, int[] num_list) {
		int a=slicer[0];
		int b=slicer[1];
		int c=slicer[2];
		int[] result = null;
	        switch(n){
	                case 1:{
	                	 result = new int[b+1];
	                	for(int i =0;i<=b;i++) {
	                		result[i] = num_list[i];
	                	}	   
                        break;
	                }               
	                case 2:{
	                	 result = new int[num_list.length-(a)];
	                	for(int i=a,j=0;i<num_list.length;i++,j++) {
	                		result[j] = num_list[i];
	                	}
                          break;
	                }              
	               case 3: {
    result = new int[(b - a) + 1];
    for (int i = a, j = 0; i <= b; i++, j++) {
        result[j] = num_list[i];
    }
    break;
}
	                case 4:{        
                        int d =((b-a)/c);
	                	 result = new int[d+1];
	                	for(int i=0,j=0; a+(c*i)<=b;i++,j++) {
	                		result[j] = num_list[a+(c*i)];
	                	}
                          break;
	                }     
	    }
	        return result;
    }
}