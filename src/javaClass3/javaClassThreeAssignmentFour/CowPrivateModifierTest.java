package javaClass3.javaClassThreeAssignmentFour;


public class CowPrivateModifierTest {
    public static void main(String[] args) {
        CowDefaultModifier pathan = new CowDefaultModifier();
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
