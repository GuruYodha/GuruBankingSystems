package StringPractice;
import java.util.*;
class Shop{
	String itemName;
	int itemId;
	int itemPrice;
	
	Shop(String itemName,int itemId,int itemPrice){
		this.itemName=itemName;
		this.itemId=itemId;
		this.itemPrice=itemPrice;
		
	}
	public String toString() {
		return "Your item is : "+this.itemName+"\nItem no is : "+this.itemId+ "\nPrice is : "+this.itemPrice;
	}

	public static void main(String[] args) {
		Shop item1=new Shop("Tea",001,10);
		Shop item2=new Shop("Coffee",002,50);
		Shop item3=new Shop("BournVita",003,100);
		
		Shop[] ShopArr={item1,item2,item3};
		
		System.out.println("enter the name product you want: Tea / Coffee/BournVita");
		Scanner sc=new Scanner(System.in);
		String product=sc.nextLine();
		for(int i=0;i<ShopArr.length;i++) {
			if(ShopArr[i].itemName.equals(product)) {
				
				System.out.println(ShopArr[i]);
				
			}
			
		}
		
	}
}
