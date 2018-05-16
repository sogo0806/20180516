import javax.swing.*;

public class Frame2 extends JFrame{
    private JLabel jlb = new JLabel("恭喜你成功登入");
    public Frame2(){
        init();
    }
    private void init(){
        this.setBounds(100,100,100,100);
        jlb.setBounds(250,100,100,100);
        this.add(jlb);
    }
}
