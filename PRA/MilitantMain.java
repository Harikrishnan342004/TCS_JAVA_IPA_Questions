import java.util.*;
class Militant
{
   private  int militantId;
   private  String name;
   private  String category;
   private  double experience;

    public Militant(int militantId ,String name ,String category ,double experience)
    {
      this.militantId = militantId;
      this.name = name;
      this.category = category;
      this.experience = experience;
    }

    public int getId()
    {
        return militantId;
    }
    public void setId(int ngetId)
    {
        this.militantId = ngetId;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String nName)
    {
        this.name = nName;
    }

    public String getcategory()
    {
        return category;
    }
    public void setcategory(String nCategory)
    {
        this.category = nCategory;
    }

    public double getexp()
    {
        return experience;
    }
    public void setexp(double nexp)
    {
        this.experience = nexp;
    }

}

public class MilitantMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Militant> Arr = new LinkedHashSet<>();
        int N = sc.nextInt();

        for(int i = 0 ; i < N ; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String category = sc.nextLine();
            double experience = sc.nextDouble();

            Arr.add(new Militant(id, name, category, experience));
        }

        int findId = sc.nextInt();

        ArrayList<Militant> ansId = searchMilitantByMilitantId(Arr, findId);
        if(ansId.size() == 0)
        {
            System.out.println("No militiant found with given id");
        }
        else
        {
            for(int i = 0 ; i < ansId.size() ; i++)
            {
                System.out.println(ansId.get(i).getId());
                System.out.println(ansId.get(i).getName());
                System.out.println(ansId.get(i).getcategory());
                System.out.println(ansId.get(i).getexp());
            }
        }

        ArrayList<Militant> Ex = findMilitantsWithLessThanTwoYearsExperience(Arr);
        if(Ex.size() == 0)
        {
            System.out.println("No militiant found with given less than id");
        }
        else
        {
            for(int i = 0 ; i < Ex.size() ; i++)
            {
                System.out.println(Ex.get(i).getId());
                System.out.println(Ex.get(i).getName());
                System.out.println(Ex.get(i).getcategory());
                System.out.println(Ex.get(i).getexp());
            }
        }
        sc.close();

    }

    public static ArrayList<Militant> searchMilitantByMilitantId(LinkedHashSet<Militant> Arr , int findid)
    {
       ArrayList<Militant> result = new ArrayList<>();
       for(Militant m : Arr)
       {
           if(m.getId() == findid)
           {
               result.add(m);
           }
       }
       return result;
    }

    public static ArrayList<Militant> findMilitantsWithLessThanTwoYearsExperience(LinkedHashSet<Militant> Arr)
    {
       ArrayList<Militant> res = new ArrayList<>();
       for(Militant m : Arr)
       {
           if(m.getexp() < 2)
           {
               res.add(m);
           }
       }
       return res;
    }

}