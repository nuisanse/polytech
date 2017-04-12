package IHM;

import javax.swing.table.AbstractTableModel;

class Modele extends AbstractTableModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object[][] data;
    private String[] title;

    public Modele(Object[][] data, String[] title){
       this.data = data;
       this.title = title;
    }
  
    public Class getColumnClass(int column)
    {
        return getValueAt(0, column).getClass();
    }

    public int getColumnCount() {
       return this.title.length;
    }

    public int getRowCount() {
       return this.data.length; 
    }

    public Object getValueAt(int row, int col) {
       return this.data[row][col];
    }
}