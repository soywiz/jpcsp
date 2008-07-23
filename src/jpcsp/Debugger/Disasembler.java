/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */
package jpcsp.Debugger;

import javax.swing.DefaultListModel;
import jpcsp.Memory;
import jpcsp.Processor;

/**
 *
 * @author  shadow
 */
public class Disasembler extends javax.swing.JInternalFrame {

    String[] cpuregs = {
        "zr", "at", "v0", "v1", "a0", "a1", "a2", "a3",
        "t0", "t1", "t2", "t3", "t4", "t5", "t6", "t7",
        "s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7",
        "t8", "t9", "k0", "k1", "gp", "sp", "fp", "ra"
    };
    long DebuggerPC;
    private DefaultListModel model_1 = new DefaultListModel();
    int pcreg;

    /** Creates new form Disasembler */
    public Disasembler(Processor c) {

        DebuggerPC = 0;
        pcreg = c.pc;
        model_1 = new DefaultListModel();
        initComponents();
        RefreshDebugger();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList(model_1);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Disassembler");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jList1MouseWheelMoved(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
// TODO add your handling code here:

    if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN && jList1.getSelectedIndex() == jList1.getLastVisibleIndex()) {
        DebuggerPC += 4;
        RefreshDebugger();
        evt.consume();
        jList1.setSelectedIndex(jList1.getLastVisibleIndex());
    } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP && jList1.getSelectedIndex() == 0) {
        DebuggerPC -= 4;
        RefreshDebugger();
        evt.consume();
        jList1.setSelectedIndex(0);
    } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_PAGE_UP && jList1.getSelectedIndex() == 0) {
        DebuggerPC -= 74;
        RefreshDebugger();
        evt.consume();
        jList1.setSelectedIndex(0);
    } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_PAGE_DOWN && jList1.getSelectedIndex() == jList1.getLastVisibleIndex()) {
        DebuggerPC += 74;
        RefreshDebugger();
        evt.consume();
        jList1.setSelectedIndex(jList1.getLastVisibleIndex());
    }
}//GEN-LAST:event_jList1KeyPressed

private void jList1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jList1MouseWheelMoved
// TODO add your handling code here:
    if (evt.getWheelRotation() < 0) {
        evt.consume();
        if (jList1.getSelectedIndex() == 0) {
            DebuggerPC -= 4;
            RefreshDebugger();
            jList1.setSelectedIndex(0);
        } else {
            jList1.setSelectedIndex(jList1.getSelectedIndex() - 1);
        }
    } else {
        evt.consume();
        if (jList1.getSelectedIndex() == jList1.getLastVisibleIndex()) {
            DebuggerPC += 4;
            RefreshDebugger();
            jList1.setSelectedIndex(jList1.getLastVisibleIndex());
        } else {
            jList1.setSelectedIndex(jList1.getSelectedIndex() + 1);
        }
    }
}//GEN-LAST:event_jList1MouseWheelMoved

    public void RefreshDebugger() {
        long t;
        long cnt;
        if (DebuggerPC == 0) {
            DebuggerPC = pcreg;//0x08900000;//test
        }
        model_1.clear();

        for (t = DebuggerPC      , cnt = 0; t < (DebuggerPC + 0x00000074); t += 0x00000004, cnt++) {

            int memread = Memory.get_instance().read32((int) t);
            if (memread == 0) {
                model_1.addElement(String.format("%08x : [%08x]: nop", t, memread));
            } else {
                model_1.addElement(String.format("%08x : [%08x]: %s", t, memread, disasm(memread)));
            }
        }

    }

    String disasm(int value) {
        String s = new String();

        int rs = (value >> 21) & 0x1f;
        int rt = (value >> 16) & 0x1f;
        int rd = (value >> 11) & 0x1f;
        int imm = value & 0xffff;
        if ((imm & 0x8000) == 0x8000) {
            imm |= 0xffff0000;
        }
        int opcode = (value >> 26) & 0x3f;

        //s = Integer.toString(opcode);
        switch (opcode) {
            case 0: //Special table 
                int specialop = (value & 0x3f);
                switch (specialop) {
                    case 4: //sllv
                        s = s + Dis_RDRSRT("sllv", value);
                        break;
                    case 6://srlv
                        s = s + Dis_RDRSRT("srlv", value);
                        break;
                    case 7://srav
                        s = s + Dis_RDRSRT("srav", value);
                        break;
                    case 12://syscall
                        s = s + Dis_Syscall(value);
                        break;
                    case 32://add
                        s = s + Dis_RDRSRT("add", value);
                        break;
                    case 33://addu
                        s = s + Dis_RDRSRT("addu", value);
                        break;
                    case 34://sub
                        s = s + Dis_RDRSRT("sub", value);
                        break;
                    case 35://subu
                        s = s + Dis_RDRSRT("subu", value);
                        break;
                    case 36://and
                        s = s + Dis_RDRSRT("and", value);
                        break;
                    case 37://or
                        s = s + Dis_RDRSRT("or", value);
                        break;
                    case 38://xor
                        s = s + Dis_RDRSRT("xor", value);
                        break;
                    case 39://nor
                        s = s + Dis_RDRSRT("nor", value);
                        break;
                    case 42://slt
                        s = s + Dis_RDRSRT("slt", value);
                        break;
                    case 43://sltu
                        s = s + Dis_RDRSRT("sltu", value);
                        break;
                    default:
                        // s = "special + " + Integer.toString(specialop);
                        break;
                }
                break;
            /*case  1: //Bcond table  //the immediate is not correct!
            int code = value & 0x1f0000;
            if (code == 0) 
            s = s + "bltz " + cpuregs[rs] + ", " + (value & 0xffff)*0x04;
            else if (code == 0x10000) 
            s = s + "bgez " + cpuregs[rs] + ", " + Integer.toHexString((((value & 0xffff)<<2))*4);
            else if (code == 0x100000) 
            s = s + "bltzal " + cpuregs[rs] + ", " + imm*0x04;
            else if (code == 0x110000) 
            s = s + "bgezal " + cpuregs[rs] + ", " + imm*0x04;
            else
            s = s + "unimplement Bcond opcode";
            break;    */
            case 9: //addiu
                s = s + Dis_RTRSIMM("addiu", value);
                break;
            case 13: //ori   
                s = s + Dis_RTRSIMM("ori", value);
                break;
            case 15://lui
                s = s + "lui " + cpuregs[rt] + " , " + imm;
                break;
            default:
                //s = Integer.toString(opcode);
                break;


        }
        return s;
    }

    private String Dis_Syscall(int value) {  /* probably okay */
        String s = new String();
        int code = (value >> 6) & 0xFFFFF;
        for (syscalls.calls c : syscalls.calls.values()) {
            if (c.getValue() == code) {
                s = "syscall " + Integer.toHexString(code) + "     " + c;
                return s;

            }
        }
        s = "syscall 0x" + Integer.toHexString(code) + " [unknown]";
        return s;
    }

    private String Dis_RDRSRT(String opname, int value) {

        int rs = (value >> 21) & 0x1f;
        int rt = (value >> 16) & 0x1f;
        int rd = (value >> 11) & 0x1f;
        if (rs == 0 && rt == 0) {
            return "li " + cpuregs[rd] + " ,0";
        } else if (rs == 0) {
            return "move " + cpuregs[rd] + " ," + cpuregs[rs];
        } else if (rt == 0) {
            return "move " + cpuregs[rd] + " ," + cpuregs[rs];
        } else {
            return opname + " " + cpuregs[rd] + " ," + cpuregs[rs] + " , " + cpuregs[rt];
        }

    }

    private String Dis_RTRSIMM(String opname, int value) {
        int rs = (value >> 21) & 0x1f;
        int rt = (value >> 16) & 0x1f;
        int rd = (value >> 11) & 0x1f;
        int imm = value & 0xffff;
        if ((imm & 0x8000) == 0x8000) {
            imm |= 0xffff0000;
        }
        if (rs == 0) {
            return "li " + cpuregs[rt] + " ," + imm;
        } else {
            return opname + " " + cpuregs[rt] + " ," + cpuregs[rs] + " , " + imm;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
