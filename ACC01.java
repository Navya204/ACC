import java.util.ArrayList;
import java.util.Scanner;

public class ACC01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        findUnique(arr,list);
        System.out.println(list);
    }
    public static ArrayList<Integer> findUnique(int[] arr, ArrayList<Integer> list){
        ;
        int[] hash=new int[1000001];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==1){
                list.add(i);

            }
        }
        return list;

    }
}
