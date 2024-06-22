import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("愛を知らせに来た佐藤");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // テキストを表示するラベルの作成
        JLabel label1 = new JLabel("愛を知らせに来た佐藤");
        label1.setBounds(70, 20, 650, 65);
        label1.setFont(new Font("SansSerif", Font.PLAIN, 60));
        label1.setHorizontalAlignment(SwingConstants.CENTER); // 中央寄せを追加
        panel.add(label1);

        // ボタンを作成
        JButton button1 = new JButton("すたーと");
        button1.setBounds(193, 130, 400, 50);
        panel.add(button1);

        JButton button2 = new JButton("せってい");
        button2.setBounds(193, 230, 400, 50);
        panel.add(button2);

        JButton button3 = new JButton("おわり");
        button3.setBounds(193, 340, 400, 50);
        panel.add(button3);

        // せっていボタンのアクションリスナーを設定
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 新しいウィンドウを作成
                JFrame settingsFrame = new JFrame("せってい");
                settingsFrame.setSize(400, 300);
                settingsFrame.setLocationRelativeTo(frame);
                settingsFrame.setVisible(true);
            }
        });

        // おわりボタンのアクションリスナーを設定
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component c = (Component)e.getSource();

                Window w = SwingUtilities.getWindowAncestor(c);

                w.dispose();
            }
        });


        frame.add(panel);
        frame.setVisible(true);
    }
}
