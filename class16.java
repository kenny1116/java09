class CCirclew
{
    private double pi=3.14;
    private double radius;
    
    public CCirclew(double r)
    {
        radius=r;
    }
    public void show()
    {
        System.out.print("radius="+radius);
        System.out.println(" , area"+pi*radius*radius);
    }
}
public class class16
{
    public static void main(String args[])
    {
        CCirclew cir[];
        cir=new CCirclew[6];

        for(int i=0;i<cir.length;i++)
        {
            cir[i]=new CCirclew((double)i);
            cir[i].show();
        }
    }
}
