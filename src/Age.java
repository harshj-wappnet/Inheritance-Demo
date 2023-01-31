import java.util.Scanner;

// Single level inheritance demo

// age class is a child class and derive birthyear from BirthYear Class
public class Age extends BirthYear {
    public static void main(String[] args) {
        int currentyear = 2023;

        Age age = new Age();
        int your_age = currentyear - age.getbirthyear();
        System.out.println("Your age is :" + your_age);

    }
}

//birthyear is parent class which return the birthyear to age class
class BirthYear {

    Scanner sc = new Scanner(System.in);

    public int getbirthyear() {
        System.out.println("Enter Your Birthyear: ");
        int birthyear = sc.nextInt();
        return birthyear;
    }
}


