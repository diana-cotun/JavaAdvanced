package Task2_pg13;

public enum PackageSize {
    SMALL(0, 5),
    MEDIUM(6, 10),
    LARGE(11, 20),
    DEFAULT(0, 0);

    private int minimumPackageSize;
    private int maximumPackageSize;

    PackageSize(int minimumPackageSize, int maximumPackageSize) {
        this.minimumPackageSize = minimumPackageSize;
        this.maximumPackageSize = maximumPackageSize;
    }

    public int getMinimumPackageSize() {
        return minimumPackageSize;
    }

    public int getMaximumPackageSize() {
        return maximumPackageSize;
    }

    public static PackageSize getPackageSize(int sizeOfPackage) {
        PackageSize result = null;
        for (PackageSize packages : values()) {
            if (sizeOfPackage >= packages.minimumPackageSize && sizeOfPackage <= packages.maximumPackageSize) {
                result = packages;
            }
        }
        return result;
    }

    public static PackageSize getPackageSize(int min, int max) {
        for (PackageSize packageSize : values()) {
            if (min >= packageSize.minimumPackageSize && max <= packageSize.maximumPackageSize) {
                return packageSize;
            }
        }
        return DEFAULT;
    }




    }
