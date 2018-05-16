import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private JLabel jlb = new JLabel("ID");
    private JLabel jlb1 = new JLabel("PW");
    private JTextField jt = new JTextField();
    private JPasswordField jp = new JPasswordField();
    private JButton jbt = new JButton("EXIT");
    private JButton jbt1 = new JButton(" Login");

    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,300,200);
        this.setLayout(null);

        jlb.setBounds(50,50,20,10);
        jlb1.setBounds(50,70,20,10);
        jbt.setBounds(50,100,70,50);
        jbt1.setBounds(200,100,70,50);
        jt.setBounds(100,50,70,20);
        jp.setBounds(100,70,70,20);

        this.add(jlb);
        this.add(jlb1);
        this.add(jbt);
        this.add(jbt1);
        this.add(jt);
        this.add(jp);


        jbt1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jt.getText().equals("Anita") && (new String(jp.getPassword())).equals("123456")){
                    Frame2 frm = new Frame2();
                    frm.setVisible(true);
                    MainFrame.this.setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"Error");
                }
            }
        });


        jbt.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
