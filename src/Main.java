import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {10, 20, 20, 10, 10, 20, 5 , 20};
        int [] tekrarlanan = new int[arr.length]; //tekrarlananı tutacak olan array

        for (int i = 0; i < arr.length; i++) {
            if (tekrarlanan [i] == -1) {
                continue;
            }
            int element = arr[i];
            int tekrar = 1;

            //Elemanın frekansını dizide li diğer elemanlarla karşılaştırma
            for (int j = i + 1; j< arr.length; j++) {
                if (arr[j]==element) {
                    tekrar++;
                    tekrarlanan [j] = -1;
                }
            }
            tekrarlanan[i] = tekrar;
        }
        //Sonuçları göster
        System.out.println(Arrays.toString(arr));
        System.out.println("Tekrar sayıları");
        for (int i = 0; i<arr.length; i++) {
            if (tekrarlanan[i] != -1) {
                System.out.println(arr[i] + " sayısı " + tekrarlanan[i] + " kez tekrarlandı.");
            }
        }
    }
}
