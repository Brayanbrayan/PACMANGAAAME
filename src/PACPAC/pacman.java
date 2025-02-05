/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PACPAC;

/**
 *
 * @author toshiba
 */
import javax.swing.JFrame;

public class pacman extends JFrame{
    
    public pacman() {
		add(new model());
	}
	
	
	public static void main(String[] args) {
		pacman pac = new pacman();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(380,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}
}
