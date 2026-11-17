package oops.inheritance_Overriding.multipleInheritance;

public class SmartPhone {

}

// //public class SmartPhone extends Camera, MusicPlayer, Phone{
// this above syntax is multiple inheritance but java NOT SUPPORT MULTIPLE Inheritance
// it is because lets example class D extends A, B, C all and they all have a method with same name now when class D object
// is created and we call that method now JVM will get confused that which class method should get called
// so it will throw ambiguty problem so that's why it doesnot support multiple inheritance
// To solve this ambiguty in java we use Functional interfaces