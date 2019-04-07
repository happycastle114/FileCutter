import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String filename;
        int amount;
        Scanner scan = new Scanner(System.in);
        System.out.println("자를 파일 경로를 입력해주세요!:");
        filename = scan.nextLine();
        System.out.println("개수를 입력해 주세요! :");
        amount = Integer.valueOf(scan.nextLine());
        scan.close();
        Cutter cutter = new Cutter();
        cutter.cutter(filename,amount);

    }
}
