import java.util.*;

class Smartphone
{
   private int productid;
   private String brandname;
   private String rom;
   private double price;

    public Smartphone(int productid ,String brandname, String rom ,double price)
    {
       this.productid = productid;
       this.brandname = brandname;
       this.rom = rom;
       this.price = price;
    }

    public int getProductId()
    {
        return productid;
    }
    public void setProductId(int newProductid)
    {
        this.productid = newProductid;
    }

    public String getBrandname()
    {
        return brandname;
    }
    public void setBrandname(String newBrandname)
    {
       this.brandname = newBrandname;
    }

    public String getRom()
    {
        return rom;
    }
    public void setRom(String newRom)
    {
        this.rom = newRom;
    }

    public double getPrice()
    {
        return price;
    }
    public void setPrice(double newPrice)
    {
        this.price = newPrice; 

    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Smartphone[] m = new Smartphone[N];

        for(int i = 0 ; i < N ; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String rom = sc.nextLine();
            double price = sc.nextDouble();

            m[i] = new Smartphone(id , name , rom , price);
        }

        String BrandName = sc.nextLine();
        double startRange = sc.nextDouble();
        double endRange = sc.nextDouble();

        ArrayList<Smartphone> fillterByBrand = filterTheSmartPhoneByBrandName(m, BrandName);
        if (true) 
        {
            
        }
       
    }


    public static ArrayList<Smartphone> filterTheSmartPhoneByBrandName(Smartphone[] m , String SPName )
    {
       ArrayList<Smartphone> AnsId = new ArrayList<>();
       for(int i = 0 ; i < m.length ; i++)
       {
         if(m[i].getBrandname() == SPName )
         {
            AnsId.add(m[i]);
         } 
       } 
       return AnsId;
    }
    public static ArrayList<Smartphone> findTheSmartPhoneWithMaxPriceInGivenPriceRange(Smartphone[] m , double startRange , double  endRange)
    {
    ArrayList<Smartphone> maxPriceList = new ArrayList<>();
    double maxPrice = Double.MIN_VALUE;
    for (int i = 0; i < m.length; i++) {
        if (m[i].getPrice() >= startRange && m[i].getPrice() <= endRange) {
            if (m[i].getPrice() > maxPrice) {
                maxPrice = m[i].getPrice();
                maxPriceList.clear(); // Clear the list for the new maximum price
                maxPriceList.add(m[i]);
            } else if (m[i].getPrice() == maxPrice) {
                maxPriceList.add(m[i]);
            }
        }
    }

    return maxPriceList.isEmpty() ? null : maxPriceList;
       
    }
}
