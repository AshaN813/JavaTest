import java.util.Scanner;

public class ToHashtag {
    void threeLongWord(String str)
    {
        if (str == null)
            return;
        String l1="";String l2="";String l3="";
        String[] sentance=str.split(" ");
        for(int i=0; i<sentance.length;i++)
        {
                if(l1.length()<sentance[i].length())
                {
                        l2 = l1;
                        l1 = sentance[i];
                }if(l2.length()<sentance[i].length() && sentance[i].length()<l1.length()) {
                	l3 = l2;
                	l2 = sentance[i];
                }if(l3.length()<sentance[i].length() && sentance[i].length()<l2.length() && sentance[i].length()<l1.length() ) {
                	l3 = sentance[i];
                }
        }
        System.out.println("#"+l1+","+"#"+l2+","+"#"+l3);
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        ToHashtag obj=new ToHashtag();
        System.out.printf("Enter a line to get longest word:");
        String str=scr.nextLine();
        str+=" ";
        obj.threeLongWord(str);
    }
}