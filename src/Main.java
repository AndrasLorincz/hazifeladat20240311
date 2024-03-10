import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char muvelet;
        int a;
        int b;
//1,3. feladat számológépes(kiszervezve metódusba)

        Scanner sc=new Scanner(System.in);
        System.out.println("Első feladat (számológépes):");
        System.out.println("Add meg az elvégzendő művelet jelét (+ , - , *, /):");
        muvelet = sc.next().charAt(0);
        System.out.println("Add meg az első számot (osztás esetén 0val nem oszhatunk):");
        a = sc.nextInt();
        System.out.println("Add meg a második számot (osztás esetén 0val nem oszhatunk):");
        b = sc.nextInt();
        szamologep(a,b,muvelet);
 //2. feladat (fél pyramisos)
        System.out.print("Add meg a magasságot: ");
        int magassag = sc.nextInt();

        for (int i = 1; i <= magassag; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
    public static void szamologep(int a,int b,char muvelet){
        if (muvelet =='+'){
            System.out.println("Az A és B összege: " + (a+b));
        } else if (muvelet == '-'){
            System.out.println("Az A és B külömbsége: " + (a - b));
        } else if (muvelet == '*'){
            System.out.println("Az A és B szorzata: "+ (a*b));
        } else if (muvelet == '/'){
            System.out.println("Az A és B hányadosa: "+ (a/b));
        }
    }
}