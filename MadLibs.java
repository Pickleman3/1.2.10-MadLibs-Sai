//This is the first way. I have another one
import java.util.Scanner;
public class Choudarypally_MadLibs {
    public static void main(String[] args){
        //story 
        String story = "There once was a man named (noun) and he was quite (adjective). One day he went outside to (verb) to a girl, but he got rejected. He decided to go to a bar where he would meet a boy named Arnav. Arnav was a (adverb) special man and he said if he could eat a mushroomed then he could make a love potion. So he went on a journey towards the place called [noun]. Unfortunately on the way there he died.";
        //create the scanner
        Scanner scanner = new Scanner(System.in);

        // Replace first (noun)
        System.out.print("Enter a noun: ");
        String input1 = scanner.nextLine();
        int index1 = story.indexOf("(noun)");
        story = story.substring(0, index1) + input1 + story.substring(index1 + "(noun)".length());

        // Replace (adjective)
        System.out.print("Enter an adjective: ");
        String input2 = scanner.nextLine();
        int index2 = story.indexOf("(adjective)");
        story = story.substring(0, index2) + input2 + story.substring(index2 + "(adjective)".length());

        // Replace (verb)
        System.out.print("Enter a verb: ");
        String input3 = scanner.nextLine();
        int index3 = story.indexOf("(verb)");
        story = story.substring(0, index3) + input3 + story.substring(index3 + "(verb)".length());

        // Replace (adverb)
        System.out.print("Enter an adverb: ");
        String input4 = scanner.nextLine();
        int index4 = story.indexOf("(adverb)");
        story = story.substring(0, index4) + input4 + story.substring(index4 + "(adverb)".length());

        // Replace [noun]
        System.out.print("Enter a place (noun): ");
        String input5 = scanner.nextLine();
        int index5 = story.indexOf("[noun]");
        story = story.substring(0, index5) + input5 + story.substring(index5 + "[noun]".length());

        System.out.println("\n" + story);

        scanner.close();
    }
}
