import java.net.*;
import java.io.UnsupportedEncodingException;

public class URLEncode {

    public static void main(String[] args) {
        try {
            String url = "http://www.test.fr/images perso/mon image.gif";
            System.out.println(URLEncoder.encode(url, "UTF-8"));
            System.out.println(URLEncoder.encode(url, "UTF-16"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
