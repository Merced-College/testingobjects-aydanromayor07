// Aydan Romayor
// 2-3-2026
// Main class for my Dog and Album classes

public class Main {
    public static void main(String[] args) {
        // A1: Create a Dog with no constructors defined.
        // Step 2
        Dog dog1 = new Dog();

        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        // test of data variables as public
        // Step 5
        Dog dog2 = new Dog();
        System.out.println("\nDefaults for dog2 fields (before any assignment):");
        System.out.println("name = " + dog2.getName());   // expected: null
        System.out.println("age = " + dog2.getAge());     // expected: 0
        System.out.println("breed = " + dog2.getBreed()); // expected: null

        // test the constructors for the default and non-default -- dv still public
        // Step 7
        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

        // Step 9
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        // Step 10
        System.out.println("\nMutating public fields directly:");
        d3.setAge(5); //d3.age = 5;      // direct write
        d3.setName("Max"); //d3.name = "Max"; // direct write
        System.out.println("After mutation, d3 = " + d3); // uses toString()

        // Step 12
        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);

        // Repeat steps but for user-made class
        System.out.println();

        // A1: Create a Dog with no constructors defined.
        // Step 2
        Album album1 = new Album();

        System.out.println("Printing album1 directly:");
        System.out.println(album1);

        // test of data variables as public
        // Step 5
        Album album2 = new Album();
        System.out.println("\nDefaults for album2 fields (before any assignment):");
        System.out.println("name = " + album2.getName());   // expected: null
        System.out.println("artist = " + album2.getArtist());     // expected: null
        System.out.println("year = " + album2.getYear()); // expected: 0

        // test the constructors for the default and non-default -- dv still public
        // Step 7
        Album a2 = new Album(); // uses default constructor values
        System.out.println("\na2 after default constructor:");
        System.out.println("name = " + a2.getName() + ", artist = " + a2.getArtist() + ", year = " + a2.getYear());

        Album a3 = new Album("IGOR", "Tyler, the Creator", 2019); // uses parameterized constructor
        System.out.println("\na3 after parameterized constructor:");
        System.out.println("name = " + a3.getName() + ", artist = " + a3.getArtist() + ", year = " + a3.getYear());

        // Step 9
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);

        // Step 10
        System.out.println("\nMutating public fields directly:");
        a3.setName("GNX"); //a3.name = "GNX";    // direct write
        a3.setArtist("Kendrick Lamar"); //a3.artist = "Kendrick Lamar";      // direct write
        a3.setYear(2024); //a3.year = 2024; // direct write
        System.out.println("After mutation, a3 = " + a3); // uses toString()

        // Step 12
        System.out.println("\nMutating via setters after making fields private:");
        a3.setName("Bleed American");
        a3.setArtist("Jimmy Eat World");
        a3.setYear(2001);
        System.out.println("a3 year via getter = " + a3.getYear());
        System.out.println("a3 now = " + a3);
    } // end main
} // end class