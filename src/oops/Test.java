package oops;

public class Test {
    public static void main(String[] args) {
        Car_Encapsulation_example car = new Car_Encapsulation_example();
        // So as we have made our fields or properties private in car class then we cannot directly set them like below mentioned way.
        //Now we can set them with the help of getter and setter methods
        /*
        car.setColor("Blue"); // These all variables color, speed etc are directly accessible because these are not private in class car
        car.speed = 40;
        car.brand = "Tata";
        car.year = 2024;
        car.model = "Safari";

         */

        car.accelerate(1); // here we are using the method we have created in class car
        System.out.println(car.getSpeed());

        /*
        Cat cat = new Cat(); // here we have created the object of the class which is extending another class.
        // And below we are able to use the fields which are present in parent class by creating object of child class this is inheritance
        cat.name = "bob";

         */


        Animal dog = new Dog(); // polymorphism ; here we are creating object of dog class with the reference of Animal(parent) class.
        //This is Polymorphism
        dog.makeSound(); // Output will be "Woof" as the reference is of Animal class but the created object is of the Dog class




        Cat a = new Cat();// here we have created object of cat class and 'a' is pointing to its memory loaction/reference
        a.name = "bob";  // we have given name their
        Cat cat = makeCatNameUpperCase(a); // here we are calling the method and passing a it means passing the memory address
        System.out.println(cat.name); // here the output is "BOB"
        System.out.println(a.name);// and here also "BOB' . the a. name value gets changed

    }

    public static Cat makeCatNameUpperCase(Cat cat){ // so here the memory address from a has been passed and now both and 'a' and this cat is pointing to same memory location
        // where currently name is bob
        cat.name = cat.name.toUpperCase();// now here we are changing the name to uppercase at same memory address
        return cat; // and now returning it
    }


    //                            EASY WAY TO REMEMBER

   /*
                       TEST CLASS

1️⃣  Cat a = new Cat();

        a
        ↓
   ┌───────────────┐
   │   Cat Object  │
   │               │
   │ name = null   │
   └───────────────┘


2️⃣  a.name = "bob";

        a
        ↓
   ┌───────────────┐
   │   Cat Object  │
   │               │
   │ name ───────→ "bob"
   └───────────────┘


3️⃣  Cat cat = makeCatNameUpperCase(a);

        a
        ↓
   ┌───────────────┐
   │   Cat Object  │
   │ name ───────→ "bob"
   └───────────────┘
        ↑
        │
       cat

   BOTH `a` AND `cat` point to THE SAME Cat object.


4️⃣ Inside the method:

   cat.name = cat.name.toUpperCase();

        a
        ↓
   ┌───────────────┐
   │   Cat Object  │
   │ name ───────→ "BOB"
   └───────────────┘
        ↑
        │
       cat

   The Cat object's `name` is now "BOB".


5️⃣ return cat;

   The SAME Cat object is returned.

        a ──────┐
                ↓
          ┌───────────────┐
          │   Cat Object  │
          │ name = "BOB"  │
          └───────────────┘
                ↑
                │
              cat

              One diagram to memorize
             SAME OBJECT
          ┌──────────────┐
     a ──→│              │←── cat
          │ name = "BOB" │
          └──────────────┘

          And one more important point: return cat doesn't create another Cat object. It returns the reference to the same existing Cat object.
    */
}
