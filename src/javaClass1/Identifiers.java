package javaClass1;

public class Identifiers {


        int number = 30;
        int Number = 33;
        int number9 = 34;
        int Number9 = 44;
        int number_55 = 55;
        int Number_55 = 62;
        int number$64 = 64;
        int Number$64 = 74;
        int $number = 35;
        int $Number = 72;
        int $number09 = 91;
        int $Number09 = 100;
        int _number = 22;
        int _Number = 32;
        int _number0 = 24;
        int _Number0 = 52;

        // identifier name in methods

            public void print () {
                System.out.println("my name is hanif");
            }

            public void Print () {
                System.out.println("my name is Hanif");
            }

            public void print01 () {
                System.out.println("my name is hanif01");
            }

            public void Print09 () {
                System.out.println("my name is Hanif09");
            }

            public void $print () {
                System.out.println("my name is $hanif");
            }
            public void $Print () {
                System.out.println("my name is $Hanif");
            }
            public void _print () {
                System.out.println("my name is _hanif");
            }
            public void _Print () {
                System.out.println("my name is _Hanif");
            }

    public static void main(String[] args) {
        System.out.println("Hi I am Hanif from main method");
        Identifiers testing = new Identifiers();
        testing.$Print();
        testing._Print();
        testing.Print();
        testing.print01();
        testing.$print();
        testing._print();
        testing.Print09();
        testing._print();

    }
        }








