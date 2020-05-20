package Lab4;

import java.util.Scanner;

public class Certificate extends University 
{

    private int i=0;
    
    
    private String[] Certificate=new String[35];
    Scanner scan=new Scanner(System.in);
    
    @Override
    public void Create()
    {
        if (i<15)
        {
        System.out.println("Введите название аттестации");
                Certificate[i]=scan.nextLine();
        i++; 
    }
        else
        {            
            System.out.println("Создано максимальное количество аттестаций");
        }
    }
    
    @Override
    public void Info()
    {
        if (i>0) 
        {
            for (int j=0;j<i;j++) 
            {
                System.out.println(Certificate[j]);
            }
        }
    }
}
