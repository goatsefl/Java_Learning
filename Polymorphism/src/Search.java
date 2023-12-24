package Polymorphism.src;

public class Search {
    public static void main(String[] args) {

//        PC1 contains product details which takes String model, String manufacturer.

        Product PC1 = new Product("2290","Global Foundry");

//      mn1 contains the Details of the same product but, with resolution and size.

        Monitor mn1 = new Monitor("SX-112","Acer","3840 X 2160",32);

//      mb1 contains the motherboard details with ramSlots, cardSlots and bios
        Motherboard mb1 = new Motherboard("Am5","Gigabyte", 4, 2,"EFI/UEFI");

//      case1 contains the powerSupply as the member field.
        ComputerCase case1 = new ComputerCase("h011","NZXT","450 Watts");

//  The maxPc is the main object which contains the monitor, motherboard and computer_case contains main details.
        PersonalComputer maxPc = new PersonalComputer("Legion7","Lenovo",mb1,mn1,case1);

        System.out.println(maxPc);
    }
}

/* There are some formatting issue but, these entail the basics of how composition/Polymorphism can be used to
combine different classes by creating new flexible options with classes.
Output:
PersonalComputer{motherboard=Motherboard{ramSlots=4, cardSlots=2, bios='EFI/UEFI'} PersonalComputer{motherboard=null, monitor=null, ccase=null} Product{model='Am5', manufacturer='Gigabyte'}

, monitor=Monitor{size=32, resolution='3840 X 2160'} PersonalComputer{motherboard=null, monitor=null, ccase=null} Product{model='SX-112', manufacturer='Acer'}

, ccase=ComputerCase{powerSupply='450 Watts'} PersonalComputer{motherboard=null, monitor=null, ccase=null} Product{model='h011', manufacturer='NZXT'}

} Product{model='Legion7', manufacturer='Lenovo'}
*/
