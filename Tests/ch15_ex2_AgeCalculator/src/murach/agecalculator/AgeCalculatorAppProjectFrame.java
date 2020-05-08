/**
 * 
 * Elyana Benitez
 * 05/05/2020
 * 
 */

package murach.agecalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import murach.agecalculator.AgeCalculatorApp;

public class AgeCalculatorAppProjectFrame {

	private static JTextField dOfB;

	public static void main(String[] args) {

		JFrame frame = new JFrame("Age Calculator App");
		frame.setSize(800, 600);
		frame.setLocationByPlatform(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
//		frame.setLayout(new FlowLayout(FlowLayout.CENTER));

//		frame.add(new JButton("Date of Birth"), BorderLayout.NORTH);
//		frame.add(new JButton("Current Date"), BorderLayout.NORTH);
//		frame.add(new JButton("text"), BorderLayout.NORTH);

		dOfB = new JTextField(11);
		String dateOfBirthString = dOfB.getText();

		Dimension shortField = new Dimension(100, 20);
//		dOfB.setPreferredSize(shortField);
//		dOfB.setMinimumSize(shortField);
//		frame.add(dOfB);

		JPanel p = new JPanel();

		p.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.LINE_END;
		p.add(new JLabel("Enter your date of birth in the format (YYYY-MM-DD): "), c);
		c.gridx = 1;
		c.gridy = 0;
		c.anchor = GridBagConstraints.LINE_START;
		p.add(dOfB);

		c.insets = new Insets(5, 5, 0, 5);
		frame.add(p, BorderLayout.CENTER);

		/**
		 * public void setNameText(String name) { frameNameField.setText(name); }
		 * 
		 * new AgeDialog(this, frame.getText);
		 */

		JPanel panel = new JPanel();
		frame.add(panel, BorderLayout.NORTH);
		JPanel panel2 = new JPanel();
		frame.add(panel2, BorderLayout.SOUTH);

		JButton b1 = new JButton("Date of Birth");
		JButton b2 = new JButton("Current Date");
		JButton b3 = new JButton("Calculate Age");
		JButton b4 = new JButton("Birthday Button");

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel2.add(b4);

//		dOfB = new JTextField();

//		dOfB.setText(dOfB.getText());

		
		b1.addActionListener((ActionEvent) -> {
			doButton1();
		});

		b2.addActionListener((ActionEvent) -> {
			doButton2();
		});

		b3.addActionListener((ActionEvent) -> {
			doButton3();
		});
		b4.addActionListener((ActionEvent) -> {
			doButton4();
		});
	}
	


	static LocalDate currentDate = LocalDate.now();//of(2020, 05, 05);
	
	

//	 static String dateOfBirthString = dOfB.getText();

	private static void doButton1() {
		try {
		if (dOfB != null) {
			
			
			
			String dateOfBirthString = dOfB.getText();
			LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
			DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
			String dateOfBirthFormatted = dtf.format(dateOfBirth);

			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Your date of birth is " + dateOfBirthFormatted, "Date of Birth",
					JOptionPane.PLAIN_MESSAGE);
			
			/**int monthCurrentDate = currentDate.getMonthValue();
			int monthDateOfBirth = dateOfBirth.getMonthValue();
			int dayCurrentDate = currentDate.getDayOfYear();
			int dayDateOfBirth = dateOfBirth.getDayOfYear();
			
			if (monthDateOfBirth == monthCurrentDate && dayDateOfBirth == dayCurrentDate) {
				JOptionPane.showMessageDialog(frame, "HAPPRY BIRTHDAY!!!", "YAY",
						JOptionPane.PLAIN_MESSAGE);
			}*/
			
		} else {
			String dateOfBirthString = null;

			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
		} catch (NullPointerException n) {
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (IllegalArgumentException i) {
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
	}

	private static void doButton2() {

		final JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "The current date is " + currentDate, "Current Date",
				JOptionPane.PLAIN_MESSAGE);
	}

	private static void doButton3() {

		int yearCurrentDate = currentDate.getYear();
		try {
		if (dOfB != null) {
			String dateOfBirthString = dOfB.getText();
			LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
//			 DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
//					FormatStyle.MEDIUM);
//			 String dateOfBirthFormatted = dtf.format(dateOfBirth);

			int yearDateOfBirth = dateOfBirth.getYear();

			int usersAge = yearCurrentDate - yearDateOfBirth;

			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Your age is/will be " + usersAge + " this year.", "Age", JOptionPane.PLAIN_MESSAGE);
		} else {
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "The information needed to do the calculations has not been inputted.",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
		} catch (NullPointerException n) {
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (IllegalArgumentException i) {
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private static void doButton4() {
		try {
		final JFrame frame = new JFrame();
		int option = JOptionPane.showConfirmDialog(frame, "Is it your birthday today?",
				"Birthday", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if (option == JOptionPane.YES_OPTION) {
			final JFrame frame1 = new JFrame();
			int ask = JOptionPane.showConfirmDialog(frame1, "CONGRATULATIONS!!!", 
					"YAY", JOptionPane.DEFAULT_OPTION , JOptionPane.PLAIN_MESSAGE);
			if (ask == JOptionPane.OK_OPTION ) {
				final JFrame frame2 = new JFrame();
				JOptionPane.showConfirmDialog(frame2, "HAPPY BIRTHDAY!!!", 
						"YAY", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			}
		} else if (option == JOptionPane.NO_OPTION) {
			String dateOfBirthString = dOfB.getText();
			LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
			DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
			String dateOfBirthFormatted = dtf.format(dateOfBirth);
			
			int monthCurrentDate = currentDate.getMonthValue();
			int monthDateOfBirth = dateOfBirth.getMonthValue();
			int dayOfYearCurrentDate = currentDate.getDayOfYear();
			int dayOfYearDateOfBirth = dateOfBirth.getDayOfYear();
			
			/**if ((monthCurrentDate > monthDateOfBirth) && (dayOfYearCurrentDate > dayOfYearDateOfBirth)) {
				int dayCount = dayOfYearCurrentDate - dayOfYearDateOfBirth;
			int monthCount = monthCurrentDate - monthDateOfBirth;
			
			JOptionPane.showConfirmDialog(frame, monthCount + "months and " + dayCount + " more days until your birthday.", 
					"Countdown", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
			}*/
			int dayCount = dayOfYearDateOfBirth - dayOfYearCurrentDate + 1;
			int monthCount = monthDateOfBirth - monthCurrentDate;

			if (monthCount < 0) {
				monthCount = monthCount + 12;
			}
			if (dayCount < 0) {
				dayCount = dayCount + 365;
			}
			
			JOptionPane.showConfirmDialog(frame, dayCount + " more days until your birthday.", 
					"Countdown", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
		}
		} catch (NullPointerException n) { 
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (IllegalArgumentException i) {
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "          Your date of birth has not been inputted\n"
					+ "Make sure you formatted your date of birth correctly", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
