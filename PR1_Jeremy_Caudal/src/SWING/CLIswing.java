package SWING;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CLIswing {
	static String text = "";
	/**
	 * 
	 */

	public static void main(String[] args) {
		JFrame window = new JFrame("IHM pour CLI");
		//window.setLayout(new BorderLayout());
		//window.setSize(300, 300);
		window.setPreferredSize(new Dimension(650,200));
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//button
        JButton C = new JButton("Creuse (C)");
        JButton P = new JButton("Pleine (P)");
        JButton K = new JButton("+");
        JButton A = new JButton("+");
        JButton E = new JButton("+");
		
        
        //label
        JLabel lK = new JLabel("Valeur de l'indice (K)");
        JLabel lA = new JLabel("Valeur de l'indice (K)");
        JLabel lE = new JLabel("Valeur de l'indice (K)");
        JTextField South = new JTextField(text);
        //field
        JTextField fieldK = new JTextField(50);
        JTextField fieldA = new JTextField(50);
        JTextField fieldE = new JTextField(50);
        
		//Panel
        //panel north
        JPanel panelNorth = new JPanel();
        //panel center
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(3,3));
        
        
        //button panel
        panelNorth.add(C);
        panelNorth.add(P);
        
        //grid panel center
        panelCenter.add(lK);
        panelCenter.add(fieldK);
        panelCenter.add(K);
        panelCenter.add(lA);
        panelCenter.add(fieldA);
        panelCenter.add(A);
        panelCenter.add(lE);
        panelCenter.add(fieldE);
        panelCenter.add(E);
        
        //actionlistener
        //C.addActionListener(new CLIswing());
        
        C.addActionListener(
        		  new ActionListener() {
        		    public void actionPerformed(ActionEvent e) {
        		    	text = text + "-C";
        		    	South.setText(text);
        		    }
        		  }
        		);
        
        //panel window
        window.add(panelNorth, BorderLayout.NORTH);
        window.add(South, BorderLayout.SOUTH);
        window.add(panelCenter, BorderLayout.CENTER);
        
        window.pack();
        window.setVisible(true);
	}
}
