package JavaInterview;

public class ExtractFromString {

    static void splitstring(String str)
    {
        StringBuffer alphabet=new StringBuffer();
        StringBuffer Number=new StringBuffer();
        StringBuffer specialcharacter=new StringBuffer();

        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                Number.append(str.charAt(i));

            }
            else if(Character.isAlphabetic(str.charAt(i)))
            {
                alphabet.append(str.charAt(i));
            }
            else {
                specialcharacter.append(str.charAt(i));
            }
        }
        System.out.println("Alphabet:"+alphabet);
        System.out.println("Number:"+Number);
        System.out.println("Special character:"+specialcharacter);
    }

    public static void main(String[] args) {
        String str="Javapoint@*1234";
        splitstring(str);
    }
}
