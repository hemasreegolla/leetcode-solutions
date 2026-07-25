class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length==0)
        {
            return new ArrayList<>();
        }
        HashMap<String ,List<String>> ansMap = new HashMap<>();
        int[] count = new int[26];
        for(int i=0; i<strs.length ;i++)
        {
            String s = strs[i];
            Arrays.fill(count,0);
        
        for(int j=0 ; j<s.length() ;j++){
            char c = s.charAt(j);
            count[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for( int j=0 ; j<26 ; j++){
            sb.append("#");
            sb.append(count[j]);
        }
        String key = sb.toString();
        if(!ansMap.containsKey(key)){
            ansMap.put(key , new ArrayList<String>());
        }
        ansMap.get(key).add(s);
        }
        return new ArrayList<>(ansMap.values());
    }

}