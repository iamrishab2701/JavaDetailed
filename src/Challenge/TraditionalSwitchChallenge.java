package Challenge;

public class TraditionalSwitchChallenge {
    // Switch Challenge
    /*
     * In this challenge, we'll be using the NATO alphabet to replace a character or
     * letter, with NATO's standized word for that letter.
     * 
     * In radio transmissions, the word car, "C","A","R" would be read,
     * "Charlie Able Roger", for clarity.
     * 
     * We'll take a single character, and return the matching word from the NATO
     * phonetic alphabet, shown on this slide.
     * 
     * We'll just do this for the letters A, through E.
     * 
     * NATO phonetic alphabet -
     * A = Able, B = Baker, C = Charlie, D = Dog, E = Easy
     * F = Fox, G = George, H = How, I = Item, J = Jig,
     * K = King, L = Love, M = Mike, N = Nan, O = Oboe,
     * P = Peter, Q = Queen, R = Roger, S = Sugar, T = Tare,
     * U = Uncle, V = Victor, W = Williamm X = Xray, Y = Yoke, Z = Zebra
     * 
     * To do this:
     * 
     * 1. Create a new char variable
     * 
     * 2. Use the traditional switch statement (with a colon in case labels) that
     * tests the value in the variable from step 1.
     * 
     * 3. Create case for characters A, B, C, D, and E.
     * 
     * 4. Display a message in each case blcok, with the letter and the NATO word,
     * then break.
     * 
     * 5. Add a default block, which displays the letter with a message saying not
     * found.
     */

    public static void main(String[] args) {
        char charValue = 'A';

        switch (charValue) {
            case 'A':
                System.out.println("For " + charValue + " the word is Able");
                break;
            case 'B':
                System.out.println("For " + charValue + " the word is Baker");
                break;
            case 'C':
                System.out.println("For " + charValue + " the word is Charlie");
                break;
            case 'D':
                System.out.println("For " + charValue + " the word is Dog");
                break;
            case 'E':
                System.out.println("For " + charValue + " the word is Easy");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
