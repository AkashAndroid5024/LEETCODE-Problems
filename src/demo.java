public class demo {
    public static void main(String args[]) {
        String text="sfj35#$^ rg)6 ^8fn4^ 3";
        int errorCount=0;
        for(int i=0;i<text.length();i++)
        {
            char c=text.charAt(i);
            if(!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c))
            {
                errorCount+=1;
            }
        }
        System.out.println(errorCount);

    }
}

