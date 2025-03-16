import java.util.Scanner;
public class calculateVowelAndConsonant {
    public static void countVowelAndConsonant(String a) {
        int vowel = 0;
        int consonant = 0;
        int specialCharacter = 0;
        int number = 0;

    
        for (char c : a.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowel++;
            } else if (Character.isLetter(c)) {
                consonant++;
            } else if ("0123456789".indexOf(c) != -1) {
                number++;
            } else {
                specialCharacter++;
            }
        }

        System.out.println("Vowel :" + vowel + " " + "Consonant :" + consonant + " " + "Special character :"
                + specialCharacter + " " + "Number :" + number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string ");
        String s = scanner.next();
        countVowelAndConsonant(s);
    }
}
