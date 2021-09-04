public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount = 5 * bigCount;
        int sum = bigCount + smallCount;
        int diff = sum - goal;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (diff < 0) {
            return false;
        } else if (diff == 0) {
            return true;
        } else if (diff > 0) {
            if (diff % 5 == 0) {
                return true;
            } else if (smallCount >= goal) {
                return true;
            } else if(diff%5!=0) {
                if(smallCount==0){
                    return false;
                }else{
                    return true;
                }

            }else{

            }

        }
        return true;
    }
}




