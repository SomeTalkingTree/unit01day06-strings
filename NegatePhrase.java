
public class NegatePhrase {
    public static void main(String[] args) {
        String text = args[0];
        String textletters = args[0].substring(0,3);
        
        if(textletters.equals("not")){
            String text1 = text;
            System.out.println(text1);
        }else{
            String text1 = "Not "+text;
            System.out.println(text1);
        }


        
    }
}
// javac NegatePhrase.java; java NegatePhrase 