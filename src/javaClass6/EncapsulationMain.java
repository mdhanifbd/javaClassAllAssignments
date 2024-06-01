package javaClass6;

public class EncapsulationMain {
    public static void main(String[] args) {
        // create an object
        EncapsulationRead read = new EncapsulationRead();
        // to read EncapsulationRead Class
        System.out.println("Encapsulation gatter or Read only "+  read.getAge());

        // create an object
        EncapsulationWrite write = new EncapsulationWrite();
       // write and read the value of the variable;
        write.setAge1(103);

        // create an object
        EncapsulationWriteAndRead writeAndRead =new EncapsulationWriteAndRead();
        writeAndRead.setAge(92); // write by passing prameter value using satter method
        System.out.println("Encapsulation gatter method  and age is "+writeAndRead.getAge());


    }
}
