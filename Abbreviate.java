// great, except again:
// TODO: you have to actually make a new String
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
            System.out.println(startprint+"..."+endprint);
        }
    }
}
// javac Abbreviate.java; java Abbreviate 