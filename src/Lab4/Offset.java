package Lab4;

import java.util.Scanner;

public class Offset extends University 
{

    private int i=0;
    
    
    private String[] Offset=new String[35];
    Scanner scan=new Scanner(System.in);

    @Override
    public void Create()
    {
        if (i<15)
        {
        System.out.println("¬ведите название зачЄта");
                Offset[i]=scan.nextLine();
        i++; 
    }
        else
        {
            System.out.println("—оздано максимальное количество зачЄтов");
        }
    }
    
    @Override
    public void Info()
    {
        if (i>0) 
        {
            for (int j=0;j<i;j++) 
            {
                System.out.println(Offset[j]);
            }
        }
    } 
}
