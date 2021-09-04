public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width < 0 || height < 0 || areaPerBucket < 0 || extraBuckets < 0) {
            return -1;
        } else {
            double area;
            int no_of_buckets;
            if((width>0&&width<1)||(height>0&&height<1)){
                width=Math.round(width);
                height=Math.round(height);
                area = width * height;
                no_of_buckets = (int) Math.round(area / areaPerBucket);
                no_of_buckets = no_of_buckets - extraBuckets;
                if(no_of_buckets<0){
                    return -1;
                }else {
                    return no_of_buckets;
                }
            }else
            {
                area = width * height;
                no_of_buckets = (int) Math.round(area / areaPerBucket);
                no_of_buckets = no_of_buckets - extraBuckets;
                if(no_of_buckets<0){
                    return -1;
                }else {
                    return no_of_buckets;
                }
            }

        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            int no_of_buckets;
            double area;
            area = width * height;
            no_of_buckets = (int) Math.round(area / areaPerBucket);
            return no_of_buckets;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.round(area / areaPerBucket);
    }

}
