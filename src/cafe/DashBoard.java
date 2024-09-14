package cafe;

/*
برنامج ادارة مقهى

 */
import java.awt.Image;
import java.awt.print.PrinterException;
import static java.lang.Math.E;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DashBoard extends javax.swing.JFrame {

    private double total = 0.0;
    private int x = 0;
    private double tax = 0.0;

    public void dudata() {
        // Converts values ​​to text values ​​and reduces the number of decimal places to 2.
        tax = getTax(total);
        jTextField3Tax.setText(String.valueOf(String.format("%.2f", tax)));
        jTextField1SubTolal.setText(String.valueOf(String.format("%.2f", total)));
        jTextField2Total.setText(String.valueOf(String.format("%.2f", total + tax)));
    }

    public void init() {
        setImage();
        setTime();
    }

    public double getTax(double t) {
        return tax = t - t * 0.88;
    }

    /*
    timer
    imn this method i do a timer for then looper throught one second.
    It take the time and date and show it on a label
     */
    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE,dd-MM-yyyy");
                    String time = tf.format(date);
                    JTxttime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);

                    JTxtDate.setText(df.format(date));
                }
            }
        }).start();
    }

    /*
    
     */
    public void setImage() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/coldcoffee.jpg"));
        Image img = icon.getImage().getScaledInstance(coldcoffee.getWidth(), coldcoffee.getHeight(), Image.SCALE_SMOOTH);
        coldcoffee.setIcon(new ImageIcon(img));

        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/chickenburger.jpg"));
        Image img1 = icon1.getImage().getScaledInstance(jLabel95.getWidth(), jLabel95.getHeight(), Image.SCALE_SMOOTH);
        jLabel95.setIcon(new ImageIcon(img1));

        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/chickennoodles.jpg"));
        Image img2 = icon2.getImage().getScaledInstance(jLabel101.getWidth(), jLabel101.getHeight(), Image.SCALE_SMOOTH);
        jLabel101.setIcon(new ImageIcon(img2));

        ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/chocolatecake.jpg"));
        Image img3 = icon3.getImage().getScaledInstance(jLabel39.getWidth(), jLabel39.getHeight(), Image.SCALE_SMOOTH);
        jLabel39.setIcon(new ImageIcon(img3));

        ImageIcon icon4 = new ImageIcon(getClass().getResource("/images/chocolatecoffee.jpg"));
        Image img4 = icon4.getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_SMOOTH);
        jLabel15.setIcon(new ImageIcon(img4));

        ImageIcon icon5 = new ImageIcon(getClass().getResource("/images/coke.jpg"));
        Image img5 = icon5.getImage().getScaledInstance(jLabel77.getWidth(), jLabel77.getHeight(), Image.SCALE_SMOOTH);
        jLabel77.setIcon(new ImageIcon(img5));

        ImageIcon icon6 = new ImageIcon(getClass().getResource("/images/fruitscake.jpg"));
        Image img6 = icon6.getImage().getScaledInstance(jLabel71.getWidth(), jLabel71.getHeight(), Image.SCALE_SMOOTH);
        jLabel71.setIcon(new ImageIcon(img6));

        ImageIcon icon7 = new ImageIcon(getClass().getResource("/images/greentea.jpg"));
        Image img7 = icon7.getImage().getScaledInstance(jLabel21.getWidth(), jLabel21.getHeight(), Image.SCALE_SMOOTH);
        jLabel21.setIcon(new ImageIcon(img7));

        ImageIcon icon9 = new ImageIcon(getClass().getResource("/images/orange_juice.jpg"));
        Image img9 = icon9.getImage().getScaledInstance(jLabel113.getWidth(), jLabel113.getHeight(), Image.SCALE_SMOOTH);
        jLabel113.setIcon(new ImageIcon(img9));

        ImageIcon icon10 = new ImageIcon(getClass().getResource("/images/rainbow.jpg"));
        Image img10 = icon10.getImage().getScaledInstance(jLabel51.getWidth(), jLabel51.getHeight(), Image.SCALE_SMOOTH);
        jLabel51.setIcon(new ImageIcon(img10));

        ImageIcon icon11 = new ImageIcon(getClass().getResource("/images/strawberrycake.jpg"));
        Image img11 = icon11.getImage().getScaledInstance(jLabel89.getWidth(), jLabel89.getHeight(), Image.SCALE_SMOOTH);
        jLabel89.setIcon(new ImageIcon(img11));

        ImageIcon icon12 = new ImageIcon(getClass().getResource("/images/vegetarianpizza.jpg"));
        Image img12 = icon12.getImage().getScaledInstance(jLabel45.getWidth(), jLabel45.getHeight(), Image.SCALE_SMOOTH);
        jLabel45.setIcon(new ImageIcon(img12));

        ImageIcon icon13 = new ImageIcon(getClass().getResource("/images/7up.jpg"));
        Image img13 = icon13.getImage().getScaledInstance(jLabel107.getWidth(), jLabel107.getHeight(), Image.SCALE_SMOOTH);
        jLabel107.setIcon(new ImageIcon(img13));

        ImageIcon icon14 = new ImageIcon(getClass().getResource("/images/cappuccinocoffee.jpg"));
        Image img14 = icon14.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        jLabel3.setIcon(new ImageIcon(img14));

        ImageIcon icon8 = new ImageIcon(getClass().getResource("/images/R.jpeg"));
        Image img8 = icon8.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(), Image.SCALE_SMOOTH);
        jLabel27.setIcon(new ImageIcon(img8));

    }

    public boolean gtyIsZero(int qty) {
        // 
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Please Insert the Item quantity");
            return false;
        }
        return true;
    }

    public void royalCafe() {
        int purchaseId = 15020 + (int) (Math.random() * 80800);
        jTextArea1.setText("*************************Royla Cafe*****************\n"
                + "Time: " + JTxttime.getText() + " Date:  " + JTxtDate.getText() + "\n"
                + "Purchase id: " + purchaseId + "\n"
                + "***************************************************************\n"
                + "item name:\t\t\t" + "price($)\n");
    }

    /*
    This method initializes all new request receptions. 
    It makes the quantity values ​​zero.
    It makes the variables values 0zero.
     */
    public void reset() {
        btnTotal.setEnabled(true);
        total = 0;
        x = 0;
        tax = 0.0;
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner7.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner13.setValue(0);
        jSpinner15.setValue(0);
        jSpinner16.setValue(0);
        jSpinner17.setValue(0);
        jSpinner18.setValue(0);
        jSpinner19.setValue(0);

        jTextArea1.setText("");
        jTextField3Tax.setText("0.0");
        jTextField1SubTolal.setText("0.0");
        jTextField2Total.setText("0.0");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox12.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox15.setSelected(false);
        jCheckBox16.setSelected(false);
        jCheckBox17.setSelected(false);
        jCheckBox18.setSelected(false);

    }

    /*
    it statrted the program
    the primary methods start here
     */
    public DashBoard() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTxttime = new javax.swing.JLabel();
        JTxtDate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        coldcoffee = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jSpinner3 = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jSpinner4 = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jSpinner5 = new javax.swing.JSpinner();
        jPanel10 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jSpinner7 = new javax.swing.JSpinner();
        jPanel13 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jSpinner10 = new javax.swing.JSpinner();
        jPanel14 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jSpinner11 = new javax.swing.JSpinner();
        jPanel15 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jSpinner12 = new javax.swing.JSpinner();
        jPanel16 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jSpinner13 = new javax.swing.JSpinner();
        jPanel18 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jCheckBox15 = new javax.swing.JCheckBox();
        jSpinner15 = new javax.swing.JSpinner();
        jPanel19 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jSpinner16 = new javax.swing.JSpinner();
        jPanel20 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jSpinner17 = new javax.swing.JSpinner();
        jPanel21 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jSpinner18 = new javax.swing.JSpinner();
        jPanel22 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jCheckBox19 = new javax.swing.JCheckBox();
        jSpinner19 = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1SubTolal = new javax.swing.JTextField();
        jTextField2Total = new javax.swing.JTextField();
        jTextField3Tax = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        btnResceipt = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 235), 2));

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("Royal Cafe");

        JTxttime.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        JTxttime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        JTxtDate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        JTxtDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTxttime, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTxtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTxttime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu Items");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Cappauccino Coffee");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("$5.0");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Quantily");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Purchese");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSpinner1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel8))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Cold Coffee");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Price");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("$3.0");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Quantily");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Purchese");

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jSpinner2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coldcoffee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(coldcoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSpinner2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel14))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setText("Chocolate Coffee");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Price");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("$4.0");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Quantily");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Purchese");

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jSpinner3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox3)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jSpinner3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jLabel20))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel22.setText("Green Tea");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Price");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("$2.0");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Quantily");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Purchese");

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jSpinner4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel24))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox4)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jSpinner4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel26))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel28.setText("Minirral Water");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Price");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("$0.4");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Quantily");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("Purchese");

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jSpinner5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel30))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox5)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSpinner5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jLabel32))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel40.setText("Chocolate Cake");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Price");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("$8.0");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Quantily");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("Purchese");

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jSpinner7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel42))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox7)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jSpinner7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7)
                    .addComponent(jLabel44))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel46.setText("Vwgwtarian Pizza");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setText("Price");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setText("$1.5");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel49.setText("Quantily");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel50.setText("Purchese");

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jSpinner10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel48))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox10)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jSpinner10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10)
                    .addComponent(jLabel50))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel66.setText("Rainebow Cake");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel67.setText("Price");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel68.setText("$12.0");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel69.setText("Quantily");

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel70.setText("Purchese");

        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jSpinner11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel68))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox11)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jSpinner11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11)
                    .addComponent(jLabel70))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel72.setText("Fruite cake");

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel73.setText("Price");

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel74.setText("$3.0");

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel75.setText("Quantily");

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel76.setText("Purchese");

        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jSpinner12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel74))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox12)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jSpinner12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox12)
                    .addComponent(jLabel76))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel78.setText("Coca Cola");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel79.setText("Price");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel80.setText("$1.5");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel81.setText("Quantily");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel82.setText("Purchese");

        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jSpinner13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel80))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox13)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jSpinner13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox13)
                    .addComponent(jLabel82))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel90.setText("Strsawbery Cake");

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel91.setText("Price");

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel92.setText("$10.0");

        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel93.setText("Quantily");

        jLabel94.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel94.setText("Purchese");

        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jSpinner15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel92))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox15)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jSpinner15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox15)
                    .addComponent(jLabel94))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel96.setText("Chicken burger");

        jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel97.setText("Price");

        jLabel98.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel98.setText("$2.5");

        jLabel99.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel99.setText("Quantily");

        jLabel100.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel100.setText("Purchese");

        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jSpinner16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel98))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox16)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jSpinner16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox16)
                    .addComponent(jLabel100))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel102.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel102.setText("Chicken Noodles");

        jLabel103.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel103.setText("Price");

        jLabel104.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel104.setText("$1.5");

        jLabel105.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel105.setText("Quantily");

        jLabel106.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel106.setText("Purchese");

        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        jSpinner17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel104))
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel106)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox17)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jSpinner17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox17)
                    .addComponent(jLabel106))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel108.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel108.setText("7 UP");

        jLabel109.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel109.setText("Price");

        jLabel110.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel110.setText("$1.4");

        jLabel111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel111.setText("Quantily");

        jLabel112.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel112.setText("Purchese");

        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jSpinner18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel110))
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox18)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jSpinner18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox18)
                    .addComponent(jLabel112))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel114.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel114.setText("Orange Jake");

        jLabel115.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel115.setText("Price");

        jLabel116.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel116.setText("$1.4");

        jLabel117.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel117.setText("Quantily");

        jLabel118.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel118.setText("Purchese");

        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        jSpinner19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner19.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel116))
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jSpinner19, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox19)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jSpinner19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox19)
                    .addComponent(jLabel118))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1SubTolal.setEditable(false);
        jTextField1SubTolal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextField1SubTolal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1SubTolal.setText("0,0");

        jTextField2Total.setEditable(false);
        jTextField2Total.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextField2Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2Total.setText("0,0");

        jTextField3Tax.setEditable(false);
        jTextField3Tax.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextField3Tax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3Tax.setText("0,0");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel33.setText("Tax");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel34.setText("Sub Total");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel35.setText("Total");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2Total, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jTextField1SubTolal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3Tax, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(21, 21, 21))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1SubTolal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(16, 16, 16))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        btnResceipt.setBackground(new java.awt.Color(0, 0, 255));
        btnResceipt.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnResceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnResceipt.setText("Receipt");
        btnResceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResceiptActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 0));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnTotal.setBackground(new java.awt.Color(0, 153, 0));
        btnTotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnTotal.setForeground(new java.awt.Color(255, 255, 255));
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // to end the programm
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //to give all the values and variables the values zero
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnResceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResceiptActionPerformed
       /*
       this print the text feild
        */
        if (total != 0 && !btnTotal.isEnabled()) {
            try {
                jTextArea1.print();
            } catch (PrinterException ex) {
                Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You have n't pasrhesed any product");
        }
    }//GEN-LAST:event_btnResceiptActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        /*
        When you click on the check mark, the program checks the quantity. 
        If it is equal to the zero, the program show a message saying that there are no product.. 
        If the quantity is greater than zero, it calculates the unit price multiplied by the quantity.
        */
        int qty = Integer.parseInt(jSpinner2.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox2.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            //The program adds value to the total price.
            double price = qty * 3.0;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel10.getText() + "\t\t\t" + price + "\n");
            dudata();
        } else {
            jCheckBox2.setSelected(false);
        }

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner1.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox1.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 5.0;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel4.getText() + "\t\t" + price + "\n");
        } else {
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner4.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox4.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 4.0;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel22.getText() + "\t\t" + price + "\n");
        } else {
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner3.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox3.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 2.0;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel16.getText() + "\t\t" + price + "\n");
        } else {
            jCheckBox3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner5.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox5.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 0.4;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel28.getText() + "\t\t\t" + price + "\n");
        } else {
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner15.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox15.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 10.0;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel90.getText() + "\t\t" + price + "\n");
        } else {
            jCheckBox15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner7.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox7.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 8.0;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel40.getText() + "\t\t" + price + "\n");
        } else {
            jCheckBox7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner11.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox11.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 12.0;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel66.getText() + "\t\t" + price + "\n");
        } else {
            jCheckBox11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner12.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox12.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 15.0;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel72.getText() + "\t\t\t" + price + "\n");
        } else {
            jCheckBox12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner13.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox13.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 1.4;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel78.getText() + "\t\t\t" + price + "\n");
        } else {
            jCheckBox13.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner10.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox10.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 1.5;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel46.getText() + "\t\t" + price + "\n");
        } else {
            jCheckBox10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner16.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox16.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 2.5;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel96.getText() + "\t\t" + price + "\n");
            dudata();
        } else {
            jCheckBox16.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner17.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox17.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 1.5;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel102.getText() + "\t\t" + price + "\n");
            dudata();
        } else {
            jCheckBox17.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner18.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox18.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 1.4;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel108.getText() + "\t\t\t" + price + "\n");
        } else {
            jCheckBox18.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner19.getValue().toString());
        if (gtyIsZero(qty) && jCheckBox19.isSelected()) {
            x++;
            if (x == 1) {
                royalCafe();
            }
            double price = qty * 1.4;
            total += price;
            dudata();
            jTextArea1.setText(jTextArea1.getText() + x + ".  " + jLabel114.getText() + "\t\t" + price + "\n");
        } else {
            jCheckBox19.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        if (total == 0.0) {
            JOptionPane.showMessageDialog(null, "You have't selected any items");
        } else {

            String str = Double.toString(total);
            jTextArea1.setText(jTextArea1.getText()
                    + "***************************************************************\n"
                    + "Tax : \t\t\t" + String.format("%.2f", getTax(total)) + "\n"
                    + "Sub Total : \t\t\t" + String.format("%.2f", total) + "\n"
                    + "Total : \t\t\t" + String.format("%.2f", (total + getTax(total))) + "\n\n"
                    + "*************************Tank you*****************\n");
            btnTotal.setEnabled(false);
        }
    }//GEN-LAST:event_btnTotalActionPerformed

    // to move the any way when user click on the title and move the mouse.
    int xx, xy;
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i < 1.0; i += 0.1) {
            String str = i + "";
            float f = Float.valueOf(str);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JTxtDate;
    private javax.swing.JLabel JTxttime;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnResceipt;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JLabel coldcoffee;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1SubTolal;
    private javax.swing.JTextField jTextField2Total;
    private javax.swing.JTextField jTextField3Tax;
    // End of variables declaration//GEN-END:variables
}
