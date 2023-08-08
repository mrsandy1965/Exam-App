
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
//hello
import java.util.ArrayList;
import java.util.List;
public class Exam {
        JFrame frame=new JFrame(); 
        JFrame mainpage=new JFrame();
        int x=0,score=0,flag=0,q_n=0,f=0,option=0;
    Exam(){
        try{
            String[][] que={{"Which of the following option leads to the portability and security of Java?","Bytecode is executed by JVM","The applet makes the Java code secure and portable","Use of exception handling","Dynamic binding between objects","1"},{"_____ is used to find and fix bugs in the Java programs.","JVM","JRE","JDK","JDB","4"},{"What is the return type of the hashCode() method in the Object class?","Object","int","long","void","2"},{"What does the expression float a = 35 / 0 return?","0","Not a Number","Infinity","Run time exception","3"},{"Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?","javap tool","javaw command","Javadoc tool","javah command","3"},{"Which of the following creates a List of 3 visible items and multiple selections abled?","new List(false, 3)","new List(3, true)","new List(true, 3)","new List(3, false)","2"},{"Which method of the Class.class is used to determine the name of a class represented by the class object as a String?","getClass()","intern()","getName()","toString()","3"}};
            List<Integer> ans=new ArrayList<Integer>(que.length);
            for (int i = 0; i < que.length; i++) {
                ans.add(i,0);
            }
        // JButton start=new JButton("START");
        // start.setBounds(150, 120, 100, 40);
        // start.addActionListener(new ActionListener(){  
        //     public void actionPerformed(ActionEvent e){ 
        //         mainpage.setVisible(false);
        //         frame.setVisible(true);
        //         JOptionPane.showMessageDialog(frame, "1.Press next to go to next question.\n2.Press save to save the answer.", "Rules",2); 
        //     }} );
        // JLabel uname=new JLabel("USERNAME");
        // uname.setBounds(20, 30, 80, 40);
        // JTextField unametf=new JTextField();
        // unametf.setBounds(100, 30, 200, 40);
        // JLabel upwd=new JLabel("PASSWORD");
        // upwd.setBounds(20, 70, 80, 40);
        // JPasswordField upwdpf=new JPasswordField();
        // upwdpf.setBounds(100, 70, 200, 40);
        // mainpage.add(start);
        // mainpage.add(uname);
        // mainpage.add(unametf);
        // mainpage.add(upwd);
        // mainpage.add(upwdpf);
        // mainpage.setSize(600, 500);
        // mainpage.setLayout(null);
        // mainpage.setVisible(true);
        // mainpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





                
                frame.setVisible(true);



        
        Border borderline= BorderFactory.createLineBorder(Color.BLACK, 2);
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(-5,-5,1000,905);
        panel1.setBorder(borderline);
        panel2.setLayout(null);
        panel2.setBounds(900,-3,605,420);
        panel2.setBorder(borderline);
        panel3.setLayout(null);
        panel3.setBounds(900,417,605,455);
        panel3.setBorder(borderline);
        JTextArea ta=new JTextArea();
        ta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        ta.setBounds(100, 50, 700, 50);
        ta.setEditable(false);

        JRadioButton rb1=new JRadioButton();
        rb1.setBounds(100,110,400,30);
        JRadioButton rb2=new JRadioButton();
        rb2.setBounds(100,150,400,30);
        JRadioButton rb3=new JRadioButton();
        rb3.setBounds(100,190,400,30);
        JRadioButton rb4=new JRadioButton();
        rb4.setBounds(100,230,400,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);
        
        JButton next=new JButton("NEXT");
        JButton save=new JButton("SAVE");
        JButton pre=new JButton("PREVIOUS");
        
                if(x==0){pre.setEnabled(false);}else{pre.setEnabled(true);}
                if(x==que.length-2){next.setEnabled(false);}else{next.setEnabled(true);}
                if(ans.get(x)==(0)){;save.setEnabled(true);}else{;save.setEnabled(false);}
        save.setBounds(450,400,150,50);
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(rb1.isSelected()){
                    option=1;
                }else if(rb2.isSelected()){
                    option=2;
                }else if(rb3.isSelected()){
                    option=3;
                }else if(rb4.isSelected()){
                    option=4;
                }else{
                    option= -1;
                }
                if(x==que.length-2){next.setEnabled(false);}
                if(x==que.length-2){next.setEnabled(false);}
                if(ans.get(x)==0){
                ans.set(x, option);
                save.setEnabled(false);
                }else{save.setEnabled(true);}
                }   
            }
        );
            ta.setText("Q"+(x+1)+"."+que[0][0]);
            rb1.setText("1."+que[0][1]);
            rb2.setText("2."+que[0][2]);
            rb3.setText("3."+que[0][3]);
            rb4.setText("4."+que[0][4]);
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               
                if(x>=0 && x<(que.length)-1){
                x++;
                ta.setText("Q"+(x+1)+"."+que[x][0]);
                rb1.setText("1."+que[x][1]);
                rb2.setText("2."+que[x][2]);
                rb3.setText("3."+que[x][3]);
                rb4.setText("4."+que[x][4]);
                if(x==0){pre.setEnabled(false);}else{pre.setEnabled(true);}
                if(x==que.length-2){next.setEnabled(false);}else{next.setEnabled(true);}
                if(ans.get(x)==(0)){;save.setEnabled(true);}else{;save.setEnabled(false);}
            }
                
            }
        });
        
        next.setBounds(250,400,150,50);
        ButtonModel b= bg.getSelection();
        pre.setBounds(50,400,150,50);
        pre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(x>0 && x<que.length){
                x--;
                ta.setText("Q"+(x+1)+"."+que[x][0]);
                rb1.setText("1."+que[x][1]);
                rb2.setText("2."+que[x][2]);
                rb3.setText("3."+que[x][3]);
                rb4.setText("4."+que[x][4]);
                if(x==0){pre.setEnabled(false);}else{pre.setEnabled(true);}
                if(x==que.length-2){next.setEnabled(false);}else{next.setEnabled(true);}
                if(ans.get(x)==(0)){save.setEnabled(true);}else{save.setEnabled(false);}
            }
        }
        });
        JButton submit=new JButton("SUBMIT");
        submit.setBounds(650,400,200,50);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                    for(int i=0;i<que.length;i++){
                        if(Integer.parseInt(que[i][5])==ans.get(i)){
                            score++;
                        }
                    }
                    JOptionPane.showMessageDialog(frame,"Exam End \n Your Score :"+score,"Thank You",1);
                    frame.dispose();
                    mainpage.dispose();
                }
                
            }
        );


            
        panel1.add(ta);
        panel1.add(pre);
        panel1.add(save);
        panel1.add(next);
        panel1.add(submit);
        panel1.add(rb1);
        panel1.add(rb2);
        panel1.add(rb3);
        panel1.add(rb4);   
        frame.add(panel1);     
        frame.add(panel2);     
        frame.add(panel3);     
        frame.setSize(1600,900);
        frame.setLayout(null);
        // frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }catch(Exception e){System.out.println(e);}
    
    }
    public static void main(String[] args) {
        new Exam();
    }
}
