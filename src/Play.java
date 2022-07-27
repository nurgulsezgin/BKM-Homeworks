import java.util.Random;
import java.util.Scanner;

public class Play {
    
    // Guess province
    
    public void GuessProvince() {
        System.out.println("Şehir tahmin oyununa hoş geldiniz!");
        Scanner input = new Scanner(System.in);System.out.println("1. Oyuncunun adını giriniz");
        String player1 = input.next();System.out.println("2. Oyuncunun adını giriniz");
        String player2 = input.next();

        int player1Score = 0;
        int player2Score = 0;

        String[] provinces ={"adana","bursa","istanbul"};

        for(
                int i = 0;i<100;i++)
        {
            Random randomNumber = new Random();
            int index = randomNumber.nextInt(provinces.length);

            System.out.println((i + 1) + ". Tur");

            System.out.println(player1);
            String player1Guess = input.next();
            if (player1Guess.equals(provinces[index])) {
                System.out.println("Doğru bildin");
                player1Score++;
            } else {
                System.out.println("Yanlış Doğrusu:" + provinces[index]);
            }

            System.out.println(player2);
            String player2Guess = input.next();
            if (player2Guess.equals(provinces[index])) {
                System.out.println("Doğru bildin");
                player2Score++;
            } else {
                System.out.println("Yanlış Doğrusu:" + provinces[index]);
            }
            if (player1Score == 2 && player2Score == 2) {
                System.out.println(" Tebrikler oyunu Berabere Kazandınız");
                break;
            } else if (player1Score == 2) {
                System.out.println(player1 + " Tebrikler oyunu KAZANDIN");
                break;
            } else if (player2Score == 2) {
                System.out.println(player2 + " Tebrikler oyunu KAZANDIN");
                break;
            }

        }
    }

    //Guess number
    
    public void GuessNumber() {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Sayı tahmin oyununa hoş geldiniz!");
        System.out.println("Lütfen 1-100 arasında bir number giriniz: ");
        
        int guess = input.nextInt();
        int number = rnd.nextInt(101);
        
        while (guess != number) {
            if(guess < 0 || guess > 100 ) {
                System.out.println("1 ile 100 arasında bir değer giriniz: ");
                guess = input.nextInt(); }
            else if (guess < number) {
                System.out.println("Daha büyük bir number giriniz: ");
                guess = input.nextInt(); }
            else{
                System.out.println("Daha küçük bir number giriniz: ");
                guess = input.nextInt();}
        }
        System.out.println("Tebrikler, kazandınız!"); }

    //Dice game
    public void DiceGame() {

        while (true) {
            System.out.println("Tahmin et zar kaç gelecek ..");
            Scanner input=new Scanner(System.in);
            int guessDice=input.nextInt();
            int dice = (int) (1 + Math.random() * 6);
            System.out.println("Zar " + dice + " geldi.");

            if (guessDice==dice){
                System.out.println("Doğru tahmin. Oyunu kazandın..");
                break;
            } else {
                System.out.println("Yanlış tahmin");
            }


        }
    }
}
