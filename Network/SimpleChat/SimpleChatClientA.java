package Network.SimpleChat;

import javax.swing.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClientA {

        JTextField outgoing;
        PrintWriter writer;
        Socket sock;

        public void go() {
            JFrame frame = new JFrame("Simple client");
            JPanel mainPanel = new JPanel();
            outgoing = new JTextField(20);
            JButton sendButton = new JButton("Send");
            sendButton.addActionListener(new SendButtonListener());
            mainPanel.add(outgoing);
            mainPanel.add(sendButton);
            frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
            setUpNetWorking();
            frame.setSize(400,500);
            frame.setVisible(true);
        }
    private void setUpNetWorking(){
            try{
                sock = new Socket("127.0.0.1", 5000);
                writer = new PrintWriter(sock.getOutputStream());
                System.out.println("Networking established");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
    public class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try{
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
