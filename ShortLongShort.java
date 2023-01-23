public class ShortLongShort {
    public static void main(String[] args) {
        String text1 = args[0];
        String text2 = args[1];
        int length1 = text1.length();
        int length2 = text2.length();
        if (length1>length2){
            System.out.println(text2+text1+text2);
        }else if (length2>length1){
            System.out.println(text1+text2+text1);
        }


    }
}
// javac ShortLongShort.java; java ShortLongShort 