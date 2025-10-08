import java.util.Scanner;
public class Choudarypally_MadLibs {
    public static void main(String[] args){
        String story = "There once was a man named (noun) and he was quite (adjective). One day he went outside to (verb) to a girl, but he got rejected. He decided to go to a bar where he would meet a boy named Arnav. Arnav was a (adverb) special man and he said if he could eat a mushroomed then he could make a love potion. So he went on a journey towards the place called [noun]. Unfortunately on the way there he died.";

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a noun: ");
       //Asks the user for an input and are promts that keep the user on track
        String input1 = scanner.nextLine();
        int index1 = story.indexOf("(noun)");
        //// Replace first (noun)
        story = story.substring(0, index1) + input1 + story.substring(index1 + "(noun)".length());

        
        System.out.print("Enter an adjective: ");
        //Asks the user for an input and are promts that keep the user on track
        String input2 = scanner.nextLine();
        int index2 = story.indexOf("(adjective)");
        // Replace (adjective)
        story = story.substring(0, index2) + input2 + story.substring(index2 + "(adjective)".length());

        
        System.out.print("Enter a verb: ");
        //Asks the user for an input and are promts that keep the user on track
        String input3 = scanner.nextLine();
        int index3 = story.indexOf("(verb)");
        // Replace (verb)
        story = story.substring(0, index3) + input3 + story.substring(index3 + "(verb)".length());

        
        System.out.print("Enter an adverb: ");
        //Asks the user for an input and are promts that keep the user on track
        String input4 = scanner.nextLine();
        int index4 = story.indexOf("(adverb)");
        // Replace (adverb)
        story = story.substring(0, index4) + input4 + story.substring(index4 + "(adverb)".length());

        
        System.out.print("Enter a place (noun): ");
        //Asks the user for an input and are promts that keep the user on track
        String input5 = scanner.nextLine();
        //Note the noun has different brackets...
        int index5 = story.indexOf("[noun]");
        // Replace [noun]
        story = story.substring(0, index5) + input5 + story.substring(index5 + "[noun]".length());

        //Displays the final story
        System.out.println("\n" + story);

        scanner.close();
    }
}
