package Lab4;

import java.util.Scanner;

public class StudentExam extends University
{
    private int i,j=0;
    
    private String[] Stud=new String[30]; 
    
    private String[] Exam=new String[30];
    Scanner scan=new Scanner(System.in);
    
    
    @Override
    public void Create()
    {
        if (i<30)
        {
        System.out.println("Введите фамилию студента:");
            Stud[i]=scan.nextLine();
            
            if (j<30)
            { 
                System.out.println("Введите название экзамена");
                    Exam[j]=scan.nextLine();
                j++;  
            }
            i++;
        }
        else
        {
            System.out.println("Набрано максимальное количество студентов");
        }
    }
    
    
    
    @Override
    public void Info()
    {
        if (i>0) 
        {
            for (int j=0;j<i;j++)
            {
                System.out.println(Stud[j] + " сдаёт " + Exam[j]);
            }
        }
    }
}
