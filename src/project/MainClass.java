package project;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainClass {

	private JFrame frame;
	private JTextField CourseCode;
	private JTextField section;
	private JTextField ClassSchedule;
	private JTextField Tutionfees;
	private JTable table;
	
	int row;
	ArrayList<Course> CourseList;
	DefaultTableModel dtm;
	String header[]= new String[]{"Course code","Section","Class Schedule","Tution Fees"};
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass window = new MainClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void displayStudentDetails(){
		dtm.setRowCount(0);
		for(int i=0; i<CourseList.size();i++){
			Object[] obj={CourseList.get(i).Course_Code,
                          CourseList.get(i).section,
                          CourseList.get(i).Class_Schedule,
                          CourseList.get(i).tuition_fees};
                        
			  dtm.addRow(obj);
		}
	}

	public MainClass() {
		initialize();
		CourseList=new ArrayList<>();
		dtm=new DefaultTableModel(header,0);
		table.setModel(dtm);
	}
        
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(60, 153, 220));
		frame.setBounds(100, 100, 1079, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setForeground(new Color(32,42,68));
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCourseCode.setBounds(29, 29, 102, 26);
		frame.getContentPane().add(lblCourseCode);
		
		CourseCode = new JTextField();
		CourseCode.setBounds(127, 35, 111, 20);
		frame.getContentPane().add(CourseCode);
		CourseCode.setColumns(10);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setForeground(new Color(32,42,68));
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSection.setBounds(29, 66, 102, 26);
		frame.getContentPane().add(lblSection);
		
		section = new JTextField();
		section.setColumns(10);
		section.setBounds(127, 72, 111, 20);
		frame.getContentPane().add(section);
		
		JLabel lblClassSchedule = new JLabel("Class Schedule");
		lblClassSchedule.setForeground(new Color(32,42,68));
		lblClassSchedule.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClassSchedule.setBounds(29, 103, 102, 26);
		frame.getContentPane().add(lblClassSchedule);
		
		ClassSchedule = new JTextField();
		ClassSchedule.setColumns(10);
		ClassSchedule.setBounds(127, 109, 111, 20);
		frame.getContentPane().add(ClassSchedule);
		
		JLabel lblTutionfees = new JLabel("Tution fees");
		lblTutionfees.setForeground(new Color(32,42,68));
		lblTutionfees.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTutionfees.setBounds(29, 140, 102, 26);
		frame.getContentPane().add(lblTutionfees);
		
		Tutionfees = new JTextField();
		Tutionfees.setColumns(10);
		Tutionfees.setBounds(127, 146, 111, 20);
		frame.getContentPane().add(Tutionfees);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Course data=new Course(CourseCode.getText(),section.getText(),ClassSchedule.getText(),Tutionfees.getText());
				CourseList.add(data);
				displayStudentDetails();
			}
		});
        
                
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBounds(29, 194, 89, 23);
		frame.getContentPane().add(btnAdd);
                
                
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBounds(29, 194, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice=JOptionPane.showConfirmDialog(null, "Delete this data ?", "Delete",JOptionPane.YES_NO_OPTION);
				if(choice==0){
					dtm.removeRow(row);
					CourseList.remove(row);
					
				}
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(142, 194, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseList.get(row).Course_Code=CourseCode.getText();
				CourseList.get(row).section=section.getText();
				CourseList.get(row).Class_Schedule=ClassSchedule.getText();
				CourseList.get(row).tuition_fees=Tutionfees.getText();
				displayStudentDetails();
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdate.setBounds(29, 232, 89, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CourseCode.setText("");
				section.setText("");
				ClassSchedule.setText("");
				Tutionfees.setText("");
			}
		});
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRefresh.setBounds(142, 232, 89, 23);
		frame.getContentPane().add(btnRefresh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(279, 36, 737, 339);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				row=table.getSelectedRow();
				
				CourseCode.setText(dtm.getValueAt(row, 0).toString());
				section.setText(dtm.getValueAt(row, 1).toString());
				ClassSchedule.setText(dtm.getValueAt(row, 2).toString());
				Tutionfees.setText(dtm.getValueAt(row, 3).toString());
				
			}
		});
		scrollPane.setViewportView(table);
	}

}
