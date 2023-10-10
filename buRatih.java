import java.util.Scanner;

public class buRatih {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean status=true;
        int harga = 0;
        int total = 0;
        do{
            System.out.println("List makanan dan minuman\n 1.Nasi goreng 25.000\n 2.Steak 45.000\n 3.Pizza 35.000\n Minuman\n 4.Es teler 18.000\n 5.Soda 21.000\n 6.Cappucino 18.000");
            System.out.println("Mau beli apa?");
            int barang = s.nextInt();


            switch(barang){
                case 1:
                harga = 25000;
                total += harga;
                break;

                case 2:
                harga = 45000;
                total += harga;
                break;

                case 3:
                harga = 35000;
                total += harga;
                break;

                case 4:
                harga = 18000;
                total += harga;
                break;

                case 5:
                harga = 21000;
                total += harga;
                break;

                case 6:
                harga = 18000;
                total += harga;
                break;

                default :
                harga=0;
                break;
            }

            System.out.println("Apakah ada yg ingin di tambahkan? (ya/tidak)");
            String tambahkan = s.next();
            if(tambahkan.equalsIgnoreCase("Tidak")){
                status=false;
            }
            System.out.println("Total : " +total);
        }while(status);

        
    }
    
}
