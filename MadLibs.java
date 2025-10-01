
//Import the java scanner
import java.util.Scanner;
public class Choudarypally_MadLibs {
    public static void main(String[] args){
       //Create the story
        System.out.println("There onace was a man named (noun) and he was quite (adjective). One day he went outside to (verb) to a girl, but he got rejected. He decided to go to a bar where he would meet a boy named Arnav. Arnav was a (adverb) special man and he said if he could eat a mushroomed then he could make a love potion. So he went on a journey towards the place called (noun). Unfortunately on the way there he died.");

        // Create the scanner and ask for inputs
        Scanner scanner = new Scanner(System.in);

        //input 1
        System.out.print("Enter first string: ");
        String S1 = scanner.nextLine();
        System.out.println("First String " + S1);
        System.out.println("There onace was a man named" + S1 + "and he was quite (adjective). One day he went outside to (verb) to a girl, but he got rejected. He decided to go to a bar where he would meet a boy named Arnav. Arnav was a (adverb) special man and he said if he could eat a mushroomed then he could make a love potion. So he went on a journey towards the place called (noun). Unfortunately on the way there he died.");
        
        //input 2
        System.out.print("Enter first string: ");
        String S2 = scanner.nextLine();
        System.out.println("Second String " + S2);
        System.out.println("There onace was a man named" + S1 + "and he was quite" + S2 + ". One day he went outside to (verb) to a girl, but he got rejected. He decided to go to a bar where he would meet a boy named Arnav. Arnav was a (adverb) special man and he said if he could eat a mushroomed then he could make a love potion. So he went on a journey towards the place called (noun). Unfortunately on the way there he died.");

        //input3
        System.out.print("Enter first string: ");
        String S3 = scanner.nextLine();
        System.out.println("Thrid String " + S3);
        System.out.println("There onace was a man named" + S1 + "and he was quite" + S2 + ". One day he went outside to" + S3 + "to a girl, but he got rejected. He decided to go to a bar where he would meet a boy named Arnav. Arnav was a (adverb) special man and he said if he could eat a mushroomed then he could make a love potion. So he went on a journey towards the place called (noun). Unfortunately on the way there he died.");


        //input 4
        System.out.print("Enter first string: ");
        String S4 = scanner.nextLine();
        System.out.println("Fourth String " + S4);
        System.out.println("There onace was a man named" + S1 + "and he was quite" + S2 + ". One day he went outside to" + S3 + "to a girl, but he got rejected. He decided to go to a bar where he would meet a boy named Arnav. Arnav was a " + S4 + "special man and he said if he could eat a mushroomed then he could make a love potion. So he went on a journey towards the place called (noun). Unfortunately on the way there he died.");

        //input 5
        System.out.print("Enter first string: ");
        String S5 = scanner.nextLine();
        System.out.println("Fifth String " + S5);

        //final story with inputs
        System.out.println("There onace was a man named" + S1 + "and he was quite" + S2 + ". One day he went outside to" + S3 + "to a girl, but he got rejected. He decided to go to a bar where he would meet a boy named Arnav. Arnav was a "+ S4 +  "special man and he said if he could eat a mushroomed then he could make a love potion. So he went on a journey towards the place called " + S5 + ". Unfortunately on the way there he died.");
    }
       
}
