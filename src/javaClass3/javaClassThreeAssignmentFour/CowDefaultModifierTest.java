package javaClass3.javaClassThreeAssignmentFour;

// Class for main method
public class CowDefaultModifierTest {
    public static void main(String[] args) {
        CowDefaultModifier somrat = new CowDefaultModifier();
        somrat.name="Somrat";
        somrat.size=13f;
        somrat.color="yellow";
        somrat.gender="Female";
        somrat.Weight=130;

        somrat.name();
        somrat.color();
        somrat.weight();
        somrat.gender();
        somrat.size();
    }
}
