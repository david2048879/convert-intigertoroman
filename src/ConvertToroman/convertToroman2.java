package ConvertToroman;

public class convertToroman2 {
    public static void main(String[] args) {
        System.out.println("1 =" + convert(1));
        System.out.println("40 =" + convert(40));
        System.out.println("219 =" + convert(219));

    }
    public static String convert(int number){
        String[] ones={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundreds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[]  thousends={"","M","MM","MM"};

        return thousends[number/1000] + hundreds[(number % 1000)/100] +  tens[(number % 100)/10] + ones[number % 10];
    }
}
