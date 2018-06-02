/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.hotel.listener.CheckInPageListener;
import com.hotel.model.Client;
import com.hotel.model.HouseType;
import com.hotel.service.HouseTypeService;
import com.hotel.service.ServiceFactory;

/**
 *
 * @author Administrator
 */
public class CheckInPage extends javax.swing.JPanel {
	private HouseTypeService houseTypeService; 
	/**
	 * 
	 */
	private static final long serialVersionUID = -5798798398166957635L;

	/**
	 * Creates new form CheckInPage
	 */
	public CheckInPage() {
		houseTypeService = ServiceFactory.getService(ServiceFactory.HOUSE_TYPE_SERVICE);
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		btnPanel = new javax.swing.JPanel();
		checkInBtn = new javax.swing.JButton();
		cancelBtn = new javax.swing.JButton();
		checkInPanel = new javax.swing.JPanel();
		housePanel = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		houseNumberField = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		houseThingTextArea = new javax.swing.JTextArea();
		houseTypeComboBox = new javax.swing.JComboBox<>();
		jLabel6 = new javax.swing.JLabel();
		clientNumberTextField = new javax.swing.JTextField();
		clientPanel = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		clientTable = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		clientNameTextField = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		clientIdTextField = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		clientGenderMaleRadioButton = new javax.swing.JRadioButton();
		clientGenderFemaleRadioButton = new javax.swing.JRadioButton();
		addClientBtn = new javax.swing.JButton();

		setBorder(javax.swing.BorderFactory.createTitledBorder(null, "登记入住信息",
				javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.TOP, new java.awt.Font("宋体", 1,
						14))); // NOI18N
		setLayout(new java.awt.BorderLayout());

		checkInBtn.setText("入住");
		btnPanel.add(checkInBtn);
		checkInBtn.getAccessibleContext().setAccessibleName("checkInBtn");
		checkInBtn.getAccessibleContext().setAccessibleDescription("");

		cancelBtn.setText("取消");
		btnPanel.add(cancelBtn);

		add(btnPanel, java.awt.BorderLayout.PAGE_END);

		housePanel.setBorder(javax.swing.BorderFactory
				.createTitledBorder("填写房间信息"));

		jLabel3.setText("房间类型");

		jLabel4.setText("房间号");

		jLabel5.setText("房间物品");

		houseThingTextArea.setColumns(20);
		houseThingTextArea.setRows(5);
		jScrollPane3.setViewportView(houseThingTextArea);

		jLabel6.setText("入住人数");

		javax.swing.GroupLayout housePanelLayout = new javax.swing.GroupLayout(
				housePanel);
		housePanel.setLayout(housePanelLayout);
		housePanelLayout
				.setHorizontalGroup(housePanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								housePanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												housePanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel3)
														.addComponent(jLabel5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												housePanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																housePanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				houseTypeComboBox,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				146,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				houseNumberField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				81,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(27,
																				27,
																				27)
																		.addComponent(
																				jLabel6)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				clientNumberTextField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				87,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap(
																				271,
																				Short.MAX_VALUE))
														.addComponent(
																jScrollPane3))));
		housePanelLayout
				.setVerticalGroup(housePanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								housePanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												housePanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																33,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																houseTypeComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)
														.addComponent(
																houseNumberField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6)
														.addComponent(
																clientNumberTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												housePanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																housePanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				38,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(0,
																				0,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																housePanelLayout
																		.createSequentialGroup()
																		.addGap(0,
																				12,
																				Short.MAX_VALUE)
																		.addComponent(
																				jScrollPane3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				48,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap()))));

		clientPanel.setBorder(javax.swing.BorderFactory
				.createTitledBorder("登记入住人员信息"));

		dataModel = new javax.swing.table.DefaultTableModel(new String[][] {},
				new String[] { "姓名", "身份证号", "性别" }) {

			private static final long serialVersionUID = -8808862608026279278L;
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { true, true, true };

			@SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		};
		clientTable.setModel(dataModel);
		jScrollPane1.setViewportView(clientTable);

		jLabel1.setText("姓名");
		jLabel2.setText("身份证号");
		jLabel7.setText("性别");
		clientGenderMaleRadioButton.setText("男");
		clientGenderFemaleRadioButton.setText("女");
		addClientBtn.setText("增加");

		javax.swing.GroupLayout clientPanelLayout = new javax.swing.GroupLayout(
				clientPanel);
		clientPanel.setLayout(clientPanelLayout);
		clientPanelLayout
				.setHorizontalGroup(clientPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								clientPanelLayout
										.createSequentialGroup()
										.addGap(27, 27, 27)
										.addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addComponent(
												clientNameTextField,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												158,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												clientIdTextField,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												193,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												clientGenderMaleRadioButton)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												clientGenderFemaleRadioButton)
										.addGap(18, 18, 18)
										.addComponent(addClientBtn)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addComponent(jScrollPane1));
		clientPanelLayout
				.setVerticalGroup(clientPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								clientPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												clientPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																clientNameTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(jLabel2)
														.addComponent(
																clientIdTextField)
														.addComponent(jLabel7)
														.addComponent(
																clientGenderMaleRadioButton)
														.addComponent(
																clientGenderFemaleRadioButton)
														.addComponent(
																addClientBtn))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												180, Short.MAX_VALUE)));

		javax.swing.GroupLayout checkInPanelLayout = new javax.swing.GroupLayout(
				checkInPanel);
		checkInPanel.setLayout(checkInPanelLayout);
		checkInPanelLayout.setHorizontalGroup(checkInPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(housePanel,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(clientPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		checkInPanelLayout.setVerticalGroup(checkInPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						checkInPanelLayout
								.createSequentialGroup()
								.addComponent(housePanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(clientPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addContainerGap()));

		add(checkInPanel, java.awt.BorderLayout.CENTER);

		initDefaultData();
		initEventListener();
	}// </editor-fold>//GEN-END:initComponents

	private void initDefaultData() {
		setComboBoxModel();
	}

	private void initEventListener() {
		addClientBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addClientToTable();
			}
		});

		checkInBtn.setActionCommand(CheckInPageListener.CHECK_IN_BTN_COMMAND);
		checkInBtn.addActionListener(new CheckInPageListener(this));

		clientGenderFemaleRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (clientGenderFemaleRadioButton.isSelected()) {
					clientGenderMaleRadioButton.setSelected(false);
				} else {
					clientGenderMaleRadioButton.setSelected(true);
				}
			}
		});
		clientGenderMaleRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (clientGenderMaleRadioButton.isSelected()) {
					clientGenderFemaleRadioButton.setSelected(false);
				} else {
					clientGenderFemaleRadioButton.setSelected(true);
				}
			}
		});

		cancelBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = clientTable.getSelectedColumn();
				if (row >= 0) {
					dataModel.removeRow(row);
				} else {
					JOptionPane.showMessageDialog(null, "没有选中任何记录!", "提示",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton addClientBtn;
	private javax.swing.JPanel btnPanel;
	private javax.swing.JButton cancelBtn;
	private javax.swing.JButton checkInBtn;
	private javax.swing.JPanel checkInPanel;
	private javax.swing.JRadioButton clientGenderFemaleRadioButton;
	private javax.swing.JRadioButton clientGenderMaleRadioButton;
	private javax.swing.JTextField clientIdTextField;
	private javax.swing.JTextField clientNameTextField;
	private javax.swing.JTextField clientNumberTextField;
	private javax.swing.JPanel clientPanel;
	private javax.swing.JTable clientTable;
	private javax.swing.JTextField houseNumberField;
	private javax.swing.JPanel housePanel;
	private javax.swing.JTextArea houseThingTextArea;
	private javax.swing.JComboBox<String> houseTypeComboBox;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane3;
	private DefaultTableModel dataModel;
	private DefaultComboBoxModel<String> comboBoxModel;

	private void setComboBoxModel() {
		loadComboxData();
	}

	/**
	 * 获取房间类型
	 * 
	 * @return
	 */
	public String getHouseType() {
		return houseTypeComboBox.getSelectedItem().toString();
	}

	/**
	 * 获取房间号
	 * 
	 */
	public String getHouseNumber() {
		return houseNumberField.getText();
	}

	/**
	 * 获取房间物品信息
	 * 
	 * @return
	 */
	public String getHouseThingInfo() {
		return houseThingTextArea.getText();
	}

	/**
	 * 获取入住总人数
	 * 
	 * @return
	 */
	public String getClientNumber() {
		return clientNumberTextField.getText();
	}

	/**
	 * 获取所有表格中的数据
	 * 
	 * @return
	 */
	public List<Client> getClients() {
		List<Client> clients = new ArrayList<Client>();
		TableModel tableModel = clientTable.getModel();
		int i = tableModel.getRowCount();
		for (int j = 0; j < i; j++) {
			String clientName = (String) tableModel.getValueAt(j, 0);
			String clientId = (String) tableModel.getValueAt(j, 1);
			String gender = (String) tableModel.getValueAt(j, 2);
			Client c = new Client();
			c.setIdentity(clientId);
			c.setName(clientName);
			c.setGender(gender);
			clients.add(c);
		}
		return clients;
	}

	/**
	 * 新增人员到table中
	 */
	public void addClientToTable() {
		boolean male = clientGenderMaleRadioButton.isSelected() ? true : false;
		String gender = male ? "男" : "女";
		String clientName = clientNameTextField.getText();
		String clientId = clientIdTextField.getText();
		String[] newClient = { clientId, clientName, gender };
		dataModel.addRow(newClient);
		clientNameTextField.setText("");
		clientIdTextField.setText("");
		clientGenderMaleRadioButton.setSelected(false);
		clientGenderFemaleRadioButton.setSelected(false);
	}

	public void loadComboxData(){
		List<HouseType> hts = houseTypeService.getHouseTypes("");
		boolean isHas = false;
		if(null == hts || 0 == hts.size()){
		}else{
			List<String> types = new ArrayList<String>();
			for(int i = 0 ; i < hts.size(); i++){
				HouseType ht = hts.get(i);
				int status = ht.getStatus();
				if(status == HouseType.STATUS.USED){
				types.add(ht.getName());
				  isHas = true;
				}
			}
			if(isHas){
				String[] newTypes = new String[types.size() + 1];
				for(int i = 0 ; i < types.size(); i++){
					newTypes[i] = types.get(i);
				}
				newTypes[types.size()] = "标准间";
				comboBoxModel = new javax.swing.DefaultComboBoxModel<>(newTypes);
			}
		}
		
		if (!isHas) {
			comboBoxModel = new javax.swing.DefaultComboBoxModel<>(
					new String[] { "标准间" });
		}
		
		houseTypeComboBox.setModel(comboBoxModel);
	}
	
	public void clearData() {
		houseNumberField.setText("");
		houseThingTextArea.setText("");
		clientNumberTextField.setText("");
		clientNameTextField.setText("");
		clientIdTextField.setText("");
		clientGenderMaleRadioButton.setSelected(true);
		clientGenderFemaleRadioButton.setSelected(false);
		int count = dataModel.getRowCount();
		for (int index = count - 1; index >= 0; index--) {
			dataModel.removeRow(index);
		}
	}
}