
package midterm.baynas;

import java.util.Scanner;


public class MIDTERMBAYNAS {

  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        String response;
        do{
        System.out.println("1. ADD");
        System.out.println("2. VIEW ");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        System.out.print("Enter Action: ");
        int action =  sc.nextInt();
        MIDTERMBAYNAS payment = new MIDTERMBAYNAS(); 
        switch(action){
            case 1:
               
            payment.addPayment();
            break;
            
            case 2:
            payment.viewPayment();
            break;
        }
            System.out.println("Do1 you want to continue? (yes/no): ");
            response = sc.next();  
        }while(response.equalsIgnoreCase("yes"));
        System.out.println("Thank you!"); 
    }
    public void addPayment(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Payment ID: ");
        String fname = sc.next();
        System.out.print(" AMOUNT: ");
        String lname = sc.next();
        System.out.print("PAYMENT DATE: ");
        String email = sc.next();
        System.out.print(" Status: ");
        String status = sc.next();

        String sql = "INSERT INTO tbl_payment (amount, pay_date, pay_method, status) VALUES (?, ?, ?, ?)";
       config conf = new config();
       conf.addRecord(sql, amount, pay_date, pay_method, status);

    }
    
    private void viewPayment() {
        config conf = new config();
        String votersQuery = "SELECT * FROM tbl_payment";
        String[] votersHeaders = {"payment ID", "amount", "payment_date", "payment_method", "Status"};
        String[] votersColumns = {"pay_id", "amount","pay_date", "pay_method", "status"};
            
        config cof = new config();
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }

   private void updatePayment(){
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter the id to update: ");
                int id = sc.nextInt();
          System.out.print("New First Name: ");
          String nfname = sc.next();
          System.out.print("New Last Name: ");
          String nlname = sc.next();
          System.out.print("New Email: ");
          String nemail = sc.next();
         System.out.print("New Status: ");
         String nstatus = sc.next();
         String qry = "UPDATE tbl_payment SET amount = ?, payment_date = ?, payment_method = ?, status = ? WHERE pay_id";
         
         config conf = new config();
        
}

    

    
    }


  
   
    


    
  


    
    

