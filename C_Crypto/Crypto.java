package C_Crypto;
public class Crypto {

    static protected String Cesar(String data, int shift) {
        StringBuilder output = new StringBuilder(data.length());
        for (char singleChar : data.toCharArray()) {
            int shiftedChar = (int) (singleChar + shift) % 256;
            output.append((char) shiftedChar);
        }
        return output.toString();
    }

    static protected String xorAlgo(String data, String key) {

        StringBuilder result = new StringBuilder();

        for(int i=0;i<data.length();i++){
            char inputChar=data.charAt(i);
            char keyChar=data.charAt(i%key.length());

            char ecryptedChar = (char)(inputChar ^ keyChar);
            result.append(ecryptedChar);
        }
        return result.toString();
    }
}
