import java.io.*;


public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
    
    public int hex2dec(String s) {
               
             return (Integer.parseInt(s, 16));
         }
    public String dec2hex12(int a) {
        
        String hexa = Integer.toHexString(0x1000 | a).substring(1).toUpperCase();
        
        return hexa;
    }
    
    public String dec2bin(int a){
        String hexa = Integer.toBinaryString(a);
        int i;
        int n = hexa.length();
        if(hexa.length()<8)
        {
            for(i=0;i<8-n;i++)
            {
                hexa = "0" + hexa;
            }
        }
        return hexa;
    }
    
    public int bin2dec(String s) {
        int digi = Integer.parseInt(s, 2);
        return (digi);
    }
    
    public String dec2hex8(int a) {
        String hexa = Integer.toHexString(0x100 | a).substring(1).toUpperCase();
        return hexa;
    }
    
    
    public int a=0,b=0,c=0,d=0,e=0;
    int[] m = new int[4096];
    
    public void add(char rs)
    {
        switch(rs)
        {
            case 'A':{
                a += a; 
                break;
            }
            case 'B':{
                a += b; 
                break;
            }
            case 'C':{
                a += c; 
                break;
            }
            case 'D':{
                a += d; 
                break;
            }
            case 'E':{
                a += e; 
                break;
            }
            
        }
        accumulatorf.setText(dec2hex8(a));
    }
    
    public void sub(char rs)
    {
        switch(rs)
        {
            case 'A':{
                a -= a; 
                break;
            }
            case 'B':{
                a -= b; 
                break;
            }
            case 'C':{
                a -= c; 
                break;
            }
            case 'D':{
                a -= d; 
                break;
            }
            case 'E':{
                a -= e; 
                break;
            }
            
        }
        accumulatorf.setText(dec2hex8(a));
    }
    
    public void lda(int x)
    {
        a = m[x];
        accumulatorf.setText(dec2hex8(a));
    }
    
    public void sta(int x)
    {
        m[x] = a;
    }
    
    public void mov(char rd, char rs)
    {
        int temp = 0;
        switch(rs)
        {
            case 'A':{
                temp = temp + a;
                break;
            }
            case 'B':{
                temp = temp + b;
                break;
            }
            case 'C':{
                temp = temp + c;
                break;
            }
            case 'D':{
                temp = temp + d;
                break;
            }
            case 'E':{
                temp = temp + e;
                break;
            }
        }
        switch(rd)
        {
            case 'A':{
                a = temp;
                accumulatorf.setText(dec2hex8(a));
                break;
            }
            case 'B':{
                b = temp;
                regbf.setText(dec2hex8(b));
                break;
            }
            case 'C':{
                c = temp;
                regcf.setText(dec2hex8(c));
                break;
            }
            case 'D':{
                d = temp;
                regdf.setText(dec2hex8(d));
                break;
            }
            case 'E':{
                e = temp;
                regef.setText(dec2hex8(e));
                break;
            }
        }
    }
    
    public void stt(int x, int y)
    {
        m[x] = y;
    }
    
    public void adi(int x)
    {
        a = a + x;
        accumulatorf.setText(dec2hex8(a));
    }
    
    public void mvi(char rd,int x)
    {
        switch(rd)
        {
            case 'A':{
                a = x;
                accumulatorf.setText(dec2hex8(a));
                break;
            }
            case 'B':{
                b = x;
                regbf.setText(dec2hex8(b));
                break;
            }
            case 'C':{
                c = x;
                regcf.setText(dec2hex8(c));
                break;
            }
            case 'D':{
                d = x;
                regdf.setText(dec2hex8(d));
                break;
            }
            case 'E':{
                e = x;
                regef.setText(dec2hex8(e));
                break;
            }
        }
    }
    
    public void fsx()
    {
        String s = dec2bin(a);
        char[] abc = s.toCharArray();
        char temp = abc[1];
        abc[1] = abc[2];
        abc[2] = temp;
        String ss = new String(abc,0,8);
        a = bin2dec(ss);
        accumulatorf.setText(dec2hex8(a));
    }
    
    
    
    public void showmem()
    {
        int i;
        StringBuilder ss = new StringBuilder();
        
        for(i=0;i<4096;i++)
        {
            if(m[i] != 0)
            {
                ss.append("").append(dec2hex12(i)).append(" - ").append(dec2hex8(m[i])).append("\n");
            }
        }
        jt2.setText(ss.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTextArea();
        l2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        accumulatorf = new javax.swing.JTextPane();
        accumulator = new javax.swing.JLabel();
        regb = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        regbf = new javax.swing.JTextPane();
        regc = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        regcf = new javax.swing.JTextPane();
        regd = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        regdf = new javax.swing.JTextPane();
        rege = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        regef = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        err = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setText("ASSEMBLE");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        l1.setText("INPUT FILE NAME:");

        jt1.setColumns(10);
        jt1.setRows(5);
        jScrollPane1.setViewportView(jt1);

        l2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("REGISTERS");

        jScrollPane3.setViewportView(accumulatorf);

        accumulator.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        accumulator.setText("ACCUMULATOR");

        regb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        regb.setText("REGISTER B");

        jScrollPane4.setViewportView(regbf);

        regc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        regc.setText("REGISTER C");

        jScrollPane5.setViewportView(regcf);

        regd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        regd.setText("REGISTER D");

        jScrollPane6.setViewportView(regdf);

        rege.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rege.setText("REGISTER E");

        jScrollPane7.setViewportView(regef);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("SOURCE CODE");

        jt2.setColumns(10);
        jt2.setRows(5);
        jScrollPane2.setViewportView(jt2);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("MEMORY MAP");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("ASSEMBLY LANGUAGE PARSER");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("SHREY BATRA");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("YASH VARSHNEY");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("NIPUN MITTAL");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("15103303");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("15103308");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("15103314");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("AND SIMULATOR");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TOC PROJECT");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        err.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        err.setForeground(new java.awt.Color(204, 0, 204));
        err.setText("STATUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(b1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(accumulator, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(regb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(regc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(regd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rege, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(err)
                                .addGap(108, 108, 108))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(l2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accumulator))
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(l1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(regb)
                                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(regc))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(regd))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rege))
                            .addGap(50, 50, 50)
                            .addComponent(err)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        a=b=c=d=e=0;
        accumulatorf.setText(dec2hex8(a));
        regbf.setText(dec2hex8(b));
        regcf.setText(dec2hex8(c));
        regdf.setText(dec2hex8(d));
        regef.setText(dec2hex8(e));
        String fname;
        fname = tf1.getText();
        try{
            
            File ff = new File(fname);
            FileReader fff = new FileReader(ff);
            BufferedReader buff = new BufferedReader(fff);
            StringBuilder sb = new StringBuilder();
            String line;
            
            while((line = buff.readLine()) != null)
            {
                sb.append(line);
                sb.append("\n");
            }
            fff.close();
            jt1.setText(sb.toString());
        } catch(IOException er){
            err.setText("File Not Found");
            return;
        }
        
        char[] abc = new char[3];
        char rs,rd;
        char[] mem = new char[4];
        String mm,mm1;
        
        try{
            
            File ff = new File(fname);
            FileReader fff = new FileReader(ff);
            BufferedReader buff = new BufferedReader(fff);
            String line;
            String ccc;
            int errorr = 0;
            
            OUTER:
            while ((line = buff.readLine()) != null) {
                abc[0] = line.charAt(0);
                abc[1] = line.charAt(1);
                abc[2] = line.charAt(2);
                ccc = new String(abc,0,3);
                switch (ccc) {
                    case "STT":
                        mem[0] = line.charAt(4);
                        mem[1] = line.charAt(5);
                        mem[2] = line.charAt(6);
                        mm = new String(mem,0,3);
                        mem[0] = line.charAt(8);
                        mem[1] = line.charAt(9);
                        mm1 = new String(mem,0,2);
                        stt(hex2dec(mm),hex2dec(mm1));
                        break;
                    case "ADD":
                        rs = line.charAt(4);
                        add(rs);
                        break;
                    case "LDA":
                        mem[0] = line.charAt(4);
                        mem[1] = line.charAt(5);
                        mem[2] = line.charAt(6);
                        mm = new String(mem,0,3);
                        lda(hex2dec(mm));
                        break;
                    case "STA":
                        mem[0] = line.charAt(4);
                        mem[1] = line.charAt(5);
                        mem[2] = line.charAt(6);
                        mm = new String(mem,0,3);
                        sta(hex2dec(mm));
                        break;
                    case "MOV":
                        rd = line.charAt(4);
                        rs = line.charAt(6);
                        mov(rd,rs);
                        break;
                    case "HLT":
                        break OUTER;
                        //return;
                    case "SUB":
                        rs = line.charAt(4);
                        sub(rs);
                        break;
                    case "ADI":
                        mem[0] = line.charAt(4);
                        mem[1] = line.charAt(5);
                        mm = new String(mem,0,2);
                        adi(hex2dec(mm));
                        break;
                    case "MVI":
                        rd = line.charAt(4);
                        mem[0] = line.charAt(6);
                        mem[1] = line.charAt(7);
                        mm = new String(mem,0,2);
                        mvi(rd,hex2dec(mm));
                        break;
                    case "FSX":
                        fsx();
                        break;
                    default:
                        
                        err.setText("Error in file");
                        errorr = 1;
                        break;
                }
            }
            fff.close();
            showmem();
            if(errorr==0)
                err.setText("Successful");
        } catch(Exception er){
            err.setText("Error in file");
            //System.out.print("File Not Found");
        }
        
    }//GEN-LAST:event_b1ActionPerformed

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
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accumulator;
    private javax.swing.JTextPane accumulatorf;
    private javax.swing.JButton b1;
    private javax.swing.JLabel err;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jt1;
    private javax.swing.JTextArea jt2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel regb;
    private javax.swing.JTextPane regbf;
    private javax.swing.JLabel regc;
    private javax.swing.JTextPane regcf;
    private javax.swing.JLabel regd;
    private javax.swing.JTextPane regdf;
    private javax.swing.JLabel rege;
    private javax.swing.JTextPane regef;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
