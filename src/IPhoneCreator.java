/**
 * Created by kamel on 2/14/2017.
 */
public class IPhoneCreator {

    public static IPhone7 createNewPhone(String sn,float price)
    {
        IPhone7 p1 = new IPhone7(sn,price);
        p1.bundle();
        p1.prepSoftware();
        p1.qualityCheck();
        p1.ship();

        return p1;

    }


}
