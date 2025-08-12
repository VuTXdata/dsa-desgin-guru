package array;

public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = gain[0];
        for(int i = 1; i < gain.length; i++){
            gain[i] = gain[i] + gain[i-1];
            if(gain[i] > maxAltitude){
                maxAltitude = gain[i];
            }
        }
        return maxAltitude;
    }
}
