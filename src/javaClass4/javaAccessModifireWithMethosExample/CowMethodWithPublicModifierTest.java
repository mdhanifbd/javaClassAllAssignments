package javaClass4.javaAccessModifireWithMethosExample;

// public: two packages, one general class and Two main method classes  in Two packages
// Another Class

public class CowMethodWithPublicModifierTest {
    public static void main(String[] args) {
        CowMethodWithPublicModifier somrat = new CowMethodWithPublicModifier();
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

