// TODO: this assignment asked you to actually create a new String (i.e. define it in a variable), and not just print a result
public class NegatePhrase {
    public static void main(String[] args) {
        String text = args[0];
        String textletters = args[0].substring(0,3);
        
        if(textletters.equals("not")){
            System.out.println(text);
        }else{
            System.out.println("Not "+text);
        }


        
    }
}
// javac NegatePhrase.java; java NegatePhrase 