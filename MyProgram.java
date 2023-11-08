import java.util.Scanner;

public class MyProgram
{
    //finds how many pangrams the user made.
    static int pangramCount = 0;
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        //asks for input from user.
        System.out.println("Enter a pangram!\ntype 'exit' to quit\n\nTry number 1\n");
        String text = input.nextLine();
        System.out.println();
        
        //count for how many times the user does the game.
        int count = 1;
        
        //while loop for the pangram game.
        while (!(text.equals("exit"))) {
            System.out.println(checkPangram(text));
            count++;
            System.out.println("\nTry number " + count);
            System.out.println("Type in a pangram!\n(exit) to quit\n");
            text = input.nextLine();
            System.out.println();
        }
        
        //final print for when user exits game.
        System.out.println("Thanks for playing the pangram game!");
        System.out.println("You played " + (count-1) + " times");
        System.out.println("You had " + pangramCount + " many perfect pangrams!");
    } 
    public static String checkPangram(String text) {
        
        
        //numbers string;
        String numbers = "1234567890";
        
        //punctuation string;
        String punct = "!@#$%^&*()-=_+`~[]{}|;':,./<>?";
        
        //creating an extra text to use.
        String extraText = text;
        
        //changing it to lower case so that nothing is wrong.
        text = text.toLowerCase();
        
        
        //alphabet string.
        String alpha = "abcdefghijklmnopqrtsuvwxyz";
        
        //creating counting variables for each letter.
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        
        
        
        //adding a count for each letter if they appear in the string.
        for (int ye = 0; ye < text.length(); ye++) {
            if (text.substring(ye,ye+1).equals("a")) {a++;}
            if (text.substring(ye,ye+1).equals("b")) {b++;}
            if (text.substring(ye,ye+1).equals("c")) {c++;}
            if (text.substring(ye,ye+1).equals("d")) {d++;}
            if (text.substring(ye,ye+1).equals("e")) {e++;}
            if (text.substring(ye,ye+1).equals("f")) {f++;}
            if (text.substring(ye,ye+1).equals("g")) {g++;}
            if (text.substring(ye,ye+1).equals("h")) {h++;}
            if (text.substring(ye,ye+1).equals("i")) {i++;}
            if (text.substring(ye,ye+1).equals("j")) {j++;}
            if (text.substring(ye,ye+1).equals("k")) {k++;}
            if (text.substring(ye,ye+1).equals("l")) {l++;}
            if (text.substring(ye,ye+1).equals("m")) {m++;}
            if (text.substring(ye,ye+1).equals("n")) {n++;}
            if (text.substring(ye,ye+1).equals("o")) {o++;}
            if (text.substring(ye,ye+1).equals("p")) {p++;}
            if (text.substring(ye,ye+1).equals("q")) {q++;}
            if (text.substring(ye,ye+1).equals("r")) {r++;}
            if (text.substring(ye,ye+1).equals("s")) {s++;}
            if (text.substring(ye,ye+1).equals("t")) {t++;}
            if (text.substring(ye,ye+1).equals("u")) {u++;}
            if (text.substring(ye,ye+1).equals("v")) {v++;}
            if (text.substring(ye,ye+1).equals("w")) {w++;}
            if (text.substring(ye,ye+1).equals("x")) {x++;}
            if (text.substring(ye,ye+1).equals("y")) {y++;}
            if (text.substring(ye,ye+1).equals("z")) {z++;}
        }
        
        
        //summing all of the letters; if they are less than 26, one or more is not used.
        int sum = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z;
        
        
        //checking numbers and pangram.
        for (int waka = 0; waka < text.length(); waka++) {
            if (numbers.indexOf(text.substring(waka, waka+1)) >= 0 && sum != 26) {
                return "Your word is not a perfect pangram and it has numbers in it!";
            }
        }
        
        //checking punctuation and pangram.
        for (int waka = 0; waka < text.length(); waka++) {
            if (punct.indexOf(text.substring(waka, waka+1)) >= 0 && sum != 26) {
                return "Your word is not a perfect pangram and it has punctuation in it!";
            }
        }
        
        //checking pangram.
        if (sum < 26) {return "Your word is not a perfect pangram!";}
        
        
        //checking if the string has each letter once and if it has numbers.
        if (a==1 && b==1 && c==1 && d==1 && e==1 && f==1 && g==1 && h==1 && i==1 && j==1
        && k==1 && l==1 && m==1 && n==1 && o==1 && p==1 && q==1 && r==1 && s==1 && t==1 &&
        u==1 && v==1 & w==1 && x==1 && y==1 && z==1) {
            for (int waka = 0; waka < text.length(); waka++) {
                if (numbers.indexOf(text.substring(waka, waka+1)) >= 0) {
                    pangramCount++;
                    return "Your word is a perfect pangram and it has numbers in it!";
                }
            }
        }
        
        
        //checking if the string has each letter once and if it has upper case letters or not.
        if (a==1 && b==1 && c==1 && d==1 && e==1 && f==1 && g==1 && h==1 && i==1 && j==1
        && k==1 && l==1 && m==1 && n==1 && o==1 && p==1 && q==1 && r==1 && s==1 && t==1 &&
        u==1 && v==1 & w==1 && x==1 && y==1 && z==1 && !(extraText.equals(text))) {
            pangramCount++;
            return "Your word is a perfect pangram and it has upper case letters in it.";
        }
            
        
        //checking if the string has each letter once and if it has punctuation.
        if (a==1 && b==1 && c==1 && d==1 && e==1 && f==1 && g==1 && h==1 && i==1 && j==1
        && k==1 && l==1 && m==1 && n==1 && o==1 && p==1 && q==1 && r==1 && s==1 && t==1 &&
        u==1 && v==1 & w==1 && x==1 && y==1 && z==1) {
            for (int waka = 0; waka < text.length(); waka++) {
                if (punct.indexOf(text.substring(waka, waka+1)) >= 0) {
                    pangramCount++;
                    return "Your word is a perfect pangram and it has punctuation in it!";
                }
            }
        }
        
        //checking if the string has each letter once and if it has spaces.
        if (a==1 && b==1 && c==1 && d==1 && e==1 && f==1 && g==1 && h==1 && i==1 && j==1
        && k==1 && l==1 && m==1 && n==1 && o==1 && p==1 && q==1 && r==1 && s==1 && t==1 &&
        u==1 && v==1 & w==1 && x==1 && y==1 && z==1) {
            if (text.indexOf(" ") >= 0) {
                pangramCount++;
                return "Your word is a perfect pangram and it has spaces in it!";
            }
        }
        
        
        //checking if the string has each letter once.
        if (a==1 && b==1 && c==1 && d==1 && e==1 && f==1 && g==1 && h==1 && i==1 && j==1
        && k==1 && l==1 && m==1 && n==1 && o==1 && p==1 && q==1 && r==1 && s==1 && t==1 &&
        u==1 && v==1 & w==1 && x==1 && y==1 && z==1) {
            pangramCount++;
            return "Your word is a perfect pangram!";
        } else {
            return "Your word is not a perfect pangram!";
        }
        

        
        }
}
