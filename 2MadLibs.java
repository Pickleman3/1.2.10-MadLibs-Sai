//Import the java scanner
import java.util.Scanner;
public class Choudarypally_MadLibs {
    public static void main(String[] args){
       //Create the story
        
        String story = ("There once was a man named (noun) and he was quite (adjective). One day he went outside to (verb) to a girl, but he got rejected. He decided to go to a bar where he would meet a boy named Arnav. Arnav was a (adverb) special man and he said if he could eat a mushroomed then he could make a love potion. So he went on a journey towards the place called [noun]. Unfortunately on the way there he died.");
        System.out.println(story);
        // Create the scanner and ask for inputs
        Scanner scanner = new Scanner(System.in);

      
        String word1 = "(noun)";
        String word2 = "(adjective)";
        String word3 = "(verb)";
        String word4 = "(adverb)";
        String word5 = "[noun]";
// finds where the word is in the story. I realized later that this wasn't necessary
        int index = story.indexOf(word1);
        int index2 = story.indexOf(word2);
        int index3 = story.indexOf(word3);
        int index4 = story.indexOf(word4);
        int index5 = story.indexOf(word5);
//prints out where the words are in the story
        System.out.println(index + " " + index2 + " " + index3 + " " + index4 + " " + index5);
        System.out.println("");
        System.out.println("");
        System.out.println("");



        //input 1
        System.out.print("Enter first string: ");
        String S1 = scanner.nextLine();

     
        //input 2
        System.out.print("Enter second string: ");
        String S2 = scanner.nextLine();
       
        //input3
        System.out.print("Enter third string: ");
        String S3 = scanner.nextLine();
       
        //input 4
        System.out.print("Enter fourth string: ");
        String S4 = scanner.nextLine();
        
        //input 5
        System.out.print("Enter fifth string: ");
        String S5 = scanner.nextLine();
        
        //replace the words from the story 
        story = story.replace(word1, S1);
        story = story.replace(word2, S2);
        story = story.replace(word3, S3);
        story = story.replace(word4, S4);
        story = story.replace(word5, S5);

        System.out.println(story);
        }
}
