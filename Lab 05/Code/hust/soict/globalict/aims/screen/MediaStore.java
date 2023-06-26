package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Media media;
    public MediaStore(Media media){
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        container.add(new JButton("Add to cart"));
        if(media instanceof Playable){
            JButton playbtn = new JButton("Play");
            container.add(playbtn);
            playbtn.addActionListener(new ButtonListener(media));
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    private class ButtonListener implements ActionListener {
        Media media;
        public ButtonListener(Media media) {
            this.media = media;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if(button.equals("Play")){
                Playable mediaplay = (Playable) media;
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setSize(400,300);

                JDialog dialog = new JDialog(frame, "Play Interface", Dialog.ModalityType.APPLICATION_MODAL);
                dialog.setSize(300,200);
                dialog.setLocationRelativeTo(frame);

                String playing = media.toString();
                JLabel played = new JLabel( playing);
                dialog.getContentPane().add(played);

                dialog.setVisible(true);
            }
        }
    }
}
