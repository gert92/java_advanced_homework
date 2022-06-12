package task8;


public enum PackageSize {
    SMALL(1,5),
    MEDIUM(6,10),
    LARGE(11,20);


    private int min;
    private int max;
    PackageSize(int min, int max) {
        this.min = min;
        this.max = max;
    }



    public static PackageSize getPackageSize(int size){
        if(size <= SMALL.max){
            return SMALL;
        } else if (size <= MEDIUM.max){
            return MEDIUM;
        } else {
            return LARGE;
        }

    }


}
