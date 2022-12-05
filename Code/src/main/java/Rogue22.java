public class Rogue22 {
    public static void main(String[] args){
        System.out.println("Hello World");
        User rogue = new User("rogue");
        Customer wolverine = new Customer("wolverine");
        Admin profX = new Admin("profX");
        Workshop mutantCamp = new Workshop("mutantCamp", 100);
        Booking bk1 = new Booking(wolverine, mutantCamp, 2);
        System.out.println(rogue);
        System.out.println(profX);
        System.out.println(mutantCamp);
        System.out.println(bk1);

    }
}
