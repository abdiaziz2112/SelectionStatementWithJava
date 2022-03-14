
/*First character is your faculty , second character is your department , next two characters is registered year,last three characters is your Id.*/

/*Examples of Id C119605 , C121201 , E117127 ,E220170 ,E312908 and so forth...*/


import java.util.Scanner;

public class StudentInfo
{
    public static void main(String[] args) {
    
    
    Scanner input = new Scanner (System.in);
    System.out.println("Enter Your ID");
    String ID = input.nextLine();
    
    if (ID.charAt(0)=='C' || ID.charAt(0)=='c' && ID.charAt (1)=='1')
    {
        System.out.println("Faculty:Computer Student\n"+"Department:Computer App");
        System.out.println("Registered year 20"+ ID.substring(2,4));
        System.out.println("Your ID: "+ID.substring(4));
        
    }
    
    
    else if (ID.charAt(0)=='E' || ID.charAt(0)=='e' && ID.charAt(1)=='1')
    {
       
        System.out.println("Faculty:Engineering Student\n"+"Department:Civil Engineering");
        System.out.println("Registered year 20"+ ID.substring(2,4));
        System.out.println("Your ID: "+ID.substring(4));
        
    }
    
    else if (ID.charAt(0)=='E' || ID.charAt(0)=='e' && ID.charAt(1)=='2')
    {
       
        System.out.println("Faculty:Engineering Student\n"+"Department:Telecomincation Engineering");
        System.out.println("Registered year 20"+ ID.substring(2,4));
        System.out.println("Your ID: "+ID.substring(4));
        
    }
    
    
    else if (ID.charAt(0)=='E' || ID.charAt(0)=='e' && ID.charAt(1)=='3')
    {
       
        System.out.println("Faculty:Engineering Student\n"+"Department:Electrical Engineering");
        System.out.println("Registered year 20"+ ID.substring(2,4));
        System.out.println("Your ID: "+ID.substring(4));
        
    }
    
    else{
        System.out.println("This ID "+ID+" not available");
    }
    
        
    }
}
