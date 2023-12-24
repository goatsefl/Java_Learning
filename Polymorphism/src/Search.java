package Polymorphism.src;

public class Search {
    public static void main(String[] args) {

        Product PC1 = new Product("2290","Global Foundry");

        Monitor mn1 = new Monitor("SX-112","Acer","3840 X 2160",32);

        Motherboard mb1 = new Motherboard("Am5","Gigabyte", 4, 2,"EFI/UEFI");

        ComputerCase case1 = new ComputerCase("h011","NZXT","450 Watts");

        PersonalComputer maxPc = new PersonalComputer("Legion7","Lenovo",mb1,mn1,case1);

        System.out.println(maxPc);

    }
}
