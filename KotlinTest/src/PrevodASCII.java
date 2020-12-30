import java.io.UnsupportedEncodingException;

public class PrevodASCII {
    public static void main (String[]args) throws UnsupportedEncodingException {
        char a;
        int i;
        a = 'a';
        i = (int)a;
        System.out.printf("znak %s na %d\n ", a,i);
        i = 98;
        a = (char) i;
        System.out.printf("Znak %d na %s\n",i,a);
    }
}
