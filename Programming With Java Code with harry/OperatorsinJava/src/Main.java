public class Main {
    public static void main(String[] args) {
        char ch= 'A';
        char EncryptedGrade= 'A'+ 8;
        char DecryptedGrade = (char) (EncryptedGrade-8); // doing the typecasting to find the decrypted grade.
        System.out.println("The Decrypted Grade is " + DecryptedGrade) ;
    }
}
