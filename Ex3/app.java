package Ex3;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        fan fan1 = new fan();
        fan fan2 = new fan();
        fan1.setStatus(true);
        fan1.setRadius(10);
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan2.setStatus(false);
        fan2.setRadius(5);
        fan2.setSpeed(2);
        fan2.setColor("blue");
        fan1.getInfor();
        fan2.getInfor();
    }
}
