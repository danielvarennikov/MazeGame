
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;



public class Main extends javax.swing.JFrame implements KeyListener {

   boolean reachedDoor=false;
   boolean trapStepped=false;
   boolean getLife=false;
   public String ghost1Direction,ghost2aDirection,ghost2bDirection,ghost2cDirection,ghost3aDirection,ghost3bDirection,ghost3cDirection;
   public String dog3aDirection,dog3bDirection,dog3cDirection;
   String currentPlayer;
    
    public Main() {
        initComponents();
        login();
        startPoint();
        tutorial();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        passInput1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        passInput2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        ageInput = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        highscore = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gameOver = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        again = new javax.swing.JButton();
        bill = new javax.swing.JLabel();
        ouch = new javax.swing.JLabel();
        door = new javax.swing.JLabel();
        ghost1 = new javax.swing.JLabel();
        ghost2a = new javax.swing.JLabel();
        ghost2b = new javax.swing.JLabel();
        ghost2c = new javax.swing.JLabel();
        ghost3a = new javax.swing.JLabel();
        ghost3b = new javax.swing.JLabel();
        ghost3c = new javax.swing.JLabel();
        border1a = new javax.swing.JLabel();
        border1b = new javax.swing.JLabel();
        borderUp = new javax.swing.JLabel();
        border2a = new javax.swing.JLabel();
        borderDown = new javax.swing.JLabel();
        borderLeft = new javax.swing.JLabel();
        borderRight = new javax.swing.JLabel();
        border2b = new javax.swing.JLabel();
        border2c = new javax.swing.JLabel();
        border2d = new javax.swing.JLabel();
        border2e = new javax.swing.JLabel();
        border2f = new javax.swing.JLabel();
        border2g = new javax.swing.JLabel();
        border2h = new javax.swing.JLabel();
        border2i = new javax.swing.JLabel();
        life1 = new javax.swing.JLabel();
        trap2a = new javax.swing.JLabel();
        trap2b = new javax.swing.JLabel();
        trap2c = new javax.swing.JLabel();
        border3a = new javax.swing.JLabel();
        border3b = new javax.swing.JLabel();
        border3c = new javax.swing.JLabel();
        life2 = new javax.swing.JLabel();
        trap3a = new javax.swing.JLabel();
        trap3b = new javax.swing.JLabel();
        trap3c = new javax.swing.JLabel();
        trap3d = new javax.swing.JLabel();
        trap3h = new javax.swing.JLabel();
        trap3e = new javax.swing.JLabel();
        trap3g = new javax.swing.JLabel();
        trap3k = new javax.swing.JLabel();
        trap3i = new javax.swing.JLabel();
        trap3j = new javax.swing.JLabel();
        trap3f = new javax.swing.JLabel();
        trap3l = new javax.swing.JLabel();
        trap3m = new javax.swing.JLabel();
        trap3n = new javax.swing.JLabel();
        trap3o = new javax.swing.JLabel();
        dog3a = new javax.swing.JLabel();
        dog3b = new javax.swing.JLabel();
        dog3c = new javax.swing.JLabel();
        font = new javax.swing.JLabel();

        login.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        login.setTitle("Login");
        login.setAlwaysOnTop(true);
        login.setMinimumSize(new java.awt.Dimension(470, 400));
        login.setResizable(false);
        login.setSize(new java.awt.Dimension(470, 400));
        login.getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Username:");
        login.getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 80, 90, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Password:");
        login.getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 120, 90, 15);
        login.getContentPane().add(userInput);
        userInput.setBounds(160, 70, 190, 30);
        login.getContentPane().add(passInput1);
        passInput1.setBounds(160, 110, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        login.getContentPane().add(jButton1);
        jButton1.setBounds(170, 270, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Wrong entry");
        login.getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 240, 100, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        login.getContentPane().add(jButton2);
        jButton2.setBounds(170, 310, 120, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Password (again):");
        login.getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 160, 130, 20);
        login.getContentPane().add(passInput2);
        passInput2.setBounds(160, 150, 190, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Age:");
        login.getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 200, 80, 15);
        login.getContentPane().add(ageInput);
        ageInput.setBounds(160, 190, 190, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        login.getContentPane().add(jButton3);
        jButton3.setBounds(170, 290, 120, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Passwords don't match");
        login.getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 250, 190, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("User created");
        login.getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 230, 110, 20);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login.png"))); // NOI18N
        login.getContentPane().add(jLabel16);
        jLabel16.setBounds(160, 0, 160, 60);

        highscore.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        highscore.setAlwaysOnTop(true);
        highscore.setMinimumSize(new java.awt.Dimension(400, 400));
        highscore.setResizable(false);
        highscore.setSize(new java.awt.Dimension(400, 400));
        highscore.getContentPane().setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        highscore.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 500, 290);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Username:");
        highscore.getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 80, 90, 15);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Highscore:");
        highscore.getContentPane().add(jLabel14);
        jLabel14.setBounds(250, 80, 90, 15);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Highscores.png"))); // NOI18N
        highscore.getContentPane().add(jLabel15);
        jLabel15.setBounds(50, 20, 310, 50);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("by");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 110, 15, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Daniel Varennikov");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 120, 120, 15);

        gameOver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game_over.png"))); // NOI18N
        getContentPane().add(gameOver);
        gameOver.setBounds(160, 100, 420, 90);

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heartHealth.png"))); // NOI18N
        getContentPane().add(l1);
        l1.setBounds(570, 10, 20, 20);

        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heartHealth.png"))); // NOI18N
        getContentPane().add(l2);
        l2.setBounds(590, 10, 20, 20);

        l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heartHealth.png"))); // NOI18N
        getContentPane().add(l3);
        l3.setBounds(610, 10, 20, 20);

        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heartHealth.png"))); // NOI18N
        getContentPane().add(l4);
        l4.setBounds(630, 10, 20, 20);

        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heartHealth.png"))); // NOI18N
        getContentPane().add(l5);
        l5.setBounds(650, 10, 20, 20);

        l6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heartHealth.png"))); // NOI18N
        getContentPane().add(l6);
        l6.setBounds(670, 10, 20, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bills HP -->");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 10, 140, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Use these to move Bill-->");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 500, 180, 15);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controls.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 480, 100, 70);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(240, 50, 230, 80);

        again.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        again.setText("PLAY AGAIN");
        again.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                againActionPerformed(evt);
            }
        });
        getContentPane().add(again);
        again.setBounds(270, 380, 140, 40);

        bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill.png"))); // NOI18N
        getContentPane().add(bill);
        bill.setBounds(40, 264, 60, 50);

        ouch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ouch.png"))); // NOI18N
        getContentPane().add(ouch);
        ouch.setBounds(260, 290, 200, 60);

        door.setIcon(new javax.swing.ImageIcon(getClass().getResource("/door1.png"))); // NOI18N
        door.setText("Door");
        getContentPane().add(door);
        door.setBounds(600, 260, 50, 60);

        ghost1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghost.png"))); // NOI18N
        getContentPane().add(ghost1);
        ghost1.setBounds(390, 250, 60, 50);

        ghost2a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghost.png"))); // NOI18N
        getContentPane().add(ghost2a);
        ghost2a.setBounds(190, 50, 60, 30);

        ghost2b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghost.png"))); // NOI18N
        getContentPane().add(ghost2b);
        ghost2b.setBounds(470, 40, 50, 50);

        ghost2c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghost.png"))); // NOI18N
        getContentPane().add(ghost2c);
        ghost2c.setBounds(500, 520, 50, 50);

        ghost3a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghost.png"))); // NOI18N
        getContentPane().add(ghost3a);
        ghost3a.setBounds(320, 40, 60, 50);

        ghost3b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghost.png"))); // NOI18N
        getContentPane().add(ghost3b);
        ghost3b.setBounds(460, 534, 60, 30);

        ghost3c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghost.png"))); // NOI18N
        getContentPane().add(ghost3c);
        ghost3c.setBounds(360, 500, 50, 50);

        border1a.setBackground(new java.awt.Color(102, 255, 102));
        border1a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        border1a.setText("border1a");
        border1a.setMaximumSize(new java.awt.Dimension(700, 14));
        border1a.setMinimumSize(new java.awt.Dimension(700, 14));
        border1a.setOpaque(true);
        border1a.setPreferredSize(new java.awt.Dimension(700, 14));
        getContentPane().add(border1a);
        border1a.setBounds(0, 400, 700, 20);

        border1b.setBackground(new java.awt.Color(102, 255, 102));
        border1b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        border1b.setText("border1b");
        border1b.setMaximumSize(new java.awt.Dimension(700, 14));
        border1b.setMinimumSize(new java.awt.Dimension(700, 14));
        border1b.setOpaque(true);
        border1b.setPreferredSize(new java.awt.Dimension(700, 14));
        getContentPane().add(border1b);
        border1b.setBounds(0, 200, 700, 14);

        borderUp.setBackground(new java.awt.Color(0, 0, 0));
        borderUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        borderUp.setText("borderUp");
        borderUp.setMaximumSize(new java.awt.Dimension(700, 14));
        borderUp.setMinimumSize(new java.awt.Dimension(700, 14));
        borderUp.setOpaque(true);
        borderUp.setPreferredSize(new java.awt.Dimension(700, 14));
        getContentPane().add(borderUp);
        borderUp.setBounds(0, 0, 700, 20);

        border2a.setBackground(new java.awt.Color(255, 0, 102));
        border2a.setForeground(new java.awt.Color(153, 153, 153));
        border2a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallVertical.png"))); // NOI18N
        border2a.setText("border2a");
        border2a.setToolTipText("");
        border2a.setMaximumSize(new java.awt.Dimension(44, 480));
        border2a.setMinimumSize(new java.awt.Dimension(44, 480));
        border2a.setOpaque(true);
        border2a.setPreferredSize(new java.awt.Dimension(44, 480));
        getContentPane().add(border2a);
        border2a.setBounds(130, 110, 20, 480);

        borderDown.setBackground(new java.awt.Color(51, 51, 255));
        borderDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        borderDown.setText("borderDown");
        borderDown.setMaximumSize(new java.awt.Dimension(700, 14));
        borderDown.setMinimumSize(new java.awt.Dimension(700, 14));
        borderDown.setOpaque(true);
        borderDown.setPreferredSize(new java.awt.Dimension(700, 14));
        getContentPane().add(borderDown);
        borderDown.setBounds(0, 550, 700, 30);

        borderLeft.setBackground(new java.awt.Color(0, 102, 255));
        borderLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallVertical.png"))); // NOI18N
        borderLeft.setText("left");
        borderLeft.setMaximumSize(new java.awt.Dimension(16, 600));
        borderLeft.setMinimumSize(new java.awt.Dimension(16, 600));
        borderLeft.setOpaque(true);
        borderLeft.setPreferredSize(new java.awt.Dimension(16, 600));
        getContentPane().add(borderLeft);
        borderLeft.setBounds(-10, 10, 40, 590);

        borderRight.setBackground(new java.awt.Color(51, 102, 255));
        borderRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallVertical.png"))); // NOI18N
        borderRight.setText("right");
        borderRight.setMaximumSize(new java.awt.Dimension(22, 600));
        borderRight.setMinimumSize(new java.awt.Dimension(22, 600));
        borderRight.setOpaque(true);
        borderRight.setPreferredSize(new java.awt.Dimension(22, 600));
        getContentPane().add(borderRight);
        borderRight.setBounds(670, 0, 40, 600);

        border2b.setBackground(new java.awt.Color(255, 0, 102));
        border2b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        border2b.setText("border2b");
        border2b.setMaximumSize(new java.awt.Dimension(450, 14));
        border2b.setMinimumSize(new java.awt.Dimension(450, 14));
        border2b.setOpaque(true);
        border2b.setPreferredSize(new java.awt.Dimension(450, 14));
        getContentPane().add(border2b);
        border2b.setBounds(130, 110, 450, 20);

        border2c.setBackground(new java.awt.Color(255, 51, 102));
        border2c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallVertical.png"))); // NOI18N
        border2c.setText("border2c");
        border2c.setOpaque(true);
        getContentPane().add(border2c);
        border2c.setBounds(560, 110, 20, 110);

        border2d.setBackground(new java.awt.Color(255, 51, 102));
        border2d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallVertical.png"))); // NOI18N
        border2d.setText("border2d");
        border2d.setOpaque(true);
        getContentPane().add(border2d);
        border2d.setBounds(560, 300, 20, 180);

        border2e.setBackground(new java.awt.Color(255, 0, 51));
        border2e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        border2e.setText("border2e");
        border2e.setOpaque(true);
        getContentPane().add(border2e);
        border2e.setBounds(380, 220, 200, 20);

        border2f.setBackground(new java.awt.Color(255, 0, 51));
        border2f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        border2f.setText("border2f");
        border2f.setOpaque(true);
        getContentPane().add(border2f);
        border2f.setBounds(380, 290, 200, 20);

        border2g.setBackground(new java.awt.Color(255, 51, 102));
        border2g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallVertical.png"))); // NOI18N
        border2g.setText("border2g");
        border2g.setOpaque(true);
        getContentPane().add(border2g);
        border2g.setBounds(370, 220, 20, 80);

        border2h.setBackground(new java.awt.Color(255, 0, 102));
        border2h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        border2h.setText("border2h");
        border2h.setOpaque(true);
        getContentPane().add(border2h);
        border2h.setBounds(300, 470, 280, 20);

        border2i.setBackground(new java.awt.Color(255, 0, 102));
        border2i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallVertical.png"))); // NOI18N
        border2i.setText("border2i");
        border2i.setOpaque(true);
        getContentPane().add(border2i);
        border2i.setBounds(300, 470, 20, 120);

        life1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heartPickUp.png"))); // NOI18N
        getContentPane().add(life1);
        life1.setBounds(180, 134, 50, 40);

        trap2a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap2a);
        trap2a.setBounds(620, 56, 30, 20);

        trap2b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap2b);
        trap2b.setBounds(620, 76, 30, 30);

        trap2c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap2c);
        trap2c.setBounds(620, 96, 30, 26);

        border3a.setBackground(new java.awt.Color(0, 255, 255));
        border3a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        border3a.setText("border 3a");
        border3a.setOpaque(true);
        getContentPane().add(border3a);
        border3a.setBounds(0, 180, 580, 20);

        border3b.setBackground(new java.awt.Color(0, 255, 255));
        border3b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        border3b.setText("border 3b");
        border3b.setOpaque(true);
        getContentPane().add(border3b);
        border3b.setBounds(134, 300, 550, 20);

        border3c.setBackground(new java.awt.Color(0, 255, 255));
        border3c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallHorizontal.png"))); // NOI18N
        border3c.setText("border 3c");
        border3c.setOpaque(true);
        getContentPane().add(border3c);
        border3c.setBounds(20, 460, 560, 20);

        life2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heartPickUp.png"))); // NOI18N
        getContentPane().add(life2);
        life2.setBounds(180, 114, 50, 40);

        trap3a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3a);
        trap3a.setBounds(620, 116, 30, 26);

        trap3b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3b);
        trap3b.setBounds(620, 136, 30, 26);

        trap3c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3c);
        trap3c.setBounds(620, 156, 30, 30);

        trap3d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3d);
        trap3d.setBounds(530, 460, 26, 26);

        trap3h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3h);
        trap3h.setBounds(420, 460, 26, 26);

        trap3e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3e);
        trap3e.setBounds(530, 480, 26, 26);

        trap3g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3g);
        trap3g.setBounds(530, 550, 26, 26);

        trap3k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3k);
        trap3k.setBounds(420, 550, 26, 26);

        trap3i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3i);
        trap3i.setBounds(420, 480, 26, 26);

        trap3j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3j);
        trap3j.setBounds(420, 530, 26, 26);

        trap3f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3f);
        trap3f.setBounds(530, 530, 26, 26);

        trap3l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3l);
        trap3l.setBounds(320, 460, 26, 26);

        trap3m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3m);
        trap3m.setBounds(320, 480, 26, 26);

        trap3n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3n);
        trap3n.setBounds(320, 530, 26, 26);

        trap3o.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(trap3o);
        trap3o.setBounds(310, 550, 26, 26);

        dog3a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dog.png"))); // NOI18N
        getContentPane().add(dog3a);
        dog3a.setBounds(614, 250, 60, 36);

        dog3b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dog.png"))); // NOI18N
        getContentPane().add(dog3b);
        dog3b.setBounds(610, 334, 70, 50);

        dog3c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dog.png"))); // NOI18N
        getContentPane().add(dog3c);
        dog3c.setBounds(600, 500, 60, 36);

        font.setForeground(new java.awt.Color(0, 51, 204));
        font.setIcon(new javax.swing.ImageIcon(getClass().getResource("/font.png"))); // NOI18N
        getContentPane().add(font);
        font.setBounds(0, 0, 700, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void login(){
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        passInput2.setVisible(false);
        ageInput.setVisible(false);
        jButton3.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
    public void startPoint(){
        bill.grabFocus();
        bill.addKeyListener(this);
        Bill.setLife(3);
        
        //hide all components:
        border1a.setVisible(false);
        border1b.setVisible(false);
        
        border2a.setVisible(false);
        border2b.setVisible(false);
        border2c.setVisible(false);
        border2d.setVisible(false);
        border2e.setVisible(false);
        border2f.setVisible(false);
        border2g.setVisible(false);
        border2h.setVisible(false);
        border2i.setVisible(false);
        
        border3a.setVisible(false);
        border3b.setVisible(false);
        border3c.setVisible(false);
        
        life1.setVisible(false);
        life2.setVisible(false);
        ghost2a.setVisible(false);
        ghost2b.setVisible(false);
        ghost2c.setVisible(false);
        trap2a.setVisible(false);
        trap2b.setVisible(false);
        trap2c.setVisible(false);
        trap3a.setVisible(false);
        trap3b.setVisible(false);
        trap3c.setVisible(false);
        trap3d.setVisible(false);
        trap3e.setVisible(false);
        trap3f.setVisible(false);
        trap3g.setVisible(false);
        trap3h.setVisible(false);
        trap3i.setVisible(false);
        trap3j.setVisible(false);
        trap3k.setVisible(false);
        trap3l.setVisible(false);
        trap3m.setVisible(false);
        trap3n.setVisible(false);
        trap3o.setVisible(false);
        ghost3a.setVisible(false);
        ghost3b.setVisible(false);
        ghost3c.setVisible(false);
        dog3a.setVisible(false);
        dog3b.setVisible(false);
        dog3c.setVisible(false);
        
        ouch.setVisible(false);
        gameOver.setVisible(false);
        again.setVisible(false);   
        logo.setVisible(false);
    }   
    private void againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_againActionPerformed

        startPoint();
        tutorial();
    }//GEN-LAST:event_againActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Database read=new Database();
        read.readData();
        if(read.users.contains(userInput.getText())&&read.passwords.contains((passInput1.getText()))){
         currentPlayer=userInput.getText();
         login.dispose();
      }else{
          jLabel8.setVisible(true);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     jLabel8.setVisible(false);
     jLabel9.setVisible(true);
     jLabel10.setVisible(true);
     passInput2.setVisible(true);
     ageInput.setVisible(true);
     jButton1.setVisible(false);
     jButton2.setVisible(false);
     jButton3.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(passInput1.getText().equals(passInput2.getText())){
     Database.addData(userInput.getText(),passInput1.getText(),Integer.parseInt(ageInput.getText()));
     jLabel12.setVisible(true);
     jLabel11.setVisible(false);
     jButton3.setVisible(false);
     jButton1.setVisible(true);
     jButton2.setVisible(true);
     jLabel8.setVisible(false);
     jLabel9.setVisible(false);
     jLabel10.setVisible(false);
     passInput2.setVisible(false);
     ageInput.setVisible(false);
    }else{
        jLabel11.setVisible(true);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void highScores(){
        highscore.setLocationRelativeTo(null);
        Database.showHighscore();
        String highUsers[]=new String[Database.usersHigh.size()];
        highUsers=Database.usersHigh.toArray(highUsers);
        System.out.println(highUsers.length);  
        String highLevels[]=new String[Database.highLevelsList.size()];
        highLevels=Database.highLevelsList.toArray(highLevels);
        System.out.println(highLevels.length); 
        for(int i=0;i<highLevels.length;i++){
        jTextArea1.append("\t"+highUsers[i]+"\t "+"\t"+highLevels[i]+"\n");
        }
        highscore.setVisible(true);
        
    }
    public void tutorial(){
        //sets initial level comonents:
        logo.setVisible(true);
        
        border1a.setLocation(0,450);
        border1a.setVisible(true);
        border1b.setLocation(0,150);
        border1b.setVisible(true);
               
        
        bill.setLocation(40,300);
        bill.setVisible(true);
        
        door.setLocation(610,300);
        door.setVisible(true);
        
        ghost1.setVisible(true);
        ghost1Direction="up";
        Timer timerT=new Timer();
        TimerTask taskT=new TimerTask(){
         public void run(){
           //Checks that Bill doesn't pass the general borders of the frame:
           generalBordersLocationChecker();
             
           //advancement to the next level:  
           doorBillLocationChecker();
           if(reachedDoor){
               System.out.println("Victory");
               
               border1a.setVisible(false);
               border1b.setVisible(false);
               timerT.cancel();
               Bill.setBillLevel(Bill.getBillLevel()+1);
               Database.addHighscore(currentPlayer,1);
               level1();
               reachedDoor=false;
           }
           
           //checks if bill is near borders:
           border1aBillLocationChecker();
           border1bBillLocationChecker();
           
           //Ghost1 movement:
           
           ghost1MoveGeneral();
           if(ghost1Direction.equals("up")){
           ghost1MoveUp();    
           }else{
           ghost1MoveDown();    
           }
           
           //checks if the ghost hit Bill:
           if(ghost1HitBill()){
             Bill.setLife(Bill.getLife()-1);
             try{
             synchronized(timerT){
             ouch.setVisible(true);
             timerT.wait(500);
             }
             }catch(Exception e){
                 System.out.println("Couldn't pause: "+e);
             }
             System.out.println(Bill.getLife());
             ouch.setVisible(false);
           }
           
           //checks if Bill still has life:
           gameOver();
           if(gameOver()){
               gameOver.setVisible(true);
               again.setVisible(true);
               highScores();
               showHealth();
               timerT.cancel();
           }
           
           //shows how much health Bill has left:
           showHealth();
           
         }
        };
        timerT.scheduleAtFixedRate(taskT,1000,10);//1000ms =1sec
    }
    
    public void level1(){
        //initializes borders:
        border1a.setVisible(false);
        border2b.setVisible(false);
        
        border2a.setVisible(true);
        border2b.setVisible(true);
        border2c.setVisible(true);
        border2d.setVisible(true);
        border2e.setVisible(true);
        border2f.setVisible(true);
        border2g.setVisible(true);
        border2h.setVisible(true);
        border2i.setVisible(true);
        
        //initializes elements:
        ghost1.setVisible(false);
        
        logo.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        
        bill.setLocation(60,520);
        bill.setVisible(true);
        
        door.setLocation(325,490);
        door.setVisible(true);
        
        life1.setLocation(400,250);
        trap2a.setLocation(60,300);
        trap2b.setLocation(300,80);
        trap2c.setLocation(640,300);
        
        
        ghost2aDirection="up";
        ghost2bDirection="up";
        ghost2cDirection="up";
        
        ghost2a.setVisible(true);
        ghost2b.setVisible(true);
        ghost2c.setVisible(true);
        trap2a.setVisible(true);
        trap2b.setVisible(true);
        trap2c.setVisible(true);
        life1.setVisible(true);
        Timer timer1=new Timer();
        TimerTask task1=new TimerTask(){
         @Override
         public void run(){
           //Checks that Bill doesn't pass the general borders of the frame:
           generalBordersLocationChecker();
             
           //advancement to the next level:  
           doorBillLocationChecker();
           if(reachedDoor){
               System.out.println("Victory");
               Bill.setBillLevel(Bill.getBillLevel()+1);
               timer1.cancel();
               Database.addHighscore(currentPlayer,2);
               level2();
           }
           
           //checks if bill is near borders:
           
           border2aBillLocationChecker();
           border2bBillLocationChecker();
           border2cBillLocationChecker();
           border2dBillLocationChecker();
           border2eBillLocationChecker();
           border2fBillLocationChecker();
           border2gBillLocationChecker();
           border2hBillLocationChecker();
           border2iBillLocationChecker();
          
           //checks if Bill took the life power up:
           getLife=false;
           life1Get();
           if(getLife){
               life1.setLocation(700,700);
           }
           
           
           //checks if Bill steps on traps 2a/2b/2c:
           billTrap2a();
           billTrap2b();
           billTrap2c();
           if(trapStepped){
            try{
            trapStepped=false;    
            synchronized(timer1){
             ouch.setVisible(true);   
             timer1.wait(500);
            } 
            }catch(Exception e){
            System.out.println("Couldn't stop Timer 1: "+e);  
            } 
            ouch.setVisible(false);
           }
           
           //Ghost 2a/2b/2c movement:
           
           ghost2aMoveGeneral();
           if(ghost2aDirection.equals("up")){
           ghost2aMoveUp();    
           }else{
           ghost2aMoveDown();    
           }
           
           ghost2bMoveGeneral();
           if(ghost2bDirection.equals("up")){
           ghost2bMoveUp();    
           }else{
           ghost2bMoveDown();    
           }
           
           ghost2cMoveGeneral();
           if(ghost2cDirection.equals("up")){
           ghost2cMoveUp();    
           }else{
           ghost2cMoveDown();    
           }
           
           //checks if ghosts 2a/2b/2c hit Bill:
           if(ghost2aHitBill()||ghost2bHitBill()||ghost2cHitBill()){
             Bill.setLife(Bill.getLife()-1);
             try{
             synchronized(timer1){  
             ouch.setVisible(true);    
             timer1.wait(500);
             }
             }catch(Exception e){
                 System.out.println("Couldn't pause: "+e);
             }
             System.out.println(Bill.getLife());
             ouch.setVisible(false);
           }
           
           //checks if Bill still has life:
           gameOver();
           if(gameOver()){
               gameOver.setVisible(true);
               again.setVisible(true);
               highScores();
               showHealth();
               timer1.cancel();
           }
           
           //shows how much health Bill has left:
           showHealth();
           
         }
        };
        timer1.scheduleAtFixedRate(task1,1000,10);//1000ms =1sec
    }
    
    public void level2(){
        reachedDoor=false;
        //initializes borders:
        border1a.setVisible(false);
        border2b.setVisible(false);
        
        border2a.setVisible(false);
        border2b.setVisible(false);
        border2c.setVisible(false);
        border2d.setVisible(false);
        border2e.setVisible(false);
        border2f.setVisible(false);
        border2g.setVisible(false);
        border2h.setVisible(false);
        border2i.setVisible(false);
        
        border3a.setVisible(true);
        border3b.setVisible(true);
        border3c.setVisible(true);
        
        //initializes elements:
        ghost1.setVisible(false);
        ghost2a.setVisible(false);
        ghost2b.setVisible(false);
        ghost2c.setVisible(false);
        
        life1.setVisible(false);
        trap2a.setVisible(false);
        trap2b.setVisible(false);
        trap2c.setVisible(false);
        
        trap3a.setVisible(true);
        trap3b.setVisible(true);
        trap3c.setVisible(true);
        trap3d.setVisible(true);
        trap3e.setVisible(true);
        trap3f.setVisible(true);
        trap3g.setVisible(true);
        trap3h.setVisible(true);
        trap3i.setVisible(true);
        trap3j.setVisible(true);
        trap3k.setVisible(true);
        trap3l.setVisible(true);
        trap3m.setVisible(true);
        trap3n.setVisible(true);
        trap3o.setVisible(true);
        
        ghost3a.setVisible(true);
        ghost3b.setVisible(true);
        ghost3c.setVisible(true);
        
        dog3a.setVisible(true);
        dog3b.setVisible(true);
        dog3c.setVisible(true);
       
        life2.setVisible(true);
                
        bill.setLocation(60,50);
        bill.setVisible(true);
        
        door.setLocation(60,480);
        door.setVisible(true);
        
        life2.setLocation(600,50);
        trap3a.setLocation(600,25);
        trap3b.setLocation(600,75);
        trap3c.setLocation(575,50);
        trap3d.setLocation(530,460);
        trap3e.setLocation(530,480);
        trap3f.setLocation(530,530);
        trap3g.setLocation(530,550);
        trap3h.setLocation(420,460);
        trap3i.setLocation(420,480);
        trap3j.setLocation(420,530);
        trap3k.setLocation(420,550);
        trap3l.setLocation(310,460);
        trap3m.setLocation(310,480);
        trap3n.setLocation(310,530);
        trap3o.setLocation(310,550);
        
        
        ghost3aDirection="up";
        ghost3bDirection="up";
        ghost3cDirection="up";
        
        dog3aDirection="left";
        dog3bDirection="right";
        dog3cDirection="left";
        Timer timer2=new Timer();
        TimerTask task2=new TimerTask(){
         @Override
         public void run(){
           //Checks that Bill doesn't pass the general borders of the frame:
           generalBordersLocationChecker();
             
           //advancement to the next level:  
           doorBillLocationChecker();
           if(reachedDoor){
               System.out.println("Victory");
               Bill.setBillLevel(Bill.getBillLevel()+1);
               Database.addHighscore(currentPlayer,3);
               //level2();
           }
           
           //checks if bill is near borders:
           
           border3aBillLocationChecker();
           border3bBillLocationChecker();
           border3cBillLocationChecker();
         
          
           //checks if Bill took the life power up:
           getLife=false;
           life2Get();
           if(getLife){
               life2.setLocation(700,700);
           }
           
           //checks if Bill steps on traps:
           billTrap3a();
           billTrap3b();
           billTrap3c();
           billTrap3d();
           billTrap3e();
           billTrap3f();
           billTrap3g();
           billTrap3h();
           billTrap3i();
           billTrap3j();
           billTrap3k();
           billTrap3l();
           billTrap3m();
           billTrap3n();
           billTrap3o();
           if(trapStepped){
            try{
            trapStepped=false;    
            synchronized(timer2){
             ouch.setVisible(true);   
             timer2.wait(500);
            } 
            }catch(Exception e){
            System.out.println("Couldn't stop Timer 1: "+e);            
            }
            ouch.setVisible(false);
           }
           
           //Ghost 3a/3b/3c movement:
           
           ghost3aMoveGeneral();
           if(ghost3aDirection.equals("up")){
           ghost3aMoveUp();    
           }else{
           ghost3aMoveDown();    
           }
           
           ghost3bMoveGeneral();
           if(ghost3bDirection.equals("up")){
           ghost3bMoveUp();    
           }else{
           ghost3bMoveDown();    
           }
           
           ghost3cMoveGeneral();
           if(ghost3cDirection.equals("up")){
           ghost3cMoveUp();    
           }else{
           ghost3cMoveDown();    
           }
           
           //checks if ghosts 3a/3b/3c hit Bill:
           if(ghost3aHitBill()||ghost3bHitBill()||ghost3cHitBill()){
             Bill.setLife(Bill.getLife()-1);
             try{
             synchronized(timer2){   
             ouch.setVisible(true);    
             timer2.wait(500);
             }
             }catch(Exception e){
                 System.out.println("Couldn't pause: "+e);
             }
             System.out.println(Bill.getLife());
             ouch.setVisible(false);
           }
           
           //Dogs 3a/3b/3c movement:
           dog3aMoveGeneral();
           if(dog3aDirection.equals("right")){
           dog3aMoveRight();    
           }else{
           dog3aMoveLeft();    
           }
           
           dog3bMoveGeneral();
           if(dog3bDirection.equals("right")){
           dog3bMoveRight();    
           }else{
           dog3bMoveLeft();    
           }
           
           dog3cMoveGeneral();
           if(dog3cDirection.equals("right")){
           dog3cMoveRight();    
           }else{
           dog3cMoveLeft();    
           }
           
           //checks if dogs 3a/3b/3c hit Bill:
           if(dog3aHitBill()||dog3bHitBill()||dog3cHitBill()){
             Bill.setLife(Bill.getLife()-2);
             try{
             synchronized(timer2){ 
             ouch.setVisible(true);    
             timer2.wait(500);
             }
             }catch(Exception e){
                 System.out.println("Couldn't pause: "+e);
             }
             System.out.println(Bill.getLife());
             ouch.setVisible(false);
             }
           
           //checks if Bill still has life:
           gameOver();
           if(gameOver()){
               gameOver.setVisible(true);
               again.setVisible(true);
               highScores();
               showHealth();
               timer2.cancel();
           }
           
           //shows how much health Bill has left:
           showHealth();
           
         }
        };
        timer2.scheduleAtFixedRate(task2,1000,10);//1000ms =1sec
    
    }
    
    public void doorBillLocationChecker(){
       for(int i=-15;i<=15;i++){
           if(bill.getLocation().x+i==door.getLocation().x){
               for(int q=-15;q<=15;q++){
                   if(bill.getLocation().y+q==door.getLocation().y){
                     reachedDoor=true;  
                   }
               }
           }
       }
    }
    
    public void generalBordersLocationChecker(){
      for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q==borderUp.getLocation().y){
                     Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y+1);   
           }
       }
     
      for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q==borderDown.getLocation().y){
                     Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y-1);   
           }
       }
      
      for(int q=-5;q<=5;q++){
                   if(bill.getLocation().x+q==borderLeft.getLocation().x){
                     Main.bill.setLocation(Main.bill.getLocation().x+1,Main.bill.getLocation().y);   
           }
       }
      
      for(int q=-5;q<=5;q++){
                   if(bill.getLocation().x+q==borderRight.getLocation().x){
                     Main.bill.setLocation(Main.bill.getLocation().x-11,Main.bill.getLocation().y);   
           }
       }
      
    }  
    
    public void border1aBillLocationChecker(){
               for(int q=-15;q<=15;q++){
                   if(bill.getLocation().y+q==border1a.getLocation().y){
                     Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y-1);   
           }
       }
    }  
    
    public void border1bBillLocationChecker(){
               for(int q=-15;q<=15;q++){
                   if(bill.getLocation().y+q==border1b.getLocation().y){
                     Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y+1);   
           }
       }     
    }
    
    public void border2aBillLocationChecker(){
              for(int q=-5;q<=5;q++){
                   if((bill.getLocation().x+q)>=130&&(bill.getLocation().x+q)<=300){
                       for(int i=-5;i<=5;i++){
                           if((bill.getLocation().y+i)>=110){
                             bill.setLocation((bill.getLocation().x)-1,bill.getLocation().y);    
                           }
                       } 
           }
       }  
    }
    
    public void border2bBillLocationChecker(){
     for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q>=100&&bill.getLocation().y+q<=220){
                       for(int i=-5;i<=5;i++){
                           if(bill.getLocation().x+i>=130&&bill.getLocation().x+i<=560){
                             Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y-1);    
                           }
                       } 
           }
       }     
    }
    
    public void border2cBillLocationChecker(){
        for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q>=100&&bill.getLocation().y+q<=220){
                       for(int i=-5;i<=5;i++){
                           if(bill.getLocation().x+i<=560&&bill.getLocation().x+i>=130){
                             Main.bill.setLocation(Main.bill.getLocation().x+1,Main.bill.getLocation().y);    
                           }
                       } 
           }
       }     
    }
    
    public void border2dBillLocationChecker(){
        for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q>=290&&bill.getLocation().y+q<=470){
                       for(int i=-5;i<=5;i++){
                           if(bill.getLocation().x+i<=560&&bill.getLocation().x+i>=130){
                             Main.bill.setLocation(Main.bill.getLocation().x+1,Main.bill.getLocation().y);    
                           }
                       } 
           }
       }     
    }
    
    public void border2eBillLocationChecker(){
        for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q<=220&&bill.getLocation().y+q>=100){
                       for(int i=-5;i<=5;i++){
                           if(bill.getLocation().x+i>=370&&bill.getLocation().x+i<=560){
                             Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y+1);    
                           }
                       } 
           }
       }     
    }
    
    public void border2fBillLocationChecker(){
        for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q>=290&&bill.getLocation().y+q<=470){
                       for(int i=-5;i<=5;i++){
                           if(bill.getLocation().x+i<=560&&bill.getLocation().x+i>=370){
                             Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y-1);    
                           }
                       } 
           }
       }     
    }
    
    public void border2gBillLocationChecker(){
        for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q>=220&&bill.getLocation().y+q<=290){
                       for(int i=-5;i<=5;i++){
                           if(bill.getLocation().x+i<=370&&bill.getLocation().x+i>=300){
                             Main.bill.setLocation(Main.bill.getLocation().x+1,Main.bill.getLocation().y);    
                           }
                       } 
           }
       }     
    }
    
    public void border2hBillLocationChecker(){
        for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q<=470&&bill.getLocation().y+q>=400){
                       for(int i=-5;i<=5;i++){
                           if(bill.getLocation().x+i<=560&&bill.getLocation().x+i>=300){
                             Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y+1);    
                           }
                       } 
           }
       }     
    }
    
    public void border2iBillLocationChecker(){
     for(int q=-5;q<=5;q++){
                   if(bill.getLocation().y+q>=470){
                       for(int i=-5;i<=5;i++){
                           if(bill.getLocation().x+i<=300&&bill.getLocation().x+i>=200){
                             Main.bill.setLocation(Main.bill.getLocation().x+1,Main.bill.getLocation().y);    
                           }
                       } 
           }
       }        
    }
    
    public void border3aBillLocationChecker(){
              for(int q=-5;q<=5;q++){
                   if((bill.getLocation().x+q)>=0&&(bill.getLocation().x+q)<=560){
                       for(int i=-5;i<=5;i++){
                           if((bill.getLocation().y+i)>=168&&(bill.getLocation().y+i)<=172){
                               if(bill.getLocation().y<=170&&bill.getLocation().y>=168){
                                   bill.setLocation((bill.getLocation().x),bill.getLocation().y-1);   
                               }else if(bill.getLocation().y<=172&&bill.getLocation().y>170){
                                   bill.setLocation((bill.getLocation().x),bill.getLocation().y+1);
                               }
                           }
                       } 
           }
       }  
    }
    
    public void border3bBillLocationChecker(){
              for(int q=-5;q<=5;q++){
                   if((bill.getLocation().x+q)>=130&&(bill.getLocation().x+q)<=684){
                       for(int i=-5;i<=5;i++){
                           if((bill.getLocation().y+i)>=297&&(bill.getLocation().y+i)<=302){
                               if(bill.getLocation().y<=300&&bill.getLocation().y>=297){
                                  bill.setLocation((bill.getLocation().x),bill.getLocation().y-1); 
                               }else if(bill.getLocation().y<=302&&bill.getLocation().y>300){
                                  bill.setLocation((bill.getLocation().x),bill.getLocation().y+1);  
                               }
                           }
                       } 
           }
       }  
    }
    
    public void border3cBillLocationChecker(){
              for(int q=-5;q<=5;q++){
                   if((bill.getLocation().x+q)>=0&&(bill.getLocation().x+q)<=560){
                       for(int i=-5;i<=5;i++){
                           if((bill.getLocation().y+i)>=437&&(bill.getLocation().y+i)<=442){
                               if(bill.getLocation().y<=440&&bill.getLocation().y>=437){
                                  bill.setLocation((bill.getLocation().x),bill.getLocation().y-1); 
                               }else if(bill.getLocation().y>=442&&bill.getLocation().y>440){
                                  bill.setLocation((bill.getLocation().x),bill.getLocation().y+1);  
                               }
                           }
                       } 
           }
       }  
    }
    
    public void ghost1MoveUp(){
     ghost1.setLocation(ghost1.getLocation().x,ghost1.getLocation().y-1);
    }
    
    public void ghost1MoveDown(){
     ghost1.setLocation(ghost1.getLocation().x,ghost1.getLocation().y+1);   
    }
    
    public void ghost2aMoveUp(){
    ghost2a.setLocation(ghost2a.getLocation().x,ghost2a.getLocation().y-1);    
    }
    
    public void ghost2aMoveDown(){
     ghost2a.setLocation(ghost2a.getLocation().x,ghost2a.getLocation().y+1);   
    }
    
    public void ghost2bMoveUp(){
    ghost2b.setLocation(ghost2b.getLocation().x,ghost2b.getLocation().y-1);    
    }
    
    public void ghost2bMoveDown(){
     ghost2b.setLocation(ghost2b.getLocation().x,ghost2b.getLocation().y+1);   
    }
    
    public void ghost2cMoveUp(){
    ghost2c.setLocation(ghost2c.getLocation().x,ghost2c.getLocation().y-1);    
    }
    
    public void ghost2cMoveDown(){
     ghost2c.setLocation(ghost2c.getLocation().x,ghost2c.getLocation().y+1);   
    }
    
    public void ghost3aMoveDown(){
     ghost3a.setLocation(ghost3a.getLocation().x,ghost3a.getLocation().y+1);   
    }
    
    public void ghost3aMoveUp(){
    ghost3a.setLocation(ghost3a.getLocation().x,ghost3a.getLocation().y-1);    
    }
    
    public void ghost3bMoveDown(){
     ghost3b.setLocation(ghost3b.getLocation().x,ghost3b.getLocation().y+1);   
    }
    
    public void ghost3bMoveUp(){
    ghost3b.setLocation(ghost3b.getLocation().x,ghost3b.getLocation().y-1);    
    }
    
    public void ghost3cMoveDown(){
     ghost3c.setLocation(ghost3c.getLocation().x,ghost3c.getLocation().y+1);   
    }
    
    public void ghost3cMoveUp(){
    ghost3c.setLocation(ghost3c.getLocation().x,ghost3c.getLocation().y-1);    
    }
    
    public void dog3aMoveRight(){
    dog3a.setLocation(dog3a.getLocation().x+2,dog3a.getLocation().y);    
    }
    
    public void dog3aMoveLeft(){
    dog3a.setLocation(dog3a.getLocation().x-2,dog3a.getLocation().y);    
    }
    
    public void dog3bMoveRight(){
    dog3b.setLocation(dog3b.getLocation().x+2,dog3b.getLocation().y);    
    }
    
    public void dog3bMoveLeft(){
    dog3b.setLocation(dog3b.getLocation().x-2,dog3b.getLocation().y);    
    }
    
    public void dog3cMoveRight(){
    dog3c.setLocation(dog3c.getLocation().x+2,dog3c.getLocation().y);    
    }
    
    public void dog3cMoveLeft(){
    dog3c.setLocation(dog3c.getLocation().x-2,dog3c.getLocation().y);    
    }
    
    
    public void ghost1MoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(ghost1.getLocation().y+q==border1a.getLocation().y){
          ghost1Direction="up";
          }  
        if(ghost1.getLocation().y+q==border1b.getLocation().y){
          ghost1Direction="down";
        }
       }
    }
    
    public void ghost2aMoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(ghost2a.getLocation().y+q==border2b.getLocation().y){
          ghost2aDirection="up";
          }  
        if(ghost2a.getLocation().y+q==borderUp.getLocation().y){
          ghost2aDirection="down";
        }
       }
    }
    
    public void ghost2bMoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(ghost2b.getLocation().y+q==border2b.getLocation().y){
          ghost2bDirection="up";
          }  
        if(ghost2b.getLocation().y+q==borderUp.getLocation().y){
          ghost2bDirection="down";
        }
       }
    }
    
    public void ghost2cMoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(ghost2c.getLocation().y+q==borderDown.getLocation().y){
          ghost2cDirection="up";
          }  
        if(ghost2c.getLocation().y+q==border2h.getLocation().y){
          ghost2cDirection="down";
        }
       }
    }
    
    public void ghost3aMoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(ghost3a.getLocation().y+q==border3a.getLocation().y){
          ghost3aDirection="up";
          }  
        if(ghost3a.getLocation().y+q==borderUp.getLocation().y){
          ghost3aDirection="down";
        }
       }
    }
    
    public void ghost3bMoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(ghost3b.getLocation().y+q==borderDown.getLocation().y){
          ghost3bDirection="up";
          }  
        if(ghost3b.getLocation().y+q==border3c.getLocation().y){
          ghost3bDirection="down";
        }
       }
    }
    
    public void ghost3cMoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(ghost3c.getLocation().y+q==borderDown.getLocation().y){
          ghost3cDirection="up";
          }  
        if(ghost3c.getLocation().y+q==border3c.getLocation().y){
          ghost3cDirection="down";
        }
       }
    }
    
    public void dog3aMoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(dog3a.getLocation().x+q==borderLeft.getLocation().x){
          dog3aDirection="right";
          }  
        if(dog3a.getLocation().x+q==borderRight.getLocation().x){
          dog3aDirection="left";
        }
       }
    }
    
    public void dog3bMoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(dog3b.getLocation().x+q==borderLeft.getLocation().x){
          dog3bDirection="right";
          }  
        if(dog3b.getLocation().x+q==borderRight.getLocation().x){
          dog3bDirection="left";
        }
       }
    }
    
    public void dog3cMoveGeneral(){
     for(int q=-15;q<=15;q++){
        if(dog3c.getLocation().x+q==borderLeft.getLocation().x){
          dog3cDirection="right";
          }  
        if(dog3c.getLocation().x+q==borderRight.getLocation().x){
          dog3cDirection="left";
        }
       }
    }
    
    public boolean ghost1HitBill(){
        for(int i=-22;i<=22;i++){
           if(bill.getLocation().x+i==ghost1.getLocation().x){
               for(int q=-22;q<=22;q++){
                   if(bill.getLocation().y+q==ghost1.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;
    }
    
    public boolean ghost2aHitBill(){
        for(int i=-22;i<=22;i++){
           if(bill.getLocation().x+i==ghost2a.getLocation().x){
               for(int q=-22;q<=22;q++){
                   if(bill.getLocation().y+q==ghost2a.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;
    }
    
    public boolean ghost2bHitBill(){
        for(int i=-22;i<=22;i++){
           if(bill.getLocation().x+i==ghost2b.getLocation().x){
               for(int q=-22;q<=22;q++){
                   if(bill.getLocation().y+q==ghost2b.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;
    }
    
    public boolean ghost2cHitBill(){
        for(int i=-22;i<=22;i++){
           if(bill.getLocation().x+i==ghost2c.getLocation().x){
               for(int q=-22;q<=22;q++){
                   if(bill.getLocation().y+q==ghost2c.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;
    }
    
    public boolean ghost3aHitBill(){
        for(int i=-22;i<=22;i++){
           if(bill.getLocation().x+i==ghost3a.getLocation().x){
               for(int q=-22;q<=22;q++){
                   if(bill.getLocation().y+q==ghost3a.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;
    }
    
    public boolean ghost3bHitBill(){
        for(int i=-22;i<=22;i++){
           if(bill.getLocation().x+i==ghost3b.getLocation().x){
               for(int q=-22;q<=22;q++){
                   if(bill.getLocation().y+q==ghost3b.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;
    }
    
    public boolean ghost3cHitBill(){
        for(int i=-22;i<=22;i++){
           if(bill.getLocation().x+i==ghost3c.getLocation().x){
               for(int q=-22;q<=22;q++){
                   if(bill.getLocation().y+q==ghost3c.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;
    }
    
    public boolean dog3aHitBill(){
      for(int i=-10;i<=10;i++){
           if(bill.getLocation().x+i==dog3a.getLocation().x){
               for(int q=-10;q<=10;q++){
                   if(bill.getLocation().y+q==dog3a.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;  
    }
    
    public boolean dog3bHitBill(){
      for(int i=-10;i<=10;i++){
           if(bill.getLocation().x+i==dog3b.getLocation().x){
               for(int q=-10;q<=10;q++){
                   if(bill.getLocation().y+q==dog3b.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;  
    }
    
    public boolean dog3cHitBill(){
      for(int i=-10;i<=10;i++){
           if(bill.getLocation().x+i==dog3c.getLocation().x){
               for(int q=-10;q<=10;q++){
                   if(bill.getLocation().y+q==dog3c.getLocation().y){
                     return true;  
                   }
               }
           }
       }
        return false;  
    }
    
    public void billTrap2a(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap2a.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap2a.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap2b(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap2b.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap2b.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap2c(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap2c.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap2c.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3a(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3a.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3a.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3b(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3b.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3b.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3c(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3c.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3c.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3d(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3d.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3d.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3e(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3e.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3e.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3f(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3f.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3f.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3g(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3g.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3g.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3h(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3h.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3h.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3i(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3i.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3i.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3j(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3j.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3j.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3k(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3k.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3k.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3l(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3l.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3l.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3m(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3m.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3m.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3n(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3n.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3n.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void billTrap3o(){
    for(int i=-12;i<=12;i++){
           if(bill.getLocation().x+i==trap3o.getLocation().x){
               for(int q=-12;q<=12;q++){
                   if(bill.getLocation().y+q==trap3o.getLocation().y){
                     Bill.setLife(Bill.getLife()-1);
                     trapStepped=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }   
    }
    
    public void life1Get(){
      for(int i=-15;i<=15;i++){
           if(bill.getLocation().x+i==life1.getLocation().x){
               for(int q=-15;q<=15;q++){
                   if(bill.getLocation().y+q==life1.getLocation().y){
                     Bill.setLife(Bill.getLife()+1);
                     life1.setVisible(false);
                     getLife=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }  
    }
    
    public void life2Get(){
      for(int i=-15;i<=15;i++){
           if(bill.getLocation().x+i==life2.getLocation().x){
               for(int q=-15;q<=15;q++){
                   if(bill.getLocation().y+q==life2.getLocation().y){
                     Bill.setLife(Bill.getLife()+1);
                     life2.setVisible(false);
                     getLife=true;
                     System.out.println(Bill.getLife());
                   }
               }
           }
       }  
    }
    
    public void showHealth(){
        switch(Bill.getLife()){
            case 0:
                l1.setVisible(false);
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l5.setVisible(false);
                l6.setVisible(false);
                break;
            case 1:
                l1.setVisible(true);
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l5.setVisible(false);
                l6.setVisible(false);
                break;
            case 2:
                l1.setVisible(true);
                l2.setVisible(true);
                l3.setVisible(false);
                l4.setVisible(false);
                l5.setVisible(false);
                l6.setVisible(false);
                break;
            case 3:
                l1.setVisible(true);
                l2.setVisible(true);
                l3.setVisible(true);
                l4.setVisible(false);
                l5.setVisible(false);
                l6.setVisible(false);
                break;
            case 4:
                l1.setVisible(true);
                l2.setVisible(true);
                l3.setVisible(true);
                l4.setVisible(true);
                l5.setVisible(false);
                l6.setVisible(false);
                break;
            case 5:
                l1.setVisible(true);
                l2.setVisible(true);
                l3.setVisible(true);
                l4.setVisible(true);
                l5.setVisible(true);
                l6.setVisible(true);
                break;
            case 6:
                l1.setVisible(true);
                l2.setVisible(true);
                l3.setVisible(true);
                l4.setVisible(true);
                l5.setVisible(true);
                l6.setVisible(true);
                break;
            default:
                l1.setVisible(false);
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l5.setVisible(false);
                l6.setVisible(false);
                break;
        }
                
    }
    
    public boolean gameOver(){
        if(Bill.getLife()<=0){
            System.out.println("Game over");
            return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Database.connect();
                Database.readData();
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton again;
    private javax.swing.JTextField ageInput;
    public static javax.swing.JLabel bill;
    public javax.swing.JLabel border1a;
    public javax.swing.JLabel border1b;
    public javax.swing.JLabel border2a;
    public javax.swing.JLabel border2b;
    public javax.swing.JLabel border2c;
    public javax.swing.JLabel border2d;
    public javax.swing.JLabel border2e;
    public javax.swing.JLabel border2f;
    public javax.swing.JLabel border2g;
    public javax.swing.JLabel border2h;
    public javax.swing.JLabel border2i;
    public javax.swing.JLabel border3a;
    public javax.swing.JLabel border3b;
    public javax.swing.JLabel border3c;
    public javax.swing.JLabel borderDown;
    public javax.swing.JLabel borderLeft;
    public javax.swing.JLabel borderRight;
    public javax.swing.JLabel borderUp;
    public javax.swing.JLabel dog3a;
    public javax.swing.JLabel dog3b;
    public javax.swing.JLabel dog3c;
    public static javax.swing.JLabel door;
    public javax.swing.JLabel font;
    public javax.swing.JLabel gameOver;
    public javax.swing.JLabel ghost1;
    public javax.swing.JLabel ghost2a;
    public javax.swing.JLabel ghost2b;
    public javax.swing.JLabel ghost2c;
    public javax.swing.JLabel ghost3a;
    public javax.swing.JLabel ghost3b;
    public javax.swing.JLabel ghost3c;
    public javax.swing.JDialog highscore;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel l1;
    public javax.swing.JLabel l2;
    public javax.swing.JLabel l3;
    public javax.swing.JLabel l4;
    public javax.swing.JLabel l5;
    public javax.swing.JLabel l6;
    public javax.swing.JLabel life1;
    public javax.swing.JLabel life2;
    public javax.swing.JDialog login;
    public javax.swing.JLabel logo;
    public javax.swing.JLabel ouch;
    public javax.swing.JPasswordField passInput1;
    public javax.swing.JPasswordField passInput2;
    public javax.swing.JLabel trap2a;
    public javax.swing.JLabel trap2b;
    public javax.swing.JLabel trap2c;
    public javax.swing.JLabel trap3a;
    public javax.swing.JLabel trap3b;
    public javax.swing.JLabel trap3c;
    public javax.swing.JLabel trap3d;
    public javax.swing.JLabel trap3e;
    public javax.swing.JLabel trap3f;
    public javax.swing.JLabel trap3g;
    public javax.swing.JLabel trap3h;
    public javax.swing.JLabel trap3i;
    public javax.swing.JLabel trap3j;
    public javax.swing.JLabel trap3k;
    public javax.swing.JLabel trap3l;
    public javax.swing.JLabel trap3m;
    public javax.swing.JLabel trap3n;
    public javax.swing.JLabel trap3o;
    public javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables


    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public  void keyPressed(KeyEvent ke) {
    int keyCode=ke.getKeyCode();
    
    if (keyCode==(KeyEvent.VK_D)) Main.bill.setLocation(Main.bill.getLocation().x+2,Main.bill.getLocation().y);
    if (keyCode==(KeyEvent.VK_RIGHT)) Main.bill.setLocation(Main.bill.getLocation().x+2,Main.bill.getLocation().y);
    if (keyCode==KeyEvent.VK_A) Main.bill.setLocation(Main.bill.getLocation().x-2,Main.bill.getLocation().y);
    if (keyCode==KeyEvent.VK_LEFT) Main.bill.setLocation(Main.bill.getLocation().x-2,Main.bill.getLocation().y);
    if (keyCode==KeyEvent.VK_W) Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y-2);
    if (keyCode==KeyEvent.VK_UP) Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y-2);
    if (keyCode==KeyEvent.VK_S) Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y+2);
    if (keyCode==KeyEvent.VK_DOWN) Main.bill.setLocation(Main.bill.getLocation().x,Main.bill.getLocation().y+2);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }


}

