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

        initializeComponents();;

        createTopPanel();
        createMiddlePane();
        createBottomPanel();

        setupFrame();
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
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(75, 0, 130));

        ImageIcon fortuneIcon = new ImageIcon("src/resources/crystal-ball.jpg");

        titleLabel = new JLabel("Fortune Teller", fortuneIcon, SwingConstants.CENTER);

        titleLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        titleLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.WHITE);

        topPanel.add(titleLabel);

        this.add(topPanel, BorderLayout.NORTH);
    }

    private void createMiddlePane() {
        fortuneTextArea = new JTextArea(10, 40);
        fortuneTextArea.setFont(fortuneFont);
        fortuneTextArea.setEditable(false);
        fortuneTextArea.setLineWrap(true);
        fortuneTextArea.setWrapStyleWord(true);
        fortuneTextArea.setBackground(new Color(255, 250, 240));

        scrollPane = new JScrollPane(fortuneTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JPanel middlePanel = new JPanel();
        middlePanel.add(scrollPane);

        this.add(middlePanel, BorderLayout.CENTER);
    }

    private void createBottomPanel() {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(75, 0, 130));

        readFortuneButton = new JButton("Read My Fortune!");
        readFortuneButton.setFont(buttonFont);
        readFortuneButton.setBackground(new Color(218, 165, 32));
        readFortuneButton.setForeground(Color.BLACK);

        readFortuneButton.addActionListener(e -> displayRandomFortune());

        quitButton = new JButton("Quit");
        quitButton.setFont(buttonFont);
        quitButton.setBackground(new Color(178, 34, 34));
        quitButton.setForeground(Color.WHITE);

        quitButton.addActionListener(e -> System.exit(0));

        bottomPanel.add(readFortuneButton);
        bottomPanel.add(quitButton);

        this.add(bottomPanel, BorderLayout.SOUTH);
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
