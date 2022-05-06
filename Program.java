import java.util.ArrayList;

public class Program
{
    public static void main(String[] args)
    {
        CelluleInfo observableInfo = new CelluleInfo();
        CelluleMarchande observableMagasin = new CelluleMarchande();
        PanneauCouleur observerCouleur = new PanneauCouleur();
        PanneauDefilant observerDefilant = new PanneauDefilant();
        PanneauNoir observerNoir = new PanneauNoir();

        ArrayList<String> trainList = new ArrayList<>();
        ArrayList<String> magasinList = new ArrayList<>();

        trainList.add("Charleroi");
        trainList.add("Liège");
        trainList.add("Namur");

        magasinList.add("Carrefour");
        magasinList.add("Colruyt");
        magasinList.add("Aldi");

        observableInfo.addObserver(observerCouleur);
        observableInfo.addObserver(observerDefilant);
        observableInfo.addObserver(observerNoir);
        observableInfo.setInfo(trainList);

        observerCouleur.getInfo();
        System.out.println("----------");
        observerDefilant.getInfo();
        System.out.println("----------");
        observerNoir.getInfo();
        System.out.println("--------------------------");

        observableMagasin.addObserver(observerCouleur);
        observableMagasin.addObserver(observerDefilant);
        observableMagasin.addObserver(observerNoir);
        observableMagasin.setInfo(magasinList);

        observerCouleur.getMagasin();
        System.out.println("----------");
        observerDefilant.getMagasin();
        System.out.println("----------");
        observerNoir.getMagasin();

    }
}
