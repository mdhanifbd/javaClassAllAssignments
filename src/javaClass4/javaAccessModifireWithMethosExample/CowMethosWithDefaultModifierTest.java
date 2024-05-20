package javaClass4.javaAccessModifireWithMethosExample;

// Default: One packages, A general class & another class main method and creating object

//  Another Class for main method and create object
public class CowMethosWithDefaultModifierTest {
    public static void main(String[] args) {
        CowMethodWithDefaultModifier somrat = new CowMethodWithDefaultModifier();
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
