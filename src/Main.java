import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int selectSystem(String num_str, HashMap<Integer, String> dict) {
        int num = 2;
        if (dict.containsValue(num_str.toLowerCase()) || dict.containsValue(num_str.toUpperCase())) {
            for (Map.Entry<Integer, String> value : dict.entrySet()) {
                if (num_str.equalsIgnoreCase(value.getValue())) {
                    num = value.getKey();
                }
            }
        }
        else {
            System.out.println("Нет такой системы счисления");
        }
        return num;
    }

    public static void main(String[] args){
        HashMap<Integer, String> dict = new HashMap<>();
        dict.put(1, "HEX");
        dict.put(2, "DEC");
        dict.put(3, "OCT");
        dict.put(4, "BIN");

        System.out.println("Выберите систему счисления\n" + "1." + dict.get(1) + "\n2." + dict.get(2) + "\n3." + dict.get(3)
                + "\n4." + dict.get(4));
        Scanner scan = new Scanner(System.in);
        int num = 1;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            if (!dict.containsKey(num)) {
                num = 2;
                System.out.println("Нет такой системы счисления");
            }
        } else if (scan.hasNextLine()) {
            String num_str = scan.nextLine();
            selectSystem(num_str, dict);
        }

        System.out.println("Выбрана " + dict.get(num) + " система счисления");

        while (true) {
            String res = "";
            switch (num) {
                case 1:
                    hex hex = new hex();
                    res = hex.getResult();
                    break;
                case 2:
                    dec dec = new dec();
                    res = dec.getResult();
                    break;
                case 3:
                    oct oct = new oct();
                    res = oct.getResult();
                    break;
                case 4:
                    bin bin = new bin();
                    res = bin.getResult();
                    break;
                default: break;
            }
            System.out.println(res);
            System.out.println("Продолжить?");
            Scanner s = new Scanner(System.in);
            String key = s.nextLine();
            if (key.equalsIgnoreCase("exit") || key.equalsIgnoreCase("no")) {
                System.out.println("Завершение работы");
                break;
            }
        }
    }
}