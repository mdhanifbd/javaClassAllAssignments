package javaClass4.javaAccessModifireWithMethosExample;

// Same package but another Class
public class CowMethosWithPrivateModifierTest {
    public static void main(String[] args) {
        CowMethodWithDefaultModifier pathan = new CowMethodWithDefaultModifier();
        pathan.name="Pathan";
        pathan.size=9f;
        pathan.color="white";
        pathan.gender="male";
        pathan.Weight=100;

        pathan.name();
        pathan.color();
        pathan.weight();
        pathan.gender();
        pathan.size();


    }
}
