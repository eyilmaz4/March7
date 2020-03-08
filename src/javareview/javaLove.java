package javareview;

public class javaLove {
    public static void main(String[] args) {
        String sentence="Elif";
        sentence= sentence.toLowerCase();
       //String word="";
        //int end=sentence.length()+1;
       int count=0;
        for(int i=0; i<sentence.length();i++){
            if(sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='u'||sentence.charAt(i)=='o'||sentence.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
