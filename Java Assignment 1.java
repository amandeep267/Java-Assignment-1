import java.io.File;
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        File file=new File("\\C:\\home");
        String str;
        boolean flag=false;
        System.out.println("enter file name");
        Scanner sc=new Scanner(System.in);
        do {
            flag=false;
            str=sc.nextLine();
            String fileList[]=file.list();
            for(String fileName:fileList)
            {
                if(fileName.equals(str))
                {  flag=true;
                    System.out.println("File found");
                System.out.println(str);
                System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            if(flag!=true)
            System.out.println("File not found ,try again");


        }
        while (true);

    }
}
