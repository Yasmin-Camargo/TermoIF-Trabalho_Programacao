/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordetemperatura;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yasmi
 */
public class TermoIF extends javax.swing.JFrame {

    int numPergunta, perguntaQuiz = 0, numRespostasCertas = 0, numRespostasErradas = 0;
    int respostaPerguntas[] = new int[9];
    int respostaQuiz[] = new int[9];
    String CertasErradas[] = new String[3];
    boolean Comecarcorrigir = false;
    String nome = null;

    /**
     * Creates new form TermoIF
     */
    public TermoIF() {
        initComponents();
        getContentPane().setBackground(Color.white);
        

        while (nome == null || nome.equals("")) {
            nome = JOptionPane.showInputDialog("Qual o seu nome?", "Digite seu nome aqui.");
            if (nome == null || nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Você não respondeu a pergunta.");
            }
        }
        usuario.setText(nome);

        respostaQuiz[1] = 0;
        respostaQuiz[2] = 0;
        respostaQuiz[3] = 0;
        respostaQuiz[4] = 0;

        CertasErradas[1] = "";
        CertasErradas[2] = "";

        explicacoes.setEnabled(false);
        ver.setEnabled(false);
        recuar.setEnabled(false);
        avancar.setEnabled(false);
        corrigir.setEnabled(false);

    }

    public void Perguntas() {
        //PERGUNTA 1
        numPergunta = 1;
        String nomePergunta = "pergunta";
        nomePergunta = nomePergunta + String.valueOf(numPergunta) + ".txt";
        // criar arquivo
        try {
            java.util.Formatter arquivo = new java.util.Formatter(nomePergunta);
            arquivo.format("Qual a unidade de medida padrão de temperatura do sistema internacional de medidas?");
            arquivo.format("\r\n");
            arquivo.format("Celsius");
            arquivo.format("\r\n");
            arquivo.format("Kelvin");
            arquivo.format("\r\n");
            arquivo.format("Fahrenheit");
            arquivo.format("\r\n");
            arquivo.format("Rankine");
            respostaPerguntas[1] = 2;
            arquivo.close();
        } //mostrando erro em caso se nao for possivel gerar arquivo
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Arquivo nao pode ser gerado!", "Erro", 0);
        }

        //PERGUNTA 2
        nomePergunta = "pergunta";
        numPergunta++;
        nomePergunta = nomePergunta + String.valueOf(numPergunta) + ".txt";
        // criar arquivo
        try {
            java.util.Formatter arquivo = new java.util.Formatter(nomePergunta);
            arquivo.format("Qual a escala termométrica mais utilizada no mundo?");
            arquivo.format("\r\n");
            arquivo.format("Kelvin");
            arquivo.format("\r\n");
            arquivo.format("Rankine");
            arquivo.format("\r\n");
            arquivo.format("Fahrenheit");
            arquivo.format("\r\n");
            arquivo.format("Celsius");
            respostaPerguntas[2] = 4;
            arquivo.close();
        } //mostrando erro em caso se nao for possivel gerar arquivo
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Arquivo nao pode ser gerado!", "Erro", 0);
        }

        //PERGUNTA 3
        nomePergunta = "pergunta";
        numPergunta++;
        nomePergunta = nomePergunta + String.valueOf(numPergunta) + ".txt";
        // criar arquivo
        try {
            java.util.Formatter arquivo = new java.util.Formatter(nomePergunta);
            arquivo.format("Qual é a única a temperatura em que Celsius e Fahrenheit possuem o mesmo valor:");
            arquivo.format("\r\n");
            arquivo.format("-40");
            arquivo.format("\r\n");
            arquivo.format("233");
            arquivo.format("\r\n");
            arquivo.format("68");
            arquivo.format("\r\n");
            arquivo.format("-180");
            arquivo.format("\r\n");
            respostaPerguntas[3] = 1;
            arquivo.close();
        } //mostrando erro em caso se nao for possivel gerar arquivo
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Arquivo nao pode ser gerado!", "Erro", 0);
        }

        //PERGUNTA 4
        nomePergunta = "pergunta";
        numPergunta++;
        nomePergunta = nomePergunta + String.valueOf(numPergunta) + ".txt";
        // criar arquivo
        try {
            java.util.Formatter arquivo = new java.util.Formatter(nomePergunta);
            arquivo.format("Quanto vale o zero absoluto na escala Celsius");
            arquivo.format("\r\n");
            arquivo.format("-273°C");
            arquivo.format("\r\n");
            arquivo.format("273°C");
            arquivo.format("\r\n");
            arquivo.format("173°C");
            arquivo.format("\r\n");
            arquivo.format("-373°C");
            respostaPerguntas[4] = 1;
            arquivo.close();
        } //mostrando erro em caso se nao for possivel gerar arquivo
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Arquivo nao pode ser gerado!", "Erro", 0);
        }

        //PERGUNTA 5
        nomePergunta = "pergunta";
        numPergunta++;
        nomePergunta = nomePergunta + String.valueOf(numPergunta) + ".txt";
        // criar arquivo
        try {
            java.util.Formatter arquivo = new java.util.Formatter(nomePergunta);
            arquivo.format("Um doente está com febre de 42°C. Qual sua temperatura expressa na escala Kelvin e Fahrenheit?");
            arquivo.format("\r\n");
            arquivo.format("331 K e 95°F");
            arquivo.format("\r\n");
            arquivo.format("315 K e 108°F");
            arquivo.format("\r\n");
            arquivo.format("110 K e 134°F");
            arquivo.format("\r\n");
            respostaPerguntas[5] = 2;
            arquivo.format("Nenhuma das alternativas");
            arquivo.close();
        } //mostrando erro em caso se nao for possivel gerar arquivo
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Arquivo nao pode ser gerado!", "Erro", 0);
        }

        //PERGUNTA 6
        nomePergunta = "pergunta";
        numPergunta++;
        nomePergunta = nomePergunta + String.valueOf(numPergunta) + ".txt";
        // criar arquivo
        try {
            java.util.Formatter arquivo = new java.util.Formatter(nomePergunta);
            arquivo.format("Na física, qual afirmação abaixo está relacionada com o calor:");
            arquivo.format("\r\n");
            arquivo.format("É o estado de agitação das moléculas");
            arquivo.format("\r\n");
            arquivo.format("É quando dois corpos atingem a mesma temperatura");
            arquivo.format("\r\n");
            arquivo.format("É a transferência de energia em trânsito entre dois corpos");
            arquivo.format("\r\n");
            arquivo.format("Nenhuma das alternativas");
            respostaPerguntas[6] = 3;
            arquivo.close();
        } //mostrando erro em caso se nao for possivel gerar arquivo
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Arquivo nao pode ser gerado!", "Erro", 0);
        }

        //PERGUNTA 7
        nomePergunta = "pergunta";
        numPergunta++;
        nomePergunta = nomePergunta + String.valueOf(numPergunta) + ".txt";
        // criar arquivo
        try {
            java.util.Formatter arquivo = new java.util.Formatter(nomePergunta);
            arquivo.format("Sobre capacidade térmica, é correto afirmar que:");
            arquivo.format("\r\n");
            arquivo.format("A capacidade térmica está relacionado apenas pelo material que o corpo é constituído");
            arquivo.format("\r\n");
            arquivo.format("A areia possui alta capacidade térmica");
            arquivo.format("\r\n");
            arquivo.format("A unidade de medida no SI é cal/°C");
            arquivo.format("\r\n");
            arquivo.format("O ganho e a perda de calor estão relacionados com capacidade térmica");
            respostaPerguntas[7] = 4;
            arquivo.close();
        } //mostrando erro em caso se nao for possivel gerar arquivo
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Arquivo nao pode ser gerado!", "Erro", 0);
        }

        //PERGUNTA 8
        nomePergunta = "pergunta";
        numPergunta++;
        nomePergunta = nomePergunta + String.valueOf(numPergunta) + ".txt";
        // criar arquivo
        try {
            java.util.Formatter arquivo = new java.util.Formatter(nomePergunta);
            arquivo.format("Na física como costumamos utilizar os conceitos “quente” e “frio”:");
            arquivo.format("\r\n");
            arquivo.format("Geralmente não são utilizados, pois são termos que variam de pessoa para pessoa");
            arquivo.format("\r\n");
            arquivo.format("Quando a temperatura está acima de 20 °C é considerada como quente, já quando está abaixo de 20 °C é considerada frio");
            arquivo.format("\r\n");
            arquivo.format("Os termos quente e frio são utilizados respectivamente quando a temperatura se encontra próxima de zero  e acima 40 °C");
            arquivo.format("\r\n");
            arquivo.format("Nenhuma das alternativas está correta");
            respostaPerguntas[8] = 1;
            arquivo.close();
        } //mostrando erro em caso se nao for possivel gerar arquivo
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Arquivo nao pode ser gerado!", "Erro", 0);
        }

    }

    public void MostraPergunta() {

        alternativa.clearSelection();
        String mostra = "";
        String linha = "";
        int cont = 1;

        String nomePergunta = "pergunta";
        nomePergunta = nomePergunta + String.valueOf(perguntaQuiz) + ".txt";

        File arq = new File(nomePergunta);

        //Arquivo existe
        if (arq.exists()) {

            //tentando ler arquivo
            try {
                //abrindo arquivo para leitura
                FileReader reader = new FileReader(nomePergunta);
                //leitor do arquivo
                BufferedReader leitor = new BufferedReader(reader);
                while (true) {
                    linha = leitor.readLine();
                    if (linha == null) {
                        break;
                    }
                    if (cont == 1) {
                        enunciado.setText(linha);
                    } else if (cont == 2) {
                        respA.setText(linha);
                    } else if (cont == 3) {
                        respB.setText(linha);
                    } else if (cont == 4) {
                        respC.setText(linha);
                    } else if (cont == 5) {
                        respD.setText(linha);
                    }
                    cont++;
                }
            } catch (Exception erro) {
            }
        } //Se nao existir
        else {
            JOptionPane.showMessageDialog(null, "NÃO HÁ MAIS PERGUNTAS");
        }

        if (respostaQuiz[perguntaQuiz] == 1) {
            a.setSelected(true);
        } else if (respostaQuiz[perguntaQuiz] == 2) {
            b.setSelected(true);
        } else if (respostaQuiz[perguntaQuiz] == 3) {
            c.setSelected(true);
        } else if (respostaQuiz[perguntaQuiz] == 4) {
            d.setSelected(true);
        }

    }

    public void CorrigePergunta() {

        if (respostaPerguntas[perguntaQuiz] == 1) {
            respA.setBackground(Color.green);
            respB.setBackground(Color.red);
            respC.setBackground(Color.red);
            respD.setBackground(Color.red);
        } else if (respostaPerguntas[perguntaQuiz] == 2) {
            respA.setBackground(Color.red);
            respB.setBackground(Color.green);
            respC.setBackground(Color.red);
            respD.setBackground(Color.red);
        } else if (respostaPerguntas[perguntaQuiz] == 3) {
            respA.setBackground(Color.red);
            respB.setBackground(Color.red);
            respC.setBackground(Color.green);
            respD.setBackground(Color.red);
        } else if (respostaPerguntas[perguntaQuiz] == 4) {
            respA.setBackground(Color.red);
            respB.setBackground(Color.red);
            respC.setBackground(Color.red);
            respD.setBackground(Color.green);
        }

        if (respostaQuiz[1] == respostaPerguntas[1]) {
            numRespostasCertas++;
            CertasErradas[1] = CertasErradas[1] + "Pergunta 1 \n";
        } else {
            numRespostasErradas++;
            CertasErradas[2] = CertasErradas[2] + "Pergunta 1 \n ";
        }
        if (respostaQuiz[2] == respostaPerguntas[2]) {
            numRespostasCertas++;
            CertasErradas[1] = CertasErradas[1] + "Pergunta 2 \n ";
        } else {
            numRespostasErradas++;
            CertasErradas[2] = CertasErradas[2] + "Pergunta 2\n ";
        }
        if (respostaQuiz[3] == respostaPerguntas[3]) {
            numRespostasCertas++;
            CertasErradas[1] = CertasErradas[1] + "Pergunta 3 \n ";
        } else {
            numRespostasErradas++;
            CertasErradas[2] = CertasErradas[2] + "Pergunta 3\n ";
        }
        if (respostaQuiz[4] == respostaPerguntas[4]) {
            numRespostasCertas++;
            CertasErradas[1] = CertasErradas[1] + "Pergunta 4\n ";
        } else {
            numRespostasErradas++;
            CertasErradas[2] = CertasErradas[2] + "Pergunta 4\n ";
        }
        if (respostaQuiz[5] == respostaPerguntas[5]) {
            numRespostasCertas++;
            CertasErradas[1] = CertasErradas[1] + "Pergunta 5\n ";
        } else {
            numRespostasErradas++;
            CertasErradas[2] = CertasErradas[2] + "Pergunta 5\n ";
        }
        if (respostaQuiz[6] == respostaPerguntas[6]) {
            numRespostasCertas++;
            CertasErradas[1] = CertasErradas[1] + "Pergunta 6\n ";
        } else {
            numRespostasErradas++;
            CertasErradas[2] = CertasErradas[2] + "Pergunta 6\n ";
        }
        if (respostaQuiz[7] == respostaPerguntas[7]) {
            numRespostasCertas++;
            CertasErradas[1] = CertasErradas[1] + "Pergunta 7\n ";
        } else {
            numRespostasErradas++;
            CertasErradas[2] = CertasErradas[2] + "Pergunta 7\n ";
        }
        if (respostaQuiz[8] == respostaPerguntas[8]) {
            numRespostasCertas++;
            CertasErradas[1] = CertasErradas[1] + "Pergunta 8\n ";
        } else {
            numRespostasErradas++;
            CertasErradas[2] = CertasErradas[2] + "Pergunta 8\n ";
        }
    }

    public void historico() throws IOException {
        FileWriter arquivo;
        arquivo = new FileWriter(new File("historico.txt"), true);
        arquivo.write("\r\n\r\n\r\n");
        arquivo.write("\r\n------ HISTÓRICO DE PERGUNTAS ------ \r\n");
        arquivo.write("\r\nNOME: " + nome);
        arquivo.write("\r\n -> ");
        arquivo.write(String.valueOf(numRespostasCertas));
        arquivo.write(" RESPOSTAS CORRETAS: \n");
        arquivo.write(CertasErradas[1]);
        arquivo.write("\r\n -> ");
        arquivo.write(String.valueOf(numRespostasErradas));
        arquivo.write(" RESPOSTAS ERRADAS: \n");
        arquivo.write(CertasErradas[2]);
        arquivo.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alternativa = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        moveKelvin = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        moveCelsius = new javax.swing.JSlider();
        moveFahrenheit = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        celsius = new javax.swing.JTextField();
        kelvin = new javax.swing.JTextField();
        fahrenheit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        numPerguntaFinal = new javax.swing.JTextField();
        enunciado = new javax.swing.JLabel();
        respD = new javax.swing.JTextField();
        d = new javax.swing.JRadioButton();
        a = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        c = new javax.swing.JRadioButton();
        numPerguntaInicio = new javax.swing.JTextField();
        respA = new javax.swing.JTextField();
        respB = new javax.swing.JTextField();
        respC = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        avancar = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();
        corrigir = new javax.swing.JButton();
        recuar = new javax.swing.JButton();
        explicacoes = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        ver = new javax.swing.JButton();
        barra = new javax.swing.JProgressBar();
        resumo = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historico = new javax.swing.JTextArea();
        verHistorico = new javax.swing.JButton();
        excluirHistorico = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        corLetra = new javax.swing.JList<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        corFundo = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane2.setToolTipText("");
        jTabbedPane2.setMaximumSize(new java.awt.Dimension(750, 440));
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(750, 440));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(750, 440));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(750, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 440));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        jLabel1.setText("°F");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(990, 370, 140, 40);

        moveKelvin.setBackground(new java.awt.Color(255, 255, 255));
        moveKelvin.setForeground(new java.awt.Color(0, 0, 255));
        moveKelvin.setMaximum(629);
        moveKelvin.setMinorTickSpacing(10);
        moveKelvin.setPaintTicks(true);
        moveKelvin.setSnapToTicks(true);
        moveKelvin.setValue(273);
        moveKelvin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moveKelvin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveKelvinMouseDragged(evt);
            }
        });
        jPanel1.add(moveKelvin);
        moveKelvin.setBounds(120, 250, 930, 40);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30)); // NOI18N
        jLabel2.setText("KELVIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 210, 250, 29);

        moveCelsius.setBackground(new java.awt.Color(255, 255, 255));
        moveCelsius.setForeground(new java.awt.Color(0, 0, 255));
        moveCelsius.setMaximum(356);
        moveCelsius.setMinimum(-273);
        moveCelsius.setMinorTickSpacing(10);
        moveCelsius.setPaintLabels(true);
        moveCelsius.setPaintTicks(true);
        moveCelsius.setSnapToTicks(true);
        moveCelsius.setValue(0);
        moveCelsius.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moveCelsius.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveCelsiusMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                moveCelsiusMouseMoved(evt);
            }
        });
        moveCelsius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                moveCelsiusMouseEntered(evt);
            }
        });
        jPanel1.add(moveCelsius);
        moveCelsius.setBounds(110, 100, 930, 40);

        moveFahrenheit.setBackground(new java.awt.Color(255, 255, 255));
        moveFahrenheit.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        moveFahrenheit.setForeground(new java.awt.Color(0, 0, 255));
        moveFahrenheit.setMaximum(673);
        moveFahrenheit.setMinimum(-459);
        moveFahrenheit.setMinorTickSpacing(18);
        moveFahrenheit.setPaintLabels(true);
        moveFahrenheit.setPaintTicks(true);
        moveFahrenheit.setSnapToTicks(true);
        moveFahrenheit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moveFahrenheit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveFahrenheitMouseDragged(evt);
            }
        });
        jPanel1.add(moveFahrenheit);
        moveFahrenheit.setBounds(130, 420, 930, 60);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30)); // NOI18N
        jLabel3.setText("FAHRENHEIT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 380, 280, 29);

        celsius.setEditable(false);
        celsius.setBackground(new java.awt.Color(255, 255, 255));
        celsius.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30)); // NOI18N
        celsius.setForeground(new java.awt.Color(255, 0, 51));
        celsius.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        celsius.setText("0");
        celsius.setBorder(null);
        celsius.setCaretColor(new java.awt.Color(255, 255, 255));
        celsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celsiusActionPerformed(evt);
            }
        });
        jPanel1.add(celsius);
        celsius.setBounds(820, 40, 160, 40);

        kelvin.setEditable(false);
        kelvin.setBackground(new java.awt.Color(255, 255, 255));
        kelvin.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30)); // NOI18N
        kelvin.setForeground(new java.awt.Color(255, 0, 51));
        kelvin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        kelvin.setText("273");
        kelvin.setBorder(null);
        kelvin.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(kelvin);
        kelvin.setBounds(920, 200, 70, 40);

        fahrenheit.setEditable(false);
        fahrenheit.setBackground(new java.awt.Color(255, 255, 255));
        fahrenheit.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30)); // NOI18N
        fahrenheit.setForeground(new java.awt.Color(255, 0, 51));
        fahrenheit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fahrenheit.setText("32");
        fahrenheit.setBorder(null);
        fahrenheit.setCaretColor(new java.awt.Color(255, 255, 255));
        fahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitActionPerformed(evt);
            }
        });
        jPanel1.add(fahrenheit);
        fahrenheit.setBounds(910, 370, 70, 40);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("273");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(510, 290, 50, 20);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("629");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1030, 290, 40, 20);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("356");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1020, 140, 34, 17);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("0");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 140, 40, 20);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("-273");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 140, 40, 17);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("673");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1040, 480, 40, 20);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("0");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(130, 290, 40, 20);

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("-459");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(130, 480, 40, 20);

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("32");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(540, 480, 40, 20);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30)); // NOI18N
        jLabel13.setText("CELSIUS");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(70, 40, 300, 29);

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        jLabel14.setText("°C");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(990, 40, 140, 37);

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        jLabel15.setText("K");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1000, 200, 150, 40);

        jTabbedPane2.addTab("Escalas", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        numPerguntaFinal.setEditable(false);
        numPerguntaFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numPerguntaFinal.setText("8");
        numPerguntaFinal.setToolTipText("");
        numPerguntaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPerguntaFinalActionPerformed(evt);
            }
        });
        jPanel4.add(numPerguntaFinal);
        numPerguntaFinal.setBounds(220, 40, 60, 30);

        enunciado.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        enunciado.setForeground(new java.awt.Color(255, 0, 51));
        enunciado.setText("QUIZ");
        jPanel4.add(enunciado);
        enunciado.setBounds(50, 110, 910, 60);

        respD.setEditable(false);
        respD.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        respD.setForeground(new java.awt.Color(51, 0, 255));
        respD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        respD.setToolTipText("");
        respD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respDActionPerformed(evt);
            }
        });
        jPanel4.add(respD);
        respD.setBounds(130, 420, 750, 50);

        d.setBackground(new java.awt.Color(255, 255, 255));
        alternativa.add(d);
        d.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 11)); // NOI18N
        d.setText("D");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        jPanel4.add(d);
        d.setBounds(80, 420, 50, 23);

        a.setBackground(new java.awt.Color(255, 255, 255));
        alternativa.add(a);
        a.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 11)); // NOI18N
        a.setText("A");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel4.add(a);
        a.setBounds(80, 210, 40, 23);

        b.setBackground(new java.awt.Color(255, 255, 255));
        alternativa.add(b);
        b.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 11)); // NOI18N
        b.setText("B");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        jPanel4.add(b);
        b.setBounds(80, 280, 50, 23);

        c.setBackground(new java.awt.Color(255, 255, 255));
        alternativa.add(c);
        c.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 11)); // NOI18N
        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel4.add(c);
        c.setBounds(80, 350, 50, 23);

        numPerguntaInicio.setEditable(false);
        numPerguntaInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numPerguntaInicio.setText("1");
        numPerguntaInicio.setToolTipText("");
        numPerguntaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPerguntaInicioActionPerformed(evt);
            }
        });
        jPanel4.add(numPerguntaInicio);
        numPerguntaInicio.setBounds(119, 40, 60, 30);

        respA.setEditable(false);
        respA.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        respA.setForeground(new java.awt.Color(51, 0, 255));
        respA.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        respA.setToolTipText("");
        respA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respAActionPerformed(evt);
            }
        });
        jPanel4.add(respA);
        respA.setBounds(130, 210, 750, 50);

        respB.setEditable(false);
        respB.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        respB.setForeground(new java.awt.Color(51, 0, 255));
        respB.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        respB.setToolTipText("");
        respB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respBActionPerformed(evt);
            }
        });
        jPanel4.add(respB);
        respB.setBounds(130, 280, 750, 50);

        respC.setEditable(false);
        respC.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        respC.setForeground(new java.awt.Color(51, 0, 255));
        respC.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        respC.setToolTipText("");
        respC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respCActionPerformed(evt);
            }
        });
        jPanel4.add(respC);
        respC.setBounds(130, 350, 750, 50);

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel18.setText("PERGUNTA");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(40, 40, 80, 30);

        avancar.setBackground(new java.awt.Color(255, 255, 255));
        avancar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        avancar.setText("->");
        avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarActionPerformed(evt);
            }
        });
        jPanel4.add(avancar);
        avancar.setBounds(1050, 390, 120, 60);

        iniciar.setBackground(new java.awt.Color(102, 255, 102));
        iniciar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        jPanel4.add(iniciar);
        iniciar.setBounds(970, 220, 130, 50);

        corrigir.setBackground(new java.awt.Color(102, 255, 102));
        corrigir.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        corrigir.setText("Corrigir");
        corrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrigirActionPerformed(evt);
            }
        });
        jPanel4.add(corrigir);
        corrigir.setBounds(970, 290, 130, 50);

        recuar.setBackground(new java.awt.Color(255, 255, 255));
        recuar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        recuar.setText("<-");
        recuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuarActionPerformed(evt);
            }
        });
        jPanel4.add(recuar);
        recuar.setBounds(920, 390, 120, 60);

        explicacoes.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 11)); // NOI18N
        explicacoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pergunta1", "Pergunta2", "Pergunta3", "Pergunta4", "Pergunta5", "Pergunta6", "Pergunta7", "Pergunta8" }));
        explicacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explicacoesActionPerformed(evt);
            }
        });
        jPanel4.add(explicacoes);
        explicacoes.setBounds(900, 90, 120, 50);

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel17.setText("de");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(190, 40, 30, 30);

        ver.setBackground(new java.awt.Color(255, 255, 255));
        ver.setText("Ver Explicação");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        jPanel4.add(ver);
        ver.setBounds(1030, 90, 120, 50);

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.setForeground(new java.awt.Color(51, 51, 51));
        barra.setMaximum(8);
        barra.setBorderPainted(false);
        barra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barra.setStringPainted(true);
        jPanel4.add(barra);
        barra.setBounds(100, 530, 880, 17);

        jTabbedPane2.addTab("Quiz", jPanel4);

        resumo.setBackground(new java.awt.Color(255, 255, 255));
        resumo.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel19.setText("Histórico de Perguntas QUIZ");
        resumo.add(jLabel19);
        jLabel19.setBounds(90, 40, 410, 60);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        historico.setEditable(false);
        historico.setColumns(20);
        historico.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        historico.setRows(5);
        jScrollPane1.setViewportView(historico);

        resumo.add(jScrollPane1);
        jScrollPane1.setBounds(90, 100, 600, 430);

        verHistorico.setBackground(new java.awt.Color(255, 255, 255));
        verHistorico.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        verHistorico.setText("Ver Histórico");
        verHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verHistoricoActionPerformed(evt);
            }
        });
        resumo.add(verHistorico);
        verHistorico.setBounds(770, 170, 160, 60);

        excluirHistorico.setBackground(new java.awt.Color(255, 102, 102));
        excluirHistorico.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        excluirHistorico.setText("Excluir Histórico");
        excluirHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirHistoricoActionPerformed(evt);
            }
        });
        resumo.add(excluirHistorico);
        excluirHistorico.setBounds(970, 170, 160, 60);

        usuario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        resumo.add(usuario);
        usuario.setBounds(870, 90, 220, 40);

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel20.setText("Cor da letra");
        resumo.add(jLabel20);
        jLabel20.setBounds(960, 330, 120, 40);

        corLetra.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 11)); // NOI18N
        corLetra.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Branco", "Preto", "Azul", "Rosa", "Verde", "Amarelo", "Laranja", "Vermelho" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(corLetra);

        resumo.add(jScrollPane3);
        jScrollPane3.setBounds(940, 370, 140, 160);

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel21.setText("PERSONALIZAÇÃO - Histórico");
        resumo.add(jLabel21);
        jLabel21.setBounds(740, 270, 210, 40);

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel23.setText("Cor de fundo");
        resumo.add(jLabel23);
        jLabel23.setBounds(810, 330, 120, 40);

        corFundo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 11)); // NOI18N
        corFundo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Branco", "Preto", "Azul", "Rosa", "Verde", "Amarelo", "Laranja", "Vermelho" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(corFundo);

        resumo.add(jScrollPane4);
        jScrollPane4.setBounds(790, 370, 130, 160);
        resumo.add(jSeparator1);
        jSeparator1.setBounds(750, 320, 370, 10);

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel24.setText("Usuário Atual:");
        resumo.add(jLabel24);
        jLabel24.setBounds(770, 90, 120, 40);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 11)); // NOI18N
        jButton1.setText("Aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        resumo.add(jButton1);
        jButton1.setBounds(1100, 463, 80, 40);

        jTabbedPane2.addTab("Histórico", resumo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1216, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
        int indice = 0;
        indice = explicacoes.getSelectedIndex();

        if (indice == 0) {
            JOptionPane.showMessageDialog(null, "PERGUNTA 1:\n\n"
                    + "A unidade de medida de temperatura do SI é o Kelvin. "
                    + "\nO principal motivo é que a escala Kelvin não possui números negativos, e dessa forma facilita o processo de comunicação entre diferentes países.");
        } else if (indice == 1) {
            JOptionPane.showMessageDialog(null, "PERGUNTA 2:\n\n"
                    + "A escala termométrica mais utilizada é a escala Celsius.\n"
                    + "Uma vez que ela possui valores mais cômodos que as outras escalas, "
                    + "e isso faz com que ela seja mais fácil de utilizar no dia a dia.");
        } else if (indice == 2) {
            JOptionPane.showMessageDialog(null, "PERGUNTA 3:\n\n"
                    + "Como queremos encontrar o mesmo valor para Fahrenheit e Celsius, F = C, podemos reescrever a equação dessa forma:\n"
                    + "C = C - 32\n"
                    + "5        9\n\n"
                    + "9C = 5(C-32)\n"
                    + "9C = 5C - 160\n"
                    + "9C - 5C = -160\n"
                    + "4C = -160\n"
                    + "C = -160\n"
                    + "        4\n"
                    + "C = - 40ºC");
        } else if (indice == 3) {
            JOptionPane.showMessageDialog(null, "PERGUNTA 4:\n\n"
                    + "C = K - 273\n"
                    + "5        5  \n"
                    + "\n"
                    + "\n"
                    + "C = 0 - 273\n"
                    + "C = -273°C");
        } else if (indice == 4) {
            JOptionPane.showMessageDialog(null, "PERGUNTA 5:\n\n"
                    + "C = K - 273                                   C = F - 32                        \n"
                    + "5        5                                          5        9\n"
                    + "\n"
                    + "\n"
                    + "42 = K - 273                                 42 = F - 32\n"
                    + "42 + 273 = K                                 5        9\n"
                    + "K = 315 K\n"
                    + "                                                    5(F - 32) = 42*9\n"
                    + "                                                    5F -160 = 378\n"
                    + "                                                    5F = 378 + 160\n"
                    + "                                                    F = 538\n"
                    + "                                                            5\n"
                    + "                                                    F= 107,6\n"
                    + "                                                    F= 108°F");
        } else if (indice == 5) {
            JOptionPane.showMessageDialog(null, "PERGUNTA 6:\n\n"
                    + "a) Esta afirmação é referente ao calor, sempre que um corpo possuir maior temperatura irá transferir energia para o corpo que possuir menor temperatura, \n"
                    + "essa energia que está sendo transferida é denominado calor.\n"
                    + "b) Esta afirmação é referente a temperatura, quanto mais agitadas elas estiverem, maior é a temperatura. Logo, quanto menos agitadas estiverem menor é a temperatura.\n"
                    + "c) Esta afirmação é referente ao equilíbrio térmico, quando corpos de temperaturas diferentes atingem a mesma temperatura (equilíbrio térmico)");
        } else if (indice == 6) {
            JOptionPane.showMessageDialog(null, "PERGUNTA 7:\n\n"
                    + "a) Verdadeiro, pois a capacidade térmica irá determinar a quantidade de energia que um corpo precisa ganhar ou perder para que ocorra uma variação da sua temperatura.\n"
                    + "b) Falso, pois dois corpos feitos do mesmo material podem sofrer variações de temperatura diferentes ao receberem a mesma quantidade de calor se suas massas são diferentes. \n"
                    + "Por exemplo: se quisermos aquecer duas chapas de metal, uma com 5 kg e outra com 10 kg, será necessário fornecer maior quantidade de calor à chapa de 10 kg, já que sua massa é maior.\n"
                    + "c) Falso,  a areia tem facilidade de aquecer e perder temperatura, dizemos então que esse corpo tem baixa capacidade térmica.\n"
                    + "d) Falso, esta unidade é bastante utilizada porém no SI a capacidade térmica é medida em J/K\n"
                    + "");
        } else if (indice == 7) {
            JOptionPane.showMessageDialog(null, "PERGUNTA 8:\n\n"
                    + "A resposta a está correta, pois esses termos variam de pessoa para pessoa. \n"
                    + "Uma pessoa que mora em locais mais frios, como por exemplo a Antártica, possui uma perspectiva do frio, já que está acostumada com temperaturas negativas.\n"
                    + "Diferentemente de outra pessoa que mora no Rio de Janeiro, onde o clima é mais quente.");
        }

    }//GEN-LAST:event_verActionPerformed

    private void explicacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explicacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_explicacoesActionPerformed

    private void recuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuarActionPerformed
        // TODO add your handling code here:
        if (a.isSelected()) {
            respostaQuiz[perguntaQuiz] = 1;
        } else if (b.isSelected()) {
            respostaQuiz[perguntaQuiz] = 2;
        } else if (c.isSelected()) {
            respostaQuiz[perguntaQuiz] = 3;
        } else if (d.isSelected()) {
            respostaQuiz[perguntaQuiz] = 4;
        }

        if (perguntaQuiz <= 1) {
            perguntaQuiz = 1;
        } else {
            perguntaQuiz--;
        }

        numPerguntaInicio.setText(String.valueOf(perguntaQuiz));
        MostraPergunta();
        barra.setValue(perguntaQuiz);

        if (Comecarcorrigir == true) {
            CorrigePergunta();
        }
        explicacoes.setSelectedIndex(perguntaQuiz-1);
    }//GEN-LAST:event_recuarActionPerformed

    private void corrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrigirActionPerformed
        // TODO add your handling code here:
        Comecarcorrigir = true;

        explicacoes.setEnabled(true);
        ver.setEnabled(true);
        iniciar.setEnabled(true);
        moveCelsius.setEnabled(true);
        moveKelvin.setEnabled(true);
        moveFahrenheit.setEnabled(true);
        corrigir.setEnabled(false);
        

        CorrigePergunta();
        try {
            historico();

        } catch (IOException ex) {
            Logger.getLogger(TermoIF.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        explicacoes.setSelectedIndex(perguntaQuiz-1);

    }//GEN-LAST:event_corrigirActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        // TODO add your handling code here:
        explicacoes.setEnabled(false);
        ver.setEnabled(false);
        iniciar.setEnabled(false);
        moveCelsius.setEnabled(false);
        moveKelvin.setEnabled(false);
        moveFahrenheit.setEnabled(false);
        recuar.setEnabled(true);
        avancar.setEnabled(true);
        corrigir.setEnabled(true);

        respA.setBackground(Color.white);
        respB.setBackground(Color.white);
        respC.setBackground(Color.white);
        respD.setBackground(Color.white);
        numRespostasCertas = 0;
        numRespostasErradas = 0;
        respostaQuiz[1] = 0;
        respostaQuiz[2] = 0;
        respostaQuiz[3] = 0;
        respostaQuiz[4] = 0;
        respostaQuiz[5] = 0;
        respostaQuiz[6] = 0;
        respostaQuiz[7] = 0;
        respostaQuiz[8] = 0;
        Comecarcorrigir = false;
        CertasErradas[1] = "";
        CertasErradas[2] = "";

        Perguntas();
        perguntaQuiz = 1;
        MostraPergunta();
        barra.setValue(perguntaQuiz);


    }//GEN-LAST:event_iniciarActionPerformed

    private void avancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarActionPerformed
        // TODO add your handling code here:
        
        if (a.isSelected()) {
            respostaQuiz[perguntaQuiz] = 1;
        } else if (b.isSelected()) {
            respostaQuiz[perguntaQuiz] = 2;
        } else if (c.isSelected()) {
            respostaQuiz[perguntaQuiz] = 3;
        } else if (d.isSelected()) {
            respostaQuiz[perguntaQuiz] = 4;
        }

        if (perguntaQuiz >= 8) {
            perguntaQuiz = 8;
        } else {
            perguntaQuiz++;
        }

        numPerguntaInicio.setText(String.valueOf(perguntaQuiz));
        MostraPergunta();

        barra.setValue(perguntaQuiz);

        if (Comecarcorrigir == true) {
            CorrigePergunta();
        }
        explicacoes.setSelectedIndex(perguntaQuiz-1);
    }//GEN-LAST:event_avancarActionPerformed

    private void respCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respCActionPerformed

    private void respBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respBActionPerformed

    private void respAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respAActionPerformed

    private void numPerguntaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPerguntaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPerguntaInicioActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void respDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respDActionPerformed

    private void numPerguntaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPerguntaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPerguntaFinalActionPerformed

    private void fahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fahrenheitActionPerformed

    private void celsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celsiusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celsiusActionPerformed

    private void moveFahrenheitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFahrenheitMouseDragged
        // TODO add your handling code here:
        fahrenheit.setText(String.valueOf(moveFahrenheit.getValue()));

        double fahrenheitCelsius = Math.round((moveFahrenheit.getValue() - 32) * 5 / 9);
        moveCelsius.setValue((int) fahrenheitCelsius);
        celsius.setText(String.valueOf(fahrenheitCelsius));

        int celsiusKelvin = moveCelsius.getValue() + 273;
        moveKelvin.setValue(celsiusKelvin);
        kelvin.setText(String.valueOf(celsiusKelvin));
    }//GEN-LAST:event_moveFahrenheitMouseDragged

    private void moveCelsiusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveCelsiusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_moveCelsiusMouseEntered

    private void moveCelsiusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveCelsiusMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_moveCelsiusMouseMoved

    private void moveCelsiusMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveCelsiusMouseDragged
        // TODO add your handling code here:
        celsius.setText(String.valueOf(moveCelsius.getValue()));

        int celsiusKelvin = moveCelsius.getValue() + 273;
        moveKelvin.setValue(celsiusKelvin);
        kelvin.setText(String.valueOf(celsiusKelvin));

        int celsiusFahrenheit = ((moveCelsius.getValue() * 9) / 5) + 32;
        moveFahrenheit.setValue(celsiusFahrenheit);
        fahrenheit.setText(String.valueOf(celsiusFahrenheit));
    }//GEN-LAST:event_moveCelsiusMouseDragged

    private void moveKelvinMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveKelvinMouseDragged
        // TODO add your handling code here:
        kelvin.setText(String.valueOf(moveKelvin.getValue()));

        int kelvinCelsius = moveKelvin.getValue() - 273;
        moveCelsius.setValue(kelvinCelsius);
        celsius.setText(String.valueOf(kelvinCelsius));

        int celsiusFahrenheit = ((moveCelsius.getValue() * 9) / 5) + 32;
        moveFahrenheit.setValue(celsiusFahrenheit);
        fahrenheit.setText(String.valueOf(celsiusFahrenheit));
    }//GEN-LAST:event_moveKelvinMouseDragged

    private void verHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verHistoricoActionPerformed
        // TODO add your handling code here:
        String mostra = "";
        String linha = "";
        File arquivo = new File("historico.txt");

        //Arquivo existe
        if (arquivo.exists()) {

            //tentando ler arquivo
            try {
                //abrindo arquivo para leitura
                FileReader reader = new FileReader("historico.txt");
                //leitor do arquivo
                BufferedReader leitor = new BufferedReader(reader);
                while (true) {
                    linha = leitor.readLine();
                    if (linha == null) {
                        break;
                    }
                    mostra += linha + "\n";
                }
            } catch (Exception erro) {
            }
        } //Se nao existir

        historico.setText(mostra);
    }//GEN-LAST:event_verHistoricoActionPerformed

    private void excluirHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirHistoricoActionPerformed
        // TODO add your handling code here:
        FileWriter arquivo;
        try {
            arquivo = new FileWriter(new File("historico.txt"));
            arquivo.write("");
            arquivo.close();
        } catch (IOException ex) {
            Logger.getLogger(TermoIF.class.getName()).log(Level.SEVERE, null, ex);
        }

        historico.setText("");

    }//GEN-LAST:event_excluirHistoricoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int indice1 = 0, indice2 = 0;
        indice1 = corFundo.getSelectedIndex();
        indice2 = corLetra.getSelectedIndex();

        if (indice1 == 0) {
            historico.setBackground(Color.white);
        } else if (indice1 == 1) {
            historico.setBackground(Color.black);
        } else if (indice1 == 2) {
            historico.setBackground(Color.blue);
        } else if (indice1 == 3) {
            historico.setBackground(Color.pink);
        } else if (indice1 == 4) {
            historico.setBackground(Color.green);
        } else if (indice1 == 5) {
            historico.setBackground(Color.yellow);
        } else if (indice1 == 6) {
            historico.setBackground(Color.orange);
        } else if (indice1 == 7) {
            historico.setBackground(Color.red);
        }

        if (indice2 == 0) {
            historico.setForeground(Color.white);
        } else if (indice2 == 1) {
            historico.setForeground(Color.black);
        } else if (indice2 == 2) {
            historico.setForeground(Color.blue);
        } else if (indice2 == 3) {
            historico.setForeground(Color.pink);
        } else if (indice2 == 4) {
            historico.setForeground(Color.green);
        } else if (indice2 == 5) {
            historico.setForeground(Color.yellow);
        } else if (indice2 == 6) {
            historico.setForeground(Color.orange);
        } else if (indice2 == 7) {
            historico.setForeground(Color.red);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TermoIF.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TermoIF.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TermoIF.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TermoIF.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TermoIF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.ButtonGroup alternativa;
    private javax.swing.JButton avancar;
    private javax.swing.JRadioButton b;
    private javax.swing.JProgressBar barra;
    private javax.swing.JRadioButton c;
    private javax.swing.JTextField celsius;
    private javax.swing.JList<String> corFundo;
    private javax.swing.JList<String> corLetra;
    private javax.swing.JButton corrigir;
    private javax.swing.JRadioButton d;
    private javax.swing.JLabel enunciado;
    private javax.swing.JButton excluirHistorico;
    private javax.swing.JComboBox<String> explicacoes;
    private javax.swing.JTextField fahrenheit;
    private javax.swing.JTextArea historico;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField kelvin;
    private javax.swing.JSlider moveCelsius;
    private javax.swing.JSlider moveFahrenheit;
    private javax.swing.JSlider moveKelvin;
    private javax.swing.JTextField numPerguntaFinal;
    private javax.swing.JTextField numPerguntaInicio;
    private javax.swing.JButton recuar;
    private javax.swing.JTextField respA;
    private javax.swing.JTextField respB;
    private javax.swing.JTextField respC;
    private javax.swing.JTextField respD;
    private javax.swing.JPanel resumo;
    private javax.swing.JLabel usuario;
    private javax.swing.JButton ver;
    private javax.swing.JButton verHistorico;
    // End of variables declaration//GEN-END:variables
}
