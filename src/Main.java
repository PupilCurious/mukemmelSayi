public class Main {
    public static void main(String[] args) {
        //Mükemmel Sayı: Pozitif bölenlerinin toplamı kendisini veren sayıdır.
        //Örnek: 6 mükemmel sayıdır. Bölenler 1+2+3=6 dır.

        int number = 16;
        int total = 0;
        for(int i=1 ; i<number ; i++){
            if(number%i==0){
                total += i;
                System.out.print(i + " + ");
            }
        }
        if (total==number){
            System.out.println(" bölen toplamları " + total + " olduğu için " + number + " mükemmel sayıdır");
        }
        else{
            System.out.println(" bölen toplamları " + total + " olduğu için " + number + " mükemmel sayı değildir");
        }


    }
}