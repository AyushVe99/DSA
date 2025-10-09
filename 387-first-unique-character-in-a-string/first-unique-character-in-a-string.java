class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
              int count= map.get(s.charAt(i));
              if(count==1){
                return i;
              }
            }
        }
    
      
       return -1;
    }
}
