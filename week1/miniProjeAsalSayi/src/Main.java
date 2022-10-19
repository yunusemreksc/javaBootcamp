public class Main {
    public static void main(String[] args) {
        int number =15;
        int sayac=0;

        for(int i =2;i<number;i++){
            int remainder = number % i;
            if(remainder==0){
                sayac+=1;
            }

        }
        if(sayac>0){
            System.out.println("Sayi Asal Degildir.");
        }else{
            System.out.println("Sayi Asaldir.");
        }

    }
}