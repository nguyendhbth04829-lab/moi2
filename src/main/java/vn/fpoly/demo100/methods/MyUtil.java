package vn.fpoly.demo100.methods;

public class MyUtil {
    public int tinhtongmang(int arr[]){
        if (arr==null){
            throw new IllegalArgumentException("null");
        }
        int tong = 0;
        for (int i = 0;i<arr.length;i++){
            tong += arr[i]+1;
        }
        return tong;
    }
}
