public class Main {

    public static void main(String[] args) {
        System.out.println (walking(24,29));
        System.out.println (walking(14,41));
        System.out.println (walking(8,11));
        System.out.println (walking(58,16));
        System.out.println (walking(19,73));
        System.out.println (walking(generateRandomAge(),30));


    }
    public static String walking(int age, int temperature) {
        if((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30))
            return "Можно идти гулять";
        else if(age < 20 && temperature >= 0 && temperature <= 28)
            return "Можно идти гулять";
        else if(age > 45 && temperature >= -10 && temperature <= 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        return (int)(Math.random() * 100 + 1);
    }
}