import java.util.ArrayList;

public class CelluleInfo
{
    private ArrayList<String> trainList;
    private ArrayList<Observer> observerList = new ArrayList<>();;

    public void addObserver(Observer panneau)
    {
        observerList.add(panneau);
    }

    public void setInfo(ArrayList<String> trainList)
    {
        this.trainList = trainList;
        for (Observer panneau: observerList)
        {
            panneau.updateInfo(this.trainList);
        }
    }

}
