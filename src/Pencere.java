import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pencere extends JFrame{
	int sayi1, sayi2, sayi3, sayi4, sayi5;
	int sonuc;
	public Pencere() {
		setTitle("Altay Hesap Makinesi");
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 455, 86);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(105, 105, 105));
		lblNewLabel_1.setBounds(0, 0, 455, 86);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 112, 455, 454);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "7");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(12, 44, 93, 90);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("8");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "8");
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		button.setBackground(Color.WHITE);
		button.setBounds(117, 44, 93, 90);
		panel_1.add(button);
		
		JButton button_1 = new JButton("9");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "9");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(222, 44, 93, 90);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "4");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(12, 147, 93, 90);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "5");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(117, 147, 93, 90);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "6");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(222, 147, 93, 90);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "1");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(12, 250, 93, 90);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "2");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(117, 250, 93, 90);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "3");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(222, 250, 93, 90);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText(lblNewLabel_1.getText() + "0");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(117, 351, 93, 90);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sayi5= Integer.parseInt(lblNewLabel_1.getText());
				lblNewLabel_1.setText("");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(339, 44, 93, 90);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sayi4 = Integer.parseInt(lblNewLabel_1.getText());
				lblNewLabel_1.setText("");
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(339, 147, 93, 90);
		panel_1.add(button_10);
		
		JButton btnX = new JButton("x");
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sayi3= Integer.parseInt(lblNewLabel_1.getText());
				lblNewLabel_1.setText("");
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnX.setBackground(Color.WHITE);
		btnX.setBounds(339, 250, 93, 90);
		panel_1.add(btnX);
		
		JButton button_12 = new JButton("/");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sayi1 = Integer.parseInt(lblNewLabel_1.getText()); 
				lblNewLabel_1.setText("");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(339, 351, 93, 90);
		panel_1.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sayi2 = Integer.parseInt(lblNewLabel_1.getText()); 
				if(sayi1!=0)
				{
					sonuc=sayi1/sayi2;
					lblNewLabel_1.setText("" + sonuc);
				}
				if(sayi3!=0)
				{
					sonuc=sayi3*sayi2;
					lblNewLabel_1.setText("" + sonuc);
				}
				if(sayi4!=0) 
				{
					sonuc=sayi4-sayi2;
					lblNewLabel_1.setText("" + sonuc);
				}
				if(sayi5!=0)
				{
					sonuc=sayi5+sayi2;
					lblNewLabel_1.setText("" + sonuc);
				}
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_13.setBackground(Color.WHITE);
		button_13.setBounds(222, 351, 93, 90);
		panel_1.add(button_13);
		
		JButton btnC = new JButton("C");
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setText("");
				sayi1 = 0;
				sayi2 = 0;
				sayi3 = 0;
				sayi4 = 0;
				sayi5 = 0;
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnC.setBackground(Color.WHITE);
		btnC.setBounds(12, 353, 93, 90);
		panel_1.add(btnC);
	}
}
	

