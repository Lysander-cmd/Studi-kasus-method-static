
package laundry;

import java.util.Scanner;


public class method {
    //Deklarasi variabel
    String awal = "Pilihan layanan sebagai berikut";
    //Method nonvoid mengembalikan nilai variabel awal
    String Awal(){
        return awal;
    }
   //Method static yang berbeda class
    static void Input(){
        //Deklarasi variabel di method static
        int pilihan;
        int uang;
        //Scanner dengan variabel input
        Scanner input =  new Scanner (System.in);
        //Perintah untuk memasukan pilihan user
        System.out.print("Masukan pilihan anda : ");
        pilihan=input.nextInt();
        //Percabangan untuk inputan pilihan user dan operasi bilangan
                switch (pilihan){
            case 1:
                //Pilihan 1 menandakan user memilih cuci kering lipat dan melakukan proses pembayaran 
                //Jika uang yang dimasukan user adalah pas maka akan bertuliskan "uang anda pas"
                //jika uang yang dimasukan user kurang maka akan bertuliskan "uang anda kurang"
                //jika uang yang dimasukan user melebihi uang yang menjadi pesanannya maka akan bertuliskan "kembalian anda"
                System.out.println("Pilihan anda adalah Cuci  kering lipat");
                System.out.print("Masukan uang anda Rp : ");
                uang=input.nextInt();
                if (uang == 30000){
                    System.out.println("uang anda pas ");
                }else if(uang < 30000){
                    System.out.println(" uang anda kurang Rp: "+(30000-uang));
                }else if (uang>30000){
                System.out.println("Kembalian anda Rp: "+(uang-30000));
                break;     
            }
            case 2:
                //Pilihan 1 menandakan user memilih cuci kering setrika dan melakukan proses pembayaran 
                //Jika uang yang dimasukan user adalah pas maka akan bertuliskan "uang anda pas"
                //jika uang yang dimasukan user kurang maka akan bertuliskan "uang anda kurang"
                //jika uang yang dimasukan user melebihi uang yang menjadi pesanannya maka akan bertuliskan "kembalian anda"
                System.out.println("Pilihan anda adalah Cuci kering setrika");
                System.out.print("Masukan uang anda Rp : ");
                uang=input.nextInt();
                if (uang == 50000){
                    System.out.println("uang anda pas ");
                }else if(uang < 50000){
                    System.out.println(" uang anda kurang Rp: "+(50000-uang));
                }else if (uang>50000){
                System.out.println("Kembalian anda Rp: "+(uang-50000));
                break;
            }
            case 3:
                //Pilihan 1 menandakan user memilih setrika dan melakukan proses pembayaran 
                //Jika uang yang dimasukan user adalah pas maka akan bertuliskan "uang anda pas"
                //jika uang yang dimasukan user kurang maka akan bertuliskan "uang anda kurang"
                //jika uang yang dimasukan user melebihi uang yang menjadi pesanannya maka akan bertuliskan "kembalian anda"
                System.out.println("Pilihan anda adalah Setrika");
                System.out.print("Masukan uang anda Rp : ");
                uang=input.nextInt();
                if (uang == 20000){
                    System.out.println("uang anda pas ");
                }else if(uang < 20000){
                    System.out.println(" uang anda kurang Rp: "+(20000-uang));
                }else if (uang>20000){
                System.out.println("Kembalian anda Rp: "+(uang-20000));
                break;
            }
                //Pilihan 1 menandakan user memilih cuci sepatu dan melakukan proses pembayaran 
                //Jika uang yang dimasukan user adalah pas maka akan bertuliskan "uang anda pas"
                //jika uang yang dimasukan user kurang maka akan bertuliskan "uang anda kurang"
                //jika uang yang dimasukan user melebihi uang yang menjadi pesanannya maka akan bertuliskan "kembalian anda"
            case 4:
                System.out.println("Pilihan anda adalah Cuci Sepatu");
                System.out.print("Masukan uang anda Rp : ");
                uang=input.nextInt();
                if (uang == 15000){
                    System.out.println("uang anda pas ");
                }else if(uang < 15000){
                    System.out.println(" uang anda kurang Rp: "+(15000-uang));
                }else if (uang>15000){
                System.out.println("Kembalian anda Rp: "+(uang-15000));
                break;
            }
                //Pilihan 1 menandakan user memilih cuci perlengkapan bayi dan melakukan proses pembayaran 
                //Jika uang yang dimasukan user adalah pas maka akan bertuliskan "uang anda pas"
                //jika uang yang dimasukan user kurang maka akan bertuliskan "uang anda kurang"
                //jika uang yang dimasukan user melebihi uang yang menjadi pesanannya maka akan bertuliskan "kembalian anda"
            case 5:
                System.out.println("Pilihan anda adalah cuci Perlengkapan bayi");
                System.out.print("Masukan uang anda Rp : ");
                uang=input.nextInt();
                if (uang == 50000){
                    System.out.println("uang anda pas ");
                }else if(uang < 50000){
                    System.out.println(" uang anda kurang Rp: "+(50000-uang));
                }else if (uang>50000){
                System.out.println("Kembalian anda Rp: "+(uang-50000));
                break;
            }
    }
    }
    //Method void
    void akhir(){
        System.out.println("Terima kasih sudah memilih layanan kami");
    }
}
