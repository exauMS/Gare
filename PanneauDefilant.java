import java.util.ArrayList;

public class PanneauDefilant implements Observer
{
    private ArrayList<String> trainList;
    private ArrayList<String> magasinList;
    @Override
    public void updateInfo(Object trainList)
    {
        this.setInfo((ArrayList<String>)trainList);
    }

    public void setInfo(ArrayList<String> trainList)
    {
        this.trainList = trainList;
    }

    public void getInfo()
    {
        System.out.println("Liste de trains qui défile:");
        if (trainList == null)
        {
            System.out.println("Infos indisponible");
        }
        else
        {
            for (String o : trainList)
            {
                System.out.println(o);
            }

        }

    }

    @Override
    public void updateMagasin(Object magasinList)
    {
        this.setMagasin((ArrayList<String>)magasinList);
    }

    private void setMagasin(ArrayList<String> magasinList)
    {
        this.magasinList = magasinList;
    }

    public void getMagasin()
    {
        System.out.println("Liste de magasins qui défile :");
        if (magasinList == null)
        {
            System.out.println("Infos indisponible");
        }
        else
        {
            for (String o : magasinList)
            {
                System.out.println(o);
            }

        }

    }
}
