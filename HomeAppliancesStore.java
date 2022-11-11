public class HomeAppliancesStore {


    static String Name="1";
    static String Address="2";
    static int Employers =3;
    static int x;
    static    String p="onoma";

    static String getName(String p)
    {
        HomeAppliancesStore.Name=p;
        return HomeAppliancesStore.Name;
    }

    public static void main(String[] args)
    {



        System.out.println("Name=" + Name);
        System.out.println("Address=" + Address);
        System.out.println("Employers=" + Employers);
        if (Name == null)
        {
            System.out.println("Name is NULL");
        }
        if (Address == null)
        {
            System.out.println("Address is NULL");
        }
        if (Employers == 0)
        {
            System.out.println("Employers is NULL");
        }
        Integer.parseInt(args[x]);




    }


}












