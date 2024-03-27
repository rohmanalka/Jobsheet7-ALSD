package mergesortingtest;

public class MergeSorting21 {
    
    public void mergeSort (int[] data) {
        sort(data, 0, data.length - 1);
    }   

    private void merge(int data[], int left, int midle, int right){
        int[] temp = new int[data.length];
        for(int i= left; i<= right; i++){
            temp[i] = data[i];
        }
        int a = left;
        int b = midle +1;
        int c = left;
        
        //membandingkan setiap bagian
        while(a <= midle && b<= right){
            if(temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        int s= midle - a;
        for(int i=0; i<=s; i++){
            data[c+i] = temp[a+i];
        }
    }

    private void sort(int data[], int left, int right){
        if(left < right){
            int midle = (left + right)/2;
            sort(data, left, midle);
            sort(data, midle + 1, right);
            merge(data, left, midle, right);
        }
    }

    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
