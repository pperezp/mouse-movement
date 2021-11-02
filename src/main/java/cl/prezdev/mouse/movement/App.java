package cl.prezdev.mouse.movement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws AWTException, InterruptedException {
//        try {
//             Robot robot = new Robot();
//             Random random = new Random();
//             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//
//             while(true){
//                 TimeUnit.SECONDS.sleep(2);
//                 robot.mouseMove(
//                     random.nextInt(screenSize.width),
//                     random.nextInt(screenSize.height)
//                 );
//             }
//         } catch (AWTException | InterruptedException ex) {
//             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//         }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Press enter to start...");
        scanner.nextLine();

        Robot robot = new Robot();

        boolean delete = false;

        while (true) {
            TimeUnit.SECONDS.sleep(1);

            if (delete) {
                delete = false;
                robot.keyPress(KeyEvent.VK_BACK_SPACE);
                robot.keyRelease(KeyEvent.VK_BACK_SPACE);
            } else {
                delete = true;
                robot.keyPress(KeyEvent.VK_P);
                robot.keyRelease(KeyEvent.VK_P);
            }
        }
    }
}
