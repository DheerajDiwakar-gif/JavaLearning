package JL1_javabasic;
import java.util.Scanner;
public class JL09_RestaurantBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customer ,date;
        String[] itemName =new String[30];
        int tableNumber,n;
        int[] qty = new int[30];
        double subTotal=0,gst,grandTotal;
        double[] price = new double[30];
        double[] amount = new double[30];
        System.out.println("Enter Table no. :");
        tableNumber = sc.nextInt();
        System.out.println("Enter Customer name :");
        customer = sc.nextLine();
        System.out.println("Enter Date :");
        date = sc.next();
        System.out.println("How Many Items? :");
        n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter items :");
            itemName[i] = sc.next();
            System.out.println("Enter Quentity :");
            qty[i] = sc.nextInt();
            System.out.println("Enter Price per Item :");
            price[i] = sc.nextDouble();
            amount[i] = qty[i]*price[i];
            subTotal =subTotal+amount[i];
        }
        gst = (subTotal*18)/100;
        grandTotal =subTotal+gst;

        System.out.println("==================================================");
        System.out.println("                \"ROYAL RESTAURANT\"");
        System.out.println("==================================================");
        System.out.println("Table No.      :"+tableNumber);
        System.out.println("Customer       :"+customer);
        System.out.println("Date           :"+date);
        System.out.println("--------------------------------------------------");
        System.out.println("Item\t\tQty\t\tPrice\t\tAmount");
        System.out.println("--------------------------------------------------");
        for(int i=0;i<n;i++) {
            amount[i] = qty[i]*price[i];
            System.out.println(itemName[i]+"\t\t"+qty[i]+"\t\t"+price[i]+"\t\t"+amount[i]);
            subTotal =subTotal+amount[i];
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("Sub Total\t\t\t\t\t\t%.2f\n",subTotal);
        System.out.printf("GST(18%%)\t\t\t\t\t\t%.2f\n",gst);
        System.out.println("--------------------------------------------------");
        System.out.printf("Total\t\t\t\t\t\t%.2f",grandTotal);
        System.out.println("\n==================================================");
        System.out.println("                \"Thank You! Visit Again\"");
        System.out.println("==================================================");

    }
}

//        ==================================================
//                         "ROYAL RESTAURANT"
//        ==================================================
//        Table No.      : 12
//        Customer       : Dheeraj
//        Date           : 31-08-2026
//        --------------------------------------------------
//        Item            Qty        Price        Amount
//        --------------------------------------------------
//        Pizza            2        250.00        500.00
//        Burger           1        120.00        120.00
//        Cold Drink       2         60.00        120.00
//        --------------------------------------------------
//        Subtotal                              740.00
//        GST (5%)                               37.00
//        --------------------------------------------------
//        TOTAL                                 777.00
//        ==================================================
//                      "Thank You! Visit Again"
//        ==================================================