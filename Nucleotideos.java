import java.util.Scanner;
public class Nucleotideos
{
    public static void main (String[] args)
    {

      Scanner scanner = new Scanner(System.in);

        int QA = 0, QC = 0, QG = 0, QT = 0;
        char B;

        while (true) {
            B = scanner.next().charAt(0);

            if (B == 'X') {
                break;
            }

            switch (B) {
                case 'A':
                    QA++;
                    break;
                case 'C':
                    QC++;
                    break;
                case 'G':
                    QG++;
                    break;
                case 'T':
                    QT++;
                    break;
            }
        }

        System.out.println(QA);
        System.out.println(QC);
        System.out.println(QG);
        System.out.println(QT);
    }
}