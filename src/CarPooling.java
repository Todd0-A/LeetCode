public class CarPooling {
    /*
    https://leetcode.com/problems/car-pooling/
     */
    public boolean carPooling(int[][] trips, int capacity) {
        int max=0;
        for(int i=0;i<trips.length;i++)
        {
            if(trips[i][2]>max)
                max=trips[i][2];
        }
        for(int i=0;i<=max;i++){
            for(int j=0;j<trips.length;j++){
                if(i==trips[j][1])
                    capacity-=trips[j][0];
                if(i==trips[j][2])
                    capacity+=trips[j][0];

            }
            if(capacity<0)
                return false;
        }
        return true;
    }
}
