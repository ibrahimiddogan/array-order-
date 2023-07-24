import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner alici= new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int[]dizi =new int[alici.nextInt()];
        for (int i=0 ; i< dizi.length;i++){
            System.out.print( i+1 +".elemanı giriniz : " );
            dizi[i]= alici.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

    }
}