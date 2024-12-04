
package Business;

/*****************
 * CIST 2931 - E-Commerce Project
 * Group 1
 * October 2024
 * I promise I wrote this code
 *******************/
public class CartList {
    
    //Properties
    public int count = 0;
    public Cart cartAr[] = new Cart[10];
    
    //Methods
    public void addCart(Cart c1){
        cartAr[count] = c1;
        count++;
    }
    public void displayCartList(){
        for(int i = 0; i < count; i++){
            cartAr[i].display();
        }
    }
    
    public static void main(String args[]){
        
        CartList cL1 = new CartList();
        
        Cart a = new Cart("m12", "p12", "t345", 18.99);
        cL1.addCart(a);
        
        cL1.displayCartList();
    }
    
    
    
}
