class Main {
  
  public static void main(String[] args) {

   //create new objects of type Dog
   Dog d1 = new Dog ("Lego", 12);//new instance of Dog
   Dog d2 = new Dog("Oslo", 5);// new instance of Dog

   //print out the details of each dog
   d1.printDogInfo();
   System.out.println();
   d2.printDogInfo();
  }
}