/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/**
 *
 * @author Ratna
 */
public class Arithmetic implements MathOp {   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a,b,ch,cont=0;
           Arithmetic arith=new Arithmetic();
           
           Scanner s = new Scanner(System.in);
          
          do
           {  
           System.out.println("\n1. ADD   2. SUB   3. MULTIPLY    4. DIVIDE    5. EXIT ");

           ch = s.nextInt();

           System.out.println("Enter operands : ");
           a = s.nextInt();
           b = s.nextInt();
                      
           switch(ch)
           {
           case 1:
               arith.add(a,b);
               break;
           case 2:
               arith.sub(a,b);
               break;
           case 3:
               arith.mul(a,b);
               break;
           case 4:
               arith.div(a,b);
               break;
           case 5:
               System.out.println("Bye!");
               System.exit(0);
               break;
           default:
               System.out.println("Enter your VALID choice (1-5): ");
           }
           System.out.println("Do you want to continue ( 1-Yes / 0-No ): ");
           cont = s.nextInt();
       }while(cont!=0);
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void mul(int a, int b) {
       System.out.println(a*b);
    }

    @Override
    public void div(int a, int b) {
        if(b==0)
           System.out.println("Division by zero error!");
       else
            System.out.println(a/b);
    }
    
}
