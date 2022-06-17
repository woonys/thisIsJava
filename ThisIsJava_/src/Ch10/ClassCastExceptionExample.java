package Ch10;


public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat); // 여기서 Cat 객체를 매개값으로 주었기 때문에 Dog 타입으로 변환할 수 없음.
    }

    public static void changeDog(Animal animal) {
        //if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
        //} if 문 처리 안하면 ClassCastException 발생

    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}