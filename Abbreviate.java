// great, except again:

public class Abbreviate {
    public static void main(String[] args) {
        String text = args[0];
        int length = text.length();
        if(length<8){
            System.out.println(text);
        }else{
            String startprint = text.substring(0,2);
            int num = length-2;
            String endprint = text.substring(num,length);
            String fulltext = startprint+"..."+endprint;
            System.out.println(fulltext);
        }
    }
}
// javac Abbreviate.java; java Abbreviate 