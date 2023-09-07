/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_ch_ang.sen;

/**
 *
 * @author CHARM
 */
public class CS4_Ch_AngSen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Name1 = "Batman";
        int StarRating1 = 5;
        int startAttack1 = 621;
        
        String Name2 = "Superman";
        int StarRating2 = 5;
        int startAttack2 = 676;        
        
        String Name3 = "Green Lantern";
        int StarRating3 = 4;
        int startAttack3 = 645;


        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Hero 1:");

        System.out.println(" ");
        
        System.out.println("Name: " + Name1);
        System.out.println("Star Rating: " + StarRating1);
        System.out.println("Attack Damage: " + startAttack1);

        System.out.println(" ");
    
        System.out.println("Hero 2:");
      
        System.out.println(" ");
  
        System.out.println("Name: " + Name2);
        System.out.println("Star Rating: " + StarRating2);
        System.out.println("Attack Damage: " + startAttack2);

        System.out.println(" ");
    
        System.out.println("Hero 3:");

        System.out.println(" ");
        
        System.out.println("Name: " + Name3);
        System.out.println("Star Rating: " + StarRating3);
        System.out.println("Attack Damage: " + startAttack3);
        
        boolean HigherDamage = startAttack2 > startAttack1;
        int AvgDamage = (startAttack1 + startAttack2 + startAttack3)/3;
        boolean HigherStars = StarRating1 > StarRating3;

        
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Superman's Attack Damage is higher than Batman: " + HigherDamage);
        System.out.println("The average attack damage of the three heroes is: " + AvgDamage);
        System.out.println("Batman's Star Rating is higher than that of Green Lantern: " + HigherStars);
        
        
    }
    
}
