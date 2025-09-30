/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pruebas.calculadorav3;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author leotr
 */
public class VistaCalculadora extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaCalculadora.class.getName());

    public static final Color grisClaro = new Color(229, 229, 229); 
    public static final Color celesteClaro = new Color(207, 232, 255); 
    public static final Color azulCeleste = new Color(56, 182, 255); 
    public static final Color gris = new Color(149, 149, 149); 
    public static final Color negro = new Color(0, 0, 0); 
    public static final Color blanco = new Color(255, 255, 255); 
    
    Funciones fun = new Funciones();
    /**
     * Creates new form VistaCalculadora
     */
    public VistaCalculadora() {
        initComponents();
        setResizable(false);
        diseñoBody();
        diseñoBotonesNumericos();
        diseñoBotonesSimbolos();
        diseñoBotonesHistorial();
        diseñoPantalla();
        diseñoBotonesClear();
        diseñoBotonesMemiria();
    }
    
    private void diseñoBody() {
        pnlBody.setBackground(grisClaro);
        pnlBody.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
     private void diseñoPantalla() {    
        lblPantalla.setFont(new Font("Arial", Font.BOLD, 16));
        lblPantalla.setForeground(negro);
        lblPantalla.setOpaque(true);
        lblPantalla.setBackground(blanco);
        lblPantalla.setHorizontalAlignment(JLabel.RIGHT); 
        lblPantalla.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black, 3), BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    }
    
    private void diseñoBotonesHistorial() {
        btnAumenHis.setText("▲");
        btnAumenHis.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAumenHis.setBackground(gris);
        btnAumenHis.setForeground(negro);
        btnAumenHis.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                
        btnDisHis.setText("▼");
        btnDisHis.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDisHis.setBackground(gris);
        btnDisHis.setForeground(negro);
        btnDisHis.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }
    
    private void diseñoBotonesClear() {
        btnClearE.setText("CE");
        btnClearE.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnClearE.setBackground(celesteClaro);
        btnClearE.setForeground(negro);
        btnClearE.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        btnClear.setText("C");
        btnClear.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnClear.setBackground(celesteClaro);
        btnClear.setForeground(negro);
        btnClear.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }
            
    private void diseñoBotonesSimbolos() {
        btnMul.setText("x");
        btnMul.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMul.setBackground(celesteClaro);
        btnMul.setForeground(negro);
        btnMul.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMul.setFont(new Font("Arial", Font.BOLD, 16));
        btnMul.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        btnDiv.setText("/");
        btnDiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDiv.setBackground(celesteClaro);
        btnDiv.setForeground(negro);
        btnDiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDiv.setFont(new Font("Arial", Font.BOLD, 16));
        btnDiv.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnSum.setText("+");
        btnSum.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSum.setBackground(celesteClaro);
        btnSum.setForeground(negro);
        btnSum.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSum.setFont(new Font("Arial", Font.BOLD, 16));
        btnSum.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        btnRes.setText("-");
        btnRes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRes.setBackground(celesteClaro);
        btnRes.setForeground(negro);
        btnRes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRes.setFont(new Font("Arial", Font.BOLD, 16));
        btnRes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnPor.setText("%");
        btnPor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPor.setBackground(celesteClaro);
        btnPor.setForeground(negro);
        btnPor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPor.setFont(new Font("Arial", Font.BOLD, 16));
        btnPor.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnPunto.setText(".");
        btnPunto.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPunto.setBackground(celesteClaro);
        btnPunto.setForeground(negro);
        btnPunto.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPunto.setFont(new Font("Arial", Font.BOLD, 16));
        btnPunto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnIgual.setText("=");
        btnIgual.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnIgual.setBackground(azulCeleste);
        btnIgual.setForeground(negro);
        btnIgual.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnIgual.setFont(new Font("Arial", Font.BOLD, 16));
        btnIgual.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }
           
    private void diseñoBotonesNumericos() {
        btn0.setText("0");
        btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn0.setBackground(blanco);
        btn0.setForeground(negro);
        btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn0.setFont(new Font("Arial", Font.BOLD, 16));
        btn0.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btn1.setText("1");
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.setBackground(blanco);
        btn1.setForeground(negro);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.setFont(new Font("Arial", Font.BOLD, 16));
        btn1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btn2.setText("2");
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.setBackground(blanco);
        btn2.setForeground(negro);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.setFont(new Font("Arial", Font.BOLD, 16));
        btn2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btn3.setText("3");
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.setBackground(blanco);
        btn3.setForeground(negro);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.setFont(new Font("Arial", Font.BOLD, 16));
        btn3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btn4.setText("4");
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn4.setBackground(blanco);
        btn4.setForeground(negro);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn4.setFont(new Font("Arial", Font.BOLD, 16));
        btn4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btn5.setText("5");
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn5.setBackground(blanco);
        btn5.setForeground(negro);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn5.setFont(new Font("Arial", Font.BOLD, 16));
        btn5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btn6.setText("6");
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn6.setBackground(blanco);
        btn6.setForeground(negro);
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn6.setFont(new Font("Arial", Font.BOLD, 16));
        btn6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btn7.setText("7");
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn7.setBackground(blanco);
        btn7.setForeground(negro);
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn7.setFont(new Font("Arial", Font.BOLD, 16));
        btn7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btn8.setText("8");
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn8.setBackground(blanco);
        btn8.setForeground(negro);
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn8.setFont(new Font("Arial", Font.BOLD, 16));
        btn8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btn9.setText("9");
        btn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn9.setBackground(blanco);
        btn9.setForeground(negro);
        btn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn9.setFont(new Font("Arial", Font.BOLD, 16));
        btn9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    private void diseñoBotonesMemiria() {
        btnMC.setText("MC");
        btnMC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMC.setBackground(azulCeleste);
        btnMC.setForeground(negro);
        btnMC.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnMS.setText("M+");
        btnMS.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMS.setBackground(azulCeleste);
        btnMS.setForeground(negro);
        btnMS.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnMM.setText("M-");
        btnMM.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMM.setBackground(azulCeleste);
        btnMM.setForeground(negro);
        btnMM.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnMR.setText("MR");
        btnMR.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMR.setBackground(azulCeleste);
        btnMR.setForeground(negro);
        btnMR.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBody = new javax.swing.JPanel();
        lblPantalla = new javax.swing.JLabel();
        btnAumenHis = new javax.swing.JButton();
        btnDisHis = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnRes = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnClearE = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMM = new javax.swing.JButton();
        btnPor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAumenHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumenHisActionPerformed(evt);
            }
        });

        btnDisHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisHisActionPerformed(evt);
            }
        });

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });

        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMul.setBorder(null);
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnClearE.setBorder(null);
        btnClearE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearEActionPerformed(evt);
            }
        });

        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnMC.setBorder(null);
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });

        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });

        btnMS.setBorder(null);
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });

        btnMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMMActionPerformed(evt);
            }
        });

        btnPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlBodyLayout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlBodyLayout.createSequentialGroup()
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlBodyLayout.createSequentialGroup()
                            .addComponent(btnClearE, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlBodyLayout.createSequentialGroup()
                            .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnMM, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlBodyLayout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBodyLayout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addComponent(btnAumenHis, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisHis, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAumenHis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisHis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClearE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAumenHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumenHisActionPerformed
        lblPantalla.setText(fun.mostrarHistorial(0));
    }//GEN-LAST:event_btnAumenHisActionPerformed

    private void btnDisHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisHisActionPerformed
        lblPantalla.setText(fun.mostrarHistorial(1));
    }//GEN-LAST:event_btnDisHisActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        fun.clear();
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        fun.setPantalla("/");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnClearEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearEActionPerformed
        fun.clearE();
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btnClearEActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        fun.setPantalla("x");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        lblPantalla.setText(fun.resultado());
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        fun.setPantalla(".");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        fun.setPantalla("0");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed
        fun.setPantalla("-");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btnResActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        fun.setPantalla("9");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        fun.setPantalla("8");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        fun.setPantalla("7");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
       fun.setPantalla("+");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btnSumActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        fun.setPantalla("6");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        fun.setPantalla("5");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        fun.setPantalla("4");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        fun.setPantalla("3");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        fun.setPantalla("2");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        fun.setPantalla("1");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        fun.operacionesMemoria("C");
        lblPantalla.setText("");
    }//GEN-LAST:event_btnMCActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        lblPantalla.setText(fun.mostrarMemoria());
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        fun.operacionesMemoria("S");
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMMActionPerformed
        fun.operacionesMemoria("M");
    }//GEN-LAST:event_btnMMActionPerformed

    private void btnPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorActionPerformed
        fun.setPantalla("%");
        lblPantalla.setText(fun.getPantalla().toString());
    }//GEN-LAST:event_btnPorActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaCalculadora().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAumenHis;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearE;
    private javax.swing.JButton btnDisHis;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMM;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnPor;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRes;
    private javax.swing.JButton btnSum;
    private javax.swing.JLabel lblPantalla;
    private javax.swing.JPanel pnlBody;
    // End of variables declaration//GEN-END:variables
}
