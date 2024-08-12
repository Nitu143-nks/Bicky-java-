import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
public class JAWTExample1 extends JFrame implements ActionListener {
  JButton b;
  JLabel lbl_1, lbl_2, add_1, course_lb,pass_lb,category;
  JTextField txt_1;
  JTextArea txta_1;
  JPanel pn1;
  JPasswordField pass_1 ;
  JCheckBox checkBox1; 
  JRadioButton r1;    
  JRadioButton r2;
  JRadioButton r3;
  ButtonGroup bg;
  DefaultListModel<String> l1 = new DefaultListModel<>(); 
  JList<String> list = new JList<>(l1);
  String caste[]={"OBC","GENERAL","S.C","S.T","EWS"};
  JComboBox cb;
  JMenu menu, submenu;  
  JMenuItem i1, i2, i3, i4, i5;
  JMenuBar mb;
  JScrollBar scr;
  JProgressBar jb;    
  int i = 0;
  static JLabel l;
  JPanel p ;
  JLabel nks ; 
	JLabel lkl; 
  JSeparator s ;
  JTable jt; 
  JScrollPane sp; 
  JAWTExample1() {
    b = new JButton("Click Me");
    b.setBounds(280, 500, 80, 30);
    add(b);
    pn1 = new JPanel();
    pn1.setBounds(350, 470, 120, 40);
    pn1.setBackground(Color.yellow);
    add(pn1);
    pn1.add(b);
    lbl_1 = new JLabel("NAME:");
    lbl_1.setBounds(30, 50, 50, 30);
    add(lbl_1);
    txt_1 = new JTextField();
    txt_1.setBounds(90, 50, 120, 25);
    add(txt_1);
    lbl_2 = new JLabel("GENDER:");
    lbl_2.setBounds(30, 80, 100, 30);
    add(lbl_2);
    add_1 = new JLabel("ADDRESS:");
    add_1.setBounds(30, 110, 100, 30);
    add(add_1);
    txta_1 = new JTextArea();
    txta_1.setBounds(140, 110, 220, 100);
    add(txta_1);
    course_lb = new JLabel("Course");
    course_lb.setBounds(30, 250, 80, 30);
    add(course_lb);
    pass_lb = new JLabel("Password");
    pass_lb.setBounds(220, 420, 90, 30);
    add(pass_lb);
    pass_1 = new JPasswordField();
    pass_1.setBounds(300, 420, 90, 30);
    add(pass_1);
    checkBox1 = new JCheckBox("Agree term and condition");
    checkBox1.setBounds(400, 420, 300, 30);
    add(checkBox1);
    r1=new JRadioButton("A) Male");    
    r2=new JRadioButton("B) Female");
    r3=new JRadioButton("C) Other");
    r1.setBounds(140, 80, 70, 30);
    r2.setBounds(220, 80, 100, 30);
    r3.setBounds(330, 80, 100, 30);
    bg=new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    bg.add(r3);
    add(r1);
    add(r2);
    add(r3);
    l1.addElement("MCA");  
    l1.addElement("BCA");  
    l1.addElement("BTECH");  
    l1.addElement("MTECH");
    list.setBounds(120, 250, 60, 80); 
    add(list);
    category= new JLabel("category");
    category.setBounds(440, 80, 90, 25);
    add(category);
    cb=new JComboBox(caste);
    cb.setBounds(500, 80, 100, 30);
    add(cb);
    mb=new JMenuBar();
    menu=new JMenu("Menu");  
    submenu=new JMenu("Sub Menu");
    i1=new JMenuItem("NEW");  
          i2=new JMenuItem("OPEN");  
          i3=new JMenuItem("SAVE AS");  
          i4=new JMenuItem("PRINT");  
          i5=new JMenuItem("EXIT");  
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(i4); submenu.add(i5);  
          menu.add(submenu);  
          mb.add(menu);
    setJMenuBar(mb);
    scr=new JScrollBar(); 
    scr.setBounds(190, 250, 35, 80);
    add(scr);
    jb=new JProgressBar(0,2000);    
    jb.setBounds(30,420,100,25);         
    jb.setValue(0);    
    jb.setStringPainted(true);    
    add(jb);
    p =new JPanel();
    nks = new JLabel("this is label 1"); 
    lkl = new JLabel("this is label 2"); 
    s = new JSeparator(); 
    p.add(nks); 
		p.add(s); 
		p.add(lkl); 
		// set layout 
		p.setLayout(new GridLayout(1,0));
    add(p);
    String data[][]={ {"101","Amit","670000"},    
    {"102","Jai","780000"},    
    {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};
    jt=new JTable(data,column);
    jt.setBounds(370, 130, 150, 70);
    sp=new JScrollPane(jt);    
    add(sp);
    add(jt);
    setSize(700, 700);
    setTitle("This is our basic Swing components");
    setLayout(null);
    setVisible(true);
  }
  public void iterate(){    
    while(i<=2000){    
      jb.setValue(i);    
      i=i+20;    
      try{Thread.sleep(150);}catch(Exception e){}    
    }    
    }    
  public static void main(String args[]){
    @SuppressWarnings("unused")
    JAWTExample1 f1 = new JAWTExample1();
    JFrame f = new JFrame("file chooser");
        // set the size of the frame
        f.setSize(400, 400);
    
        // set the frame's visibility
        f.setVisible(true);
    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // button to open save dialog
        JButton button1 = new JButton("save");
    
        // button to open open dialog
        JButton button2 = new JButton("open");

        // response on buttons
        button1.addActionListener(f1);
        button2.addActionListener(f1);
    
        // make a panel to add the buttons and labels
        JPanel p = new JPanel();
    
        // add buttons to the frame
        p.add(button1);
        p.add(button2);
    
        // set the label to its initial value
        l = new JLabel("no file selected");
    
        // add panel to the frame
        p.add(l);
        f.add(p);
    
        f.show();
      }
  @Override
      public void actionPerformed(ActionEvent evt)
      {
        // if the user presses the save button show the save dialog
        String com = evt.getActionCommand();
    
        if (com.equals("save")) {
          // create an object of JFileChooser class
          JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    
          // invoke the showsSaveDialog function to show the save dialog
          int r = j.showSaveDialog(null);
    
          // if the user selects a file
          if (r == JFileChooser.APPROVE_OPTION)
    
          {
            // set the label to the path of the selected file
            l.setText(j.getSelectedFile().getAbsolutePath());
          }
          // if the user cancelled the operation
          else
            l.setText("the user cancelled the operation");
        }
    
        // if the user presses the open dialog show the open dialog
        else {
          // create an object of JFileChooser class
          JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    
          // invoke the showsOpenDialog function to show the save dialog
          int r = j.showOpenDialog(null);
    
          // if the user selects a file
          if (r == JFileChooser.APPROVE_OPTION)
    
          {
            // set the label to the path of the selected file
            l.setText(j.getSelectedFile().getAbsolutePath());
          }
          // if the user cancelled the operation
          else
            l.setText("the user cancelled the operation");
        }
  }
} 
