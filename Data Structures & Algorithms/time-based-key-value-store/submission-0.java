class TimeMap {

    class Pair{
        String value;
        int timestamp;
        Pair(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    Map<String, List<Pair>> mp; 

    public TimeMap() {
        mp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair p = new Pair(value, timestamp);
        if(!mp.containsKey(key)){
            mp.put(key, new ArrayList<>());
        }
        mp.get(key).add(p);
    }
    
    public String get(String key, int timestamp) {
        List<Pair> pairs = mp.get(key);
        if(pairs == null) return "";
        int l = 0, h = pairs.size()-1;
        String val = "";
        while(l <= h){
            int m = l+(h-l)/2;
            if(pairs.get(m).timestamp <= timestamp){
                val = pairs.get(m).value;
                l = m+1;
            } else h = m-1;
        }
        return val;
    }
}