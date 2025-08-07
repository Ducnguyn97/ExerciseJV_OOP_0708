package Ex2;

public class app {
    public static void main(String[] args) {
        stopWatch myWatch = new stopWatch();
        System.out.println("Đang bắt đầu đếm giờ");
        int arraySize = 100000;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        myWatch.start();
        selectionSort(array);
        myWatch.stop();
        System.out.println("Đã dừng dồng hồ");
        System.out.println("Thời gian trôi qua: "+myWatch.getElapsedTime());
    }
    public static void selectionSort(int[] arr){
        for (int i = 0 ; i< arr.length -1 ; i++){
            for (int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
