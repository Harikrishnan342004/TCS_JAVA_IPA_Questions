import java.util.*;

class Smartphone
{
    private int productid;
    private String brandname;
    private String rom;
    private double price;
    
    public Smartphone(int productid , String brandname, String rom , double price)
    {
        this.productid = productid;
        this.brandname = brandname;
        this.rom = rom;
        this.price = price;
    }
    
    public int getProductid()
    {
        return productid;
    }
    public void SetProductid(int nProductid)
    {
        this.productid = nProductid;
    }
    
    public String getBrandName()
    {
        return brandname;
    }
    public void setBrandname(String nBrandname)
    {
        this.brandname = nBrandname;
    }
    
    public String getRom()
    {
        return rom;
    }
    public void setRom(String nRom)
    {
        this.rom = nRom;
    }
    
    public double getPrice()
    {
      return price;
    }
    public void setPrice(double nPrice)
    {
        this.price = nPrice;
    }
}

public class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Smartphone> set = new LinkedHashSet<>();
        int N = sc.nextInt();
        
        for(int i = 0 ; i < N ; i++)
        {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String rom = sc.nextLine();
            double price = sc.nextDouble();
            
            set.add(new Smartphone(id , name , rom , price));
        }
        
        String brand = sc.nextLine();
        double sRange = sc.nextDouble();sc.nextLine();
        double eRange = sc.nextDouble();
        sc.nextLine();
        
        ArrayList<Smartphone> ans = filterTheSmartPhoneByBrandName(set , brand);
        if(ans.size() == 0)
        {
            System.out.println("No Mobile found with mentioned brand name");
        }
        else
        {
            for(int i = 0 ; i < ans.size() ; i++)
            {
                System.out.println(ans.get(i).getProductid());
                 System.out.println(ans.get(i).getBrandName());
                  System.out.println(ans.get(i).getRom());
                   System.out.println(ans.get(i).getPrice());
            }
        }
        
        Smartphone max = findTheSmartPhoneWithMaxPriceInGivenPriceRange(set, eRange , sRange);
        if(max == null)
        {
            System.out.println("No Mobile found in the given price range");
        }
        else
        {
           System.out.println(max.getBrandName());
           System.out.println(max.getRom());
           System.out.println(max.getPrice());
        }
    }
    
    public static ArrayList<Smartphone>  filterTheSmartPhoneByBrandName(LinkedHashSet<Smartphone> set ,String brand)
    {
        ArrayList<Smartphone> ans = new ArrayList<>();
        for(Smartphone s : set)
        {
            if( s.getBrandName().equalsIgnoreCase(brand))
            {
                ans.add(s);
            }
        }
        return ans;
    }
    
    
    public static Smartphone findTheSmartPhoneWithMaxPriceInGivenPriceRange(LinkedHashSet<Smartphone> set, double sRange , double eRange)
    {
        double max = Double.MIN_VALUE;
        Smartphone ans = null;
        
        for(Smartphone s: set)
        {
            if(s.getPrice()  > sRange && s.getPrice() < eRange && max < s.getPrice())
            {
                max = Math.max(max, s.getPrice());
                ans = s;
            }
        }
        return ans;
    }
    
}

