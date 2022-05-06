import java.util.ArrayList;

public class CelluleMarchande
{
    private ArrayList<String> magasinList;
    private ArrayList<Observer> observerList = new ArrayList<>();;

    public void addObserver(Observer magasin)
    {
        observerList.add(magasin);
    }

    public void setInfo(ArrayList<String> magasinList)
    {
        this.magasinList = magasinList;
        for (Observer panneau: observerList)
        {
            panneau.updateMagasin(this.magasinList);
        }
    }
}
