import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class FortuneTellerFrame extends JFrame {
    private JLabel titleLabel;
    private JTextArea fortuneTextArea;
    private JScrollPane scrollPane;
    private JButton readFortuneButton;
    private JButton quitButton;

    private Font titleFont;
    private Font buttonFont;
    private Font fortuneFont;

    private ArrayList<String> fortunes;
    private int lastFortuneIndex = -1;
    private Random random;

    public FortuneTellerFrame() {
        random = new Random();

        titleFont = new Font("Arial", Font.BOLD, 48);
        buttonFont = new Font("Arial", Font.PLAIN, 16);
        fortuneFont = new Font("Georgia", Font.PLAIN, 16);

        // TODO: initialize fortunes ArrayList, set up GUI components, set up frame
    }

    private void initializeComponents() {
        fortunes = new ArrayList<>();

        fortunes.add("You will find a penny, but it will be stuck to gum.");
        fortunes.add("A closed mouth gathers no foot... unless you're a flamingo.");
        fortunes.add("You will soon witness a miracle: finding matching socks.");
        fortunes.add("An exciting opportunity awaits: parallel parking on the first try!");
        fortunes.add("Your lucky numbers are: all of them. You're just that lucky.");
        fortunes.add("A surprise is in store for you... it's probably more laundry.");
        fortunes.add("You will make a new friend today. It might be a houseplant.");
        fortunes.add("Tomorrow will bring good news... your package isn't lost!");
        fortunes.add("Romance is in your future. So is pizza. Pizza is more certain.");
        fortunes.add("You will discover something important: where you left your keys.");
        fortunes.add("Adventure awaits! Or at least an adventurous sandwich.");
        fortunes.add("Your future is bright... remember to wear sunglasses.");
    }

    private void createTopPanel() {
        // TODO
    }

    private void createMiddlePane() {
        // TODO
    }

    private void createBottomPanel() {
        // TODO
    }

    private void setupFrame() {
        // TODO
    }

    private void displayRandomFortune() {
        int newIndex;

        do {
            newIndex = random.nextInt(fortunes.size());
        } while (newIndex == lastFortuneIndex && fortunes.size() > 1);

        lastFortuneIndex = newIndex;

        fortuneTextArea.append(fortunes.get(newIndex) + "\n");
    }
}
