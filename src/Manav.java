import java.util.Scanner;



public class Manav {
    public static void main(String[] args) {

        double armut = 2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.0,toplam, armut1,elma1,domates1,muz1,patlican1;

        Scanner inp= new Scanner(System.in);

        System.out.print("Armut kac kilo?: ");
        armut1=inp.nextDouble();
        System.out.print("Elma kac kilo?: ");
        elma1=inp.nextDouble();
        System.out.print("Domates kac kilo?: ");
        domates1=inp.nextDouble();
        System.out.print("Muz kac kilo?: ");
        muz1=inp.nextDouble();
        System.out.print("Patlican kac kilo?: ");
        patlican1=inp.nextDouble();


        toplam = armut*armut1+elma*elma1+domates*domates1+muz*muz1+patlican*patlican1;
        System.out.print("Odemeniz Gereken Toplam Tutar: "+toplam );

    }
}
