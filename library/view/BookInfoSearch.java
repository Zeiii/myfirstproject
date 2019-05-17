package testWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookInfoSearch {

	private JFrame frame;
	private JTable table_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookInfoSearch window = new BookInfoSearch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookInfoSearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 1285, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(0, 0, 1280, 91);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("\u5BFC\u51FA");
		button.setBounds(83, 27, 113, 27);
		panel.add(button);
		
		JButton button_1 = new JButton("\u5173\u95ED");
		button_1.setBounds(228, 27, 113, 27);
		panel.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 91, 1280, 91);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("\u9009\u62E9\u67E5\u8BE2\u65B9\u5F0F");
		label.setBounds(42, 30, 121, 18);
		panel_1.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(160, 27, 99, 24);
		comboBox.addItem("任意方式");
		comboBox.addItem("书刊编号");
		comboBox.addItem("ISBN");
		panel_1.add(comboBox);
		
		JButton button_2 = new JButton("\u67E5\u8BE2");
		button_2.setBounds(700, 26, 113, 27);
		panel_1.add(button_2);
		
		JLabel label_1 = new JLabel("\u8F93\u5165\u56FE\u4E66\u4FE1\u606F\u67E5\u8BE2\uFF1A");
		label_1.setBounds(355, 30, 159, 18);
		panel_1.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(492, 27, 194, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u9AD8\u7EA7\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(894, 26, 113, 27);
		panel_1.add(btnNewButton);
		
		
		
		
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 182, 1280, 380);
//		frame.getContentPane().add(panel_2);
		
		
		

        Object[] columnNames = {"图书名称", "总册数", "借出册数", "剩余册数", "书刊编号",
        		"总值","主题词","ISBN","作者","出版社","出版版次","出版日期"};

        // 表格所有行数据
        Object[][] rowData = new Object[100][12];
                rowData[0]=new Object[]{"中国历史", "5", "2", "3", "0001",
                	"￥100","历史","12345678","李白","机械工业出版社","第十一版","2019-01-01"};
                rowData[1]=new Object[]{"世界历史", "10", "4", "6", "0002",
                    	"￥200","历史","12345678","李明","商务印书馆","第一版","2010-01-01"};
                rowData[2]=new Object[]{"高等数学", "100", "100", "0", "0003",
                        	"￥40000","自然科学","12345678","小明","人民邮电出版社","第二版","2019-05-05"};
                
                for(int i=3;i<100;i++) {
                	rowData[i]=new Object[] {"高等数学", "100", "100", "0", "000"+i,
                        	"￥40000","自然科学","12345678","小明","人民邮电出版社","第二版","2019-05-05"};
                }
		panel_2.setLayout(new BorderLayout());
		
		table_2 = new JTable(rowData,columnNames);
		table_2.setBackground(new Color(255, 255, 255));
		
		panel_2.add(table_2.getTableHeader(),BorderLayout.NORTH);
		
		table_2.setBounds(0, 0, 1280, 320);
		
		
		
		
		
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 182, 1280, 380);
		scrollPane.setViewportView(table_2);
		panel_2.add(scrollPane);
		
		frame.getContentPane().add(panel_2);
	}
}
