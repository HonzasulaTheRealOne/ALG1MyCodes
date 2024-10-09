
package Z1Introduction;



public class Swap11 {
   
    
    public static void main(String[] args) {

        int a = 34;
        int b = 89;
        System.out.println(a + ", " + b);

        /* 1 */
        
        System.out.println(b + ", " + a);
        
        /* 2 */

        int temp = a;
        
        a = b;
        b = temp;
        System.out.println(a + ", " + b);

        
        // reset
        a = 34;
        b = 89;
        /* 3 */
        
        a = a + b;
        b = a - b;
        a = a - b; 
        System.out.println(a + ", " + b);


         
        
    }

}
