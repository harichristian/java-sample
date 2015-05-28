package moba.base64;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by hc on 2/5/15.
 */
public class DecodeTest {
    public static void main(String[] args) {
        String encode = "x8URElkV8BDMwATM8BDM3gTO8xEW8RTN";
        String encode2 = StringUtils.reverse(encode);

        String decode = new String(Base64.decodeBase64(encode2.getBytes()));
        System.out.println(decode);
    }
}